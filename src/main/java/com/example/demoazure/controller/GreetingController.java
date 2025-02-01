package com.example.demoazure.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api/greeting")
public class GreetingController {

    @GetMapping
    public String greeting(@RequestParam Optional<String> name) {
        log.info("Greeting requested '{}'", name);
        return String.format("Hello %s!", name.orElse("World, from Azure!"));
    }
}
