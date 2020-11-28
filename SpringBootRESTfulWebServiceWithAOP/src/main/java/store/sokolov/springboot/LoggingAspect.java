package store.sokolov.springboot;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("@annotation(LogParamsAndResults) && args(name)")
    public void loggingRequestParams(String name) {
        logger.info("Обработка перед вызовом методов отмеченных аннотацией @LogParamsAndResults");
        logger.info("Входной параметра name = {}", name);
    }

    @AfterReturning(pointcut = "@annotation(LogParamsAndResults)",
            returning = "returnValue")
    public void loggingResponse(Object returnValue) {
        logger.info("Постобработка вызовом методов отмеченных аннотацией @LogParamsAndResults");
        if (returnValue == null) {
            return;
        }
        if (returnValue instanceof Greeting) {
            logger.info("Метод вернул значение = {}", ((Greeting)returnValue).toString());
        }
    }
}
