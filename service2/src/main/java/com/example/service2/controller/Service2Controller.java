package com.example.service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {

    @RequestMapping("/service2")
    public String sayHello() {
        return "hello service 2!";
    }
}
