package com.beachliga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.beachliga.model.Tournament;
import com.beachliga.service.TournamentService;

@RestController
public class TournamentController {
	
	@Autowired
	private TournamentService tournamentService;
    
	@RequestMapping("/tournaments")
    public List<Tournament> showTournamentList() {
        return tournamentService.getAllTournaments();
    }
    
	@RequestMapping("/tournaments/{id}")
    public Tournament showTournamentById(@PathVariable String id) {
    	return tournamentService.getTournamentById(Integer.parseInt(id));
    }
	
	@RequestMapping(method=RequestMethod.POST, value="/tournaments")
	public void addTournament(@RequestBody Tournament tournament){
		tournamentService.addTournament(tournament);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/tournaments/{id}")
	public void updateTournament(@RequestBody Tournament tournament, @PathVariable String id){
		tournamentService.updateTournament(Integer.parseInt(id), tournament);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/tournaments/{id}")
	public void deleteTournament(@PathVariable String id){
		tournamentService.deleteTournament(Integer.parseInt(id));
	}
}
