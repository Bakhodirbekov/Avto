package com.company.Avto.Conntrolers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Bolgcontroller {

    @GetMapping("/Home")
    public String blogMain(Model model) {
        model.addAttribute("title", "index2");
        return "blog-main";
    }

    @GetMapping("/index2")
    public String index2(Model model) {
        model.addAttribute("title", "index2");
        return "index2";
    }
    @GetMapping("/registor-save")
    public String registro(Model model) {
        model.addAttribute("title", "registor-save");
        return "registor-save";
    }
    @GetMapping("/Rental_car")
    public String Rental(Model model) {
        model.addAttribute("title", "Rental_car");
        return "pay";
    }
    @GetMapping("/sell_car")
    public String sell(Model model) {
        model.addAttribute("title", "sell_car");
        return "pay";
    }
    @GetMapping("/pay")
    public String BlogMain(Model model) {
        model.addAttribute("title", "pay");
        return "pay";
    }
}