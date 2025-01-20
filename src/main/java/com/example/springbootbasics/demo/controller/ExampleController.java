package com.example.springbootbasics.demo.controller;

import com.example.springbootbasics.demo.config.Zorro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @Autowired
    @Qualifier("test")
    private Zorro zorro;


    @Autowired
    @Qualifier(value = "nish-45")
    public Integer x;

    @GetMapping("/rrr")
    public String explain() {
        return zorro.doSomeShit();
    }

    @GetMapping("/we")
    public Integer x1() {
        return x;
    }
}
