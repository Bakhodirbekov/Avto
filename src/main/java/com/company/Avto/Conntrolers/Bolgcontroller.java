package com.company.Avto.Conntrolers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Bolgcontroller {

    @GetMapping("/blog")
    public String blogMain( Model model) {
        return "blog-main";
    }
}
