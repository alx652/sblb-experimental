package org.alex.me.hello2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2Controller {  

	@GetMapping("/greet")
	public String sayHello2() {
        return "hello2 ...";
    }
}