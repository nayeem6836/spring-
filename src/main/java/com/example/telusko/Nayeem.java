package com.example.telusko;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Nayeem {
    @RequestMapping("/")
    public String asdf() {
        return "justin beiber";    }
}