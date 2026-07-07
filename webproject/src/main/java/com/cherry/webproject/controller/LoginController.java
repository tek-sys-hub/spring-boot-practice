package com.cherry.webproject.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

    @RequestMapping("/login")    // WE CAN SET ONE KIND OF LINKING
    public String about () {
        return "Login Page";
    }

}
