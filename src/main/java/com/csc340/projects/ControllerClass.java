package com.csc340.projects;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerClass {

    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/about")
    public String about() {
        return "about";
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/profile")
    public String profile() {
        return "profile";
    }
}