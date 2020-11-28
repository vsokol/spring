package store.sokolov.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private Logger logger = LoggerFactory.getLogger(GreetingController.class);
    final private static String template = "Hello, %s!";
    final private AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    @LogParamsAndResults
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        logger.info(String.format(template, name));
        Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(template, name));
        return greeting;
    }
}
