package store.sokolov.springboot;

import org.springframework.web.bind.annotation.RequestParam;

public interface IGreetingController {
    Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name);
}
