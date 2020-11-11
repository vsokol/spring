package store.sokolov.springboot;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
//    @Before(value = "@annotation(LogParamsAndResults)",
//            argNames = "name")
    @Before("@annotation(LogParamsAndResults) && args(name)")
    public void loggingRequestParams(String name) {
        System.out.println("name = " + name);
    }

    @AfterReturning(pointcut = "@annotation(LogParamsAndResults)",
            returning = "returnValue")
    public void loggingResponse(Object returnValue) {
        if (returnValue == null) {
            return;
        }
        if (returnValue instanceof Greeting) {
            System.out.println(((Greeting)returnValue).toString());
        }
    }
}
