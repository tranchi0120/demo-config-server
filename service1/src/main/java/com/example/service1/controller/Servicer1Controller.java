package com.example.service1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Servicer1Controller {


    @RequestMapping("/service1")
    public String sayHello() {
        return "hello service 1!";
    }
}
