package com.lailson.dev.ms_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WellcomeController {

    @GetMapping("/wellcome")
    public String wellcome(){
        return "Hello World! I'm coding in Java";
    }

    @GetMapping("/soma/{num1}/{num2}")
    public Integer soma(@PathVariable int num1,@PathVariable int num2){
        return num1 + num2;
    }
}
