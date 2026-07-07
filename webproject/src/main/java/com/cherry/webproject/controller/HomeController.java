package com.cherry.webproject.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet () {
        return "Welcome To Cherry Town";
    }
        @RequestMapping("/about")       // WE CAN SET ONE KIND OF LINKING
    public String about () {
        return "Am Cherry";
    }

}
