package com.beachliga.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beachliga.model.Tournament;
import com.beachliga.service.TournamentService;

@Controller
public class TournamentController {
	
	@Autowired
	private TournamentService tournamentService;
    
	@RequestMapping(value="/tournaments", method=RequestMethod.GET)
    public String showTournamentList(Model model) {
		model.addAttribute("tournamentList", tournamentService.getAllTournaments());
        return "tournaments_all";
    }
	
	@RequestMapping(value="/tournaments/add", method=RequestMethod.GET)
    public String addTournament(Model model) {
        return "tournaments_add";
    }
    
	@RequestMapping(value="/tournaments/{id}", method=RequestMethod.GET)
    public Tournament showTournamentById(@PathVariable String id) {
    	return tournamentService.getTournamentById(Integer.parseInt(id));
    }
	
	@RequestMapping(value="/tournaments", method=RequestMethod.POST)
	public void addTournament(@RequestBody Tournament tournament){
		tournamentService.addTournament(tournament);
	}
	
	@RequestMapping(value="/tournaments/{id}", method=RequestMethod.PUT)
	public void updateTournament(@RequestBody Tournament tournament, @PathVariable String id){
		tournamentService.updateTournament(Integer.parseInt(id), tournament);
	}
	
	@RequestMapping(value="/tournaments/{id}", method=RequestMethod.DELETE)
	public void deleteTournament(@PathVariable String id){
		tournamentService.deleteTournament(Integer.parseInt(id));
	}
}
