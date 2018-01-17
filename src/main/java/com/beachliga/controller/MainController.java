package com.beachliga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String home() {
        return "index";
    }
    
    @RequestMapping(value="/log_in", method=RequestMethod.GET)
    public String login() {
        return "log_in";
    }
    
    @RequestMapping(value="/log_out", method=RequestMethod.GET)
    public String logout() {
        return "index";
    }
    
    
    
}
