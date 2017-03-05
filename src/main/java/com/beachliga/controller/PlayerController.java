package com.beachliga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beachliga.model.Player;
import com.beachliga.service.PlayerService;

@Controller
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;
    
	@RequestMapping(value="/players", method=RequestMethod.GET)
    public String showPlayerList(Model model) {
		model.addAttribute("playerList", playerService.getAllPlayers());
        return "players_all";
    }
    
	@RequestMapping(value="/players/{id}", method=RequestMethod.GET)
    public Player showPlayerById(@PathVariable String id) {
    	return playerService.getPlayerById(Integer.parseInt(id));
    }
	
	@RequestMapping(value="/players", method=RequestMethod.POST)
	public void addPlayer(@RequestBody Player player){
		playerService.addPlayer(player);
	}
	
	@RequestMapping(value="/players/{id}", method=RequestMethod.PUT)
	public void updatePlayer(@RequestBody Player player, @PathVariable String id){
		playerService.updatePlayer(Integer.parseInt(id), player);
	}
	
	@RequestMapping(value="/players/{id}", method=RequestMethod.DELETE)
	public void deletePlayer(@PathVariable String id){
		playerService.deletePlayer(Integer.parseInt(id));
	}
}
