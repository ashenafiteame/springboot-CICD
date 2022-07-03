package com.example.springbootcicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home{
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to CICD ashu !";
    }

}
