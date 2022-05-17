package com.ddarahakit.msamember.controller;


import com.ddarahakit.msamember.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MainController {
    @Autowired
    private MemberService memberService;
    @GetMapping("/test")
    public String test(){
        memberService.test();
        return "abcd";
    }
}
