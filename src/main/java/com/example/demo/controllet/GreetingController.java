package com.example.demo.controllet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/hi")
    String getHello(){
        return "<h1>HELLO</h1>";
        }
    }

