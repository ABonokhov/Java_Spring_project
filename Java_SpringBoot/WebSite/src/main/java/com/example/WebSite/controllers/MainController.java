package com.example.WebSite.controllers;

import com.example.WebSite.models.Consultation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

   /* @Autowired
    private PostRepository postRepository; */

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home"; //вызываем html шаблон
    }

    @GetMapping("/consultation")
    public String Consult(Model model) {
        model.addAttribute("consultation", "Онлайн консультация");
        return "consultation";
    }


    @PostMapping("/consultation") //получение данных из формы
    public String Consult(@RequestParam String name, @RequestParam String phone, @RequestParam String message, Model model) {
        Consultation consult = new Consultation(name, phone, message); // для работы с базой данных
        return "Consultation";
    }

}