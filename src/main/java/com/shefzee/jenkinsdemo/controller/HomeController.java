package com.shefzee.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getHello(){
        //test
        return "Hello world";

    }
}
