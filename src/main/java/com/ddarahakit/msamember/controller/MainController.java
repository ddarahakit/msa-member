package com.ddarahakit.msamember.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MainController {
    @GetMapping("/test")
    public String test(){
        return "cicd";
    }
}
