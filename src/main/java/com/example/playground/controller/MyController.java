package com.example.playground.controller;

import com.example.playground.dto.MyResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/test")
    public MyResponse test() {
        return MyResponse.builder()
                .isGood(true)
                .build();
    }
}
