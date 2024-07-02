package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
    @GetMapping("/gethello")
    public String sayhello(){
        return "HI";

    }
    @GetMapping("/findById/:id")
    public Employee {

    }
}
