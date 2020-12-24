package com.chy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
    @RequestMapping("/hello")
    private String getHello(Model model) {

        model.addAttribute("msg", "hellomvc");

        return "hello";
    }
}
