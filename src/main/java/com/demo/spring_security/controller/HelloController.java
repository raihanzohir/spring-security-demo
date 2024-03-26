package com.demo.spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("spring-security/demo")
public class HelloController {

    @GetMapping("user/hello")
    public String helloUser() {
        return "Hello User";
    }

    @GetMapping("admin/hello")
    public String helloAdmin() {
        return "Hello Admin";
    }
}
