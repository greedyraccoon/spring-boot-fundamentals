package com.raccon.firstwebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to first project ";
    }

    @RequestMapping("/Check")
    public int kaboom(){
        return 10*15 ;
    }

    @RequestMapping("/About")
    public String about(){
        return "Just Surviving lah " ;
    }

}
