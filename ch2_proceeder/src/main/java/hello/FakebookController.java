package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FakebookController {

    ///    private static final String template = "Hello, %s!";
    //    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/fakebook")
    public Fakebook fakebook(@RequestParam(value="name", defaultValue="World") String name) {
	//        return new Greeting(counter.incrementAndGet(),                            String.format(template, name));
	return new Fakebook(name,"about me","useless",42);
    }
}
