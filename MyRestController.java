package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api")
public class MyRestController {

    @GetMapping("/blog/entries")
    public String Webseite() {
        return "Blog Webseite";
    }
}
