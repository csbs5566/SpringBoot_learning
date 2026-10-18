package com.example.springboot.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", required = false, defaultValue = "World") String name

    ) {
        return "Hello, " + name;
    }

    @PostMapping("/hello")
    public Map<String, String> sayPostHello() {
//        return Map.of("POST", "Hello Post World");
        Map<String, String> response = new HashMap<>();
        response.put("GET", "Hello World");
        response.put("POST", "Hello POST World");
        return response;
    }

    @PostMapping("/hello/form")
    public String form(@RequestParam("name") String name) {
        return name + ", nice to meet you";
    }

    @PostMapping("/hello/json")
    public String sayHelloJson(@RequestBody Map<String, String> requestBody) {
        return requestBody.get("name") + ", nice to meet you";
//    @GetMapping("/hello")
//    public String sayHelloWithName(@RequestParam("name") String name) {
//        return "Hello " + name;
//    }
    }
    // 任务一(2)：纯字符串的 POST 接口
    @PostMapping("/hello/post-world")
    public String sayPostWorld() {
        return "Hello POST World";
    }
}

