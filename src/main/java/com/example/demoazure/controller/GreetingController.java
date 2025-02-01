package com.example.demoazure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/greeting")
public class GreetingController {

    @GetMapping
    public String greeting(@RequestParam Optional<String> name) {
        return String.format("Hello %s!", name.orElse("World"));
    }
}
