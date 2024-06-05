package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class DemoController {
    @GetMapping
    public String index(Model model) {
        model.addAttribute("pageTitle", " Spring!");
        model.addAttribute("languages", List.of("Java", "C#", "C++"));

        model.addAttribute("username", " Katya Rotar");

        Map<String, String> personalInfo = new HashMap<>();
        personalInfo.put("age", "18");
        personalInfo.put("occupation", "Developer");
        personalInfo.put("location", "Ukraine");
        model.addAttribute("personalInfo", personalInfo);

        Product product = new Product("Laptop", 870.60, "Electronics");
        model.addAttribute("product", product);

        model.addAttribute("additionalValue", 100.0);
        model.addAttribute("farewell", "Goodbye");
        return "index";
    }
}