package com.example.xxx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String displayName(){
        return "hello";
    }

    @PostMapping("/add")
    public String addName(){
        return "Happy new year";
    }
}


