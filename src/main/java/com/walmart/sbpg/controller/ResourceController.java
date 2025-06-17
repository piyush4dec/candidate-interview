package com.walmart.sbpg.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ResourceController {

    @GetMapping("/{name}")
    public String hello(@PathVariable("name") String name) {
        log.info("hello " + name);
        return String.format("Hello %s!", name);
    }

    @GetMapping("/")
    public String home() {
        return String.format("Welcome to Spring Boot Project!");
    }
}
