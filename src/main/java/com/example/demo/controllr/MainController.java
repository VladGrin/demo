package com.example.demo.controllr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String hello() {
        return "HELLO VOVA";
    }

    @GetMapping("/all")
    public String helloAll() {
        return "HELLO Everybody!!!";
    }

    @GetMapping("/bob")
    public String helloBob() {
        return "HELLO Bob!!!";
    }
}
