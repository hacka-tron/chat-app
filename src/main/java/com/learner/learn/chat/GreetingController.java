package com.learner.learn.chat;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class GreetingController {
    @RequestMapping("/greeting")
    public String requestMethodName() {
        return "Hello Server :D";
    }
    
    
}
