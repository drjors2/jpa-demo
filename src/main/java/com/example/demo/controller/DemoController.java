package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
    @GetMapping(value="/test")
    public String getMethaodName(@RequestParam String param) {
        return "test" ; 
    }
    
}
