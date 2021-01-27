package com.Promt.schedule.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String index(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("title", name);
        return "index";
    }

    @GetMapping("/about")
    public String schedule(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("title", name);
        return "about";
    }

}