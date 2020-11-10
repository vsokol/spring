package store.sokolov.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController implements IGreetingController {
    final private static String template = "Hello, %s!";
    final private AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    @LogParams
    @Override
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        Greeting greeting = new Greeting(counter.incrementAndGet(), String.format(template, name));
        return greeting;
    }
}
