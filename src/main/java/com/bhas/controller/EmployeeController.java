
package com.bhas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{
    //test endPoint,
    @GetMapping
    public String greetMsg()
    {
        return "Welcome to the Peackock sanctuary,";
    }
}
