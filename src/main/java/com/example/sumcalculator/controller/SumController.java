package com.example.sumcalculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SumController {

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculateSum(@RequestParam(name = "num1", defaultValue = "0") int num1,
                               @RequestParam(name = "num2", defaultValue = "0") int num2,
                               Model model) {
        int result = num1 + num2;
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("result", result);
        return "index";
    }
}
