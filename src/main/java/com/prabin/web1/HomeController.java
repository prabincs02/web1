package com.prabin.web1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "hi im in home page";
    }

    @RequestMapping("about")
    public String about(){
        return "you are in about page";
    }
}
