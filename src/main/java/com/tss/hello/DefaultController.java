package com.tss.hello;
/**
 * @author huzaifa bhavnagri
 */
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class DefaultController {
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello World, Spring Boot!!";
    }
}
