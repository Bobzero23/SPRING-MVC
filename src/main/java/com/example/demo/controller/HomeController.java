package com.example.demo.controller;

/*imports*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
/*controller class*/
public class HomeController {

    @RequestMapping(value = {"", "/", "home"})
    /*controller method*/
    public String displayHomePage(Model model){
        model.addAttribute("username", "Bobzero");
        return "home.html";
    }

}
