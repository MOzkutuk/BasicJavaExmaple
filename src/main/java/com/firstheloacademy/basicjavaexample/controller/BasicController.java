package com.firstheloacademy.basicjavaexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/hey")
    public String Greetings(){

        return "hey there";
    }
}
