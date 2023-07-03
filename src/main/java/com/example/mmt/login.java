package com.example.mmt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class login {
    @GetMapping("/login")
    public String getData(){
        return "This is Login Page !!!";
    }

}