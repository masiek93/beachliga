package com.beachliga.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tournaments")
public class TournamentController {
    
    public String showTournamentList() {
    	//TODO
        return String.format("Beach Liga - wanna play?");
    }
    
    @RequestMapping("/id")
    public String showTournamentById(int id) {
    	//TODO
    	return "test";
    }
}
