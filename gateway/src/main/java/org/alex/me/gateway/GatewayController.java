package org.alex.me.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {  
       @GetMapping("/")
        public String gatewayHome() {
        return "Gateway home";
    }
	@GetMapping("/service-info/gateway/greet")
	public String sayHelloGateway() {
        return "hello gateway ...";
    }
}
