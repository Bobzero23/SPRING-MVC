package com.example.website.controller;

/*imports*/
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
/*controller class*/
public class HomeController {

    @RequestMapping(value = {"", "/", "home"})
    /*controller method*/
    public String displayHomePage(){
        return "home.html";
    }

}
