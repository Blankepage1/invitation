package com.blankpage.invitation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.retry}")
    String name = "World";

    @GetMapping("/")
    public String hello() {
        System.out.println("Hello " + name);
        return "hello";
    }
}
