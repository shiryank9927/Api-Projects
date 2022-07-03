package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class greetingController {

    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    // /greeting?name=shiryank
    @GetMapping("/greeting")
    public greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name){
        return new greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
