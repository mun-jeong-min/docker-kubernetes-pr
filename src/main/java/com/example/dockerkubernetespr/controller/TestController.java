package com.example.dockerkubernetespr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("liver")
public class TestController {
    @GetMapping
    public String test() {
        return "리버풀 화이팅!!";
    }
}
