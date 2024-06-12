package com.example.jenkins.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String main(){
        return "test!!!";
    }

    @GetMapping("/a")
    public String a(){
        return "a!";
    }

}
