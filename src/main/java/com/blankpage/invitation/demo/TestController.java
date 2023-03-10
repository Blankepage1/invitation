package com.blankpage.invitation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    TestRepository testRepository;

    @Value("${server.retry}")
    String name = "World";

    @GetMapping("/")
    public List<Test> fetch() {
        System.out.println("Hello " + name);
        return testRepository.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Test test) {
        testRepository.save(test);
    }
}
