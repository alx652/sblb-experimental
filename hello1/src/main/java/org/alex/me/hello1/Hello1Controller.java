package org.alex.me.hello1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello1Controller {  

	@GetMapping("/greet")
	public String sayHello1() {
        return "hello1 ...";
    }
}