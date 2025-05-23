package customer.products_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, CI/CD!";
    }

    @GetMapping("/test")
    public String test() {
        return "Test3, CI/CD!";
    }
}
