package com.company.Avto.Conntrolers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MeinController {

    @GetMapping("/")
    public String Home( Model model) {
        model.addAttribute("title", "Bosh Minu");
        return "Home";
    }

    @GetMapping("/about")
    public String about( Model model) {
        model.addAttribute("title", "Biz haqimizda");
        return "about";
    }

}