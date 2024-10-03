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
    @GetMapping("/vieworder")
    public String vieworder() {
        return "vieworder";
    }
    @GetMapping("/unbroken")
    public String unbroken() {
        return "unbroken";
    }
    @GetMapping("/review")
    public String review() {
        return "review";
    }
    @GetMapping("/checkout")
    public String checkout() {
        return "checkout";
    }
    @GetMapping("/reviewsubmitted")
    public String reviewsubmitted() {
        return "reviewsubmitted";
    }
    @GetMapping("/thanksforyourorder")
    public String thanksforyourorder() {
        return "thanksforyourorder";
    }
    @GetMapping("/orderinfo")
    public String orderinfo() {
        return "orderinfo";
    }
    @GetMapping("/editprofile")
    public String editprofile() {
        return "editprofile";
    }
}
