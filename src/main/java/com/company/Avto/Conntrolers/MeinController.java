package com.company.Avto.Conntrolers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MeinController {

    @GetMapping("/")
    public String Home( Model model) {
        model.addAttribute("title", "Bosh Minu");
        return "Home";
    }

    @GetMapping("/Home")
    @RequestMapping(value = "/index2")
    public String index2( Model model) {
        model.addAttribute("title", "Biz haqimizda");
        return "index2";
    }

}