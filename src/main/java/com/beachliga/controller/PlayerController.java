package com.beachliga.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.beachliga.model.Player;
import com.beachliga.service.PlayerService;

@RestController
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;
    
	@RequestMapping("/players")
    public List<Player> showPlayerList() {
        return playerService.getAllPlayers();
    }
    
	@RequestMapping("/players/{id}")
    public Player showPlayerById(@PathVariable String id) {
    	return playerService.getPlayerById(Integer.parseInt(id));
    }
	
	@RequestMapping(method=RequestMethod.POST, value="/players")
	public void addPlayer(@RequestBody Player player){
		playerService.addPlayer(player);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/players/{id}")
	public void updatePlayer(@RequestBody Player player, @PathVariable String id){
		playerService.updatePlayer(Integer.parseInt(id), player);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/players/{id}")
	public void deletePlayer(@PathVariable String id){
		playerService.deletePlayer(Integer.parseInt(id));
	}
}
