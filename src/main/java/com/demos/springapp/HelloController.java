package com.demos.springapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String home(){
        return "App03 Welcome's you to the 2023 Tech Exchange!";
    }
}
