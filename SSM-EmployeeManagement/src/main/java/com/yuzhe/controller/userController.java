package com.yuzhe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userController {

    @RequestMapping(path = "/test")
    public String index(Model model) {
        model.addAttribute("msg", "userController");
        return "test";
    }
}
