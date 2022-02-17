package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoginController {

    @RequestMapping("/admin/login")
    public String loginIn(){
        log.error("我说老易","123");
        return "/login/index";
    }
}
