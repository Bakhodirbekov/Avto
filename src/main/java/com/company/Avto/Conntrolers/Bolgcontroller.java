package com.company.Avto.Conntrolers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Bolgcontroller {

    @GetMapping("/index2")
    public String blogMain( Model model) {
        model.addAttribute("title","index1");
        return "blog-main";
    }
    @GetMapping("/index2")
    public String blogMain( Model model) {
        model.addAttribute("title","index1");
        return "blog-main";
    }
}
