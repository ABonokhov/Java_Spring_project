package com.example.WebSite.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DoctorsController {
    @GetMapping("/doctors")
    public String doctorsMain(Model model){
        return "doctorsPage";
    }
}
