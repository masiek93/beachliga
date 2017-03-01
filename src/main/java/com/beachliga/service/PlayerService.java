package com.beachliga.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beachliga.model.Player;
import com.beachliga.repository.PlayerRepository;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository playerRepository;

/*	only for tests
 * 
 * private List<Player> players = new ArrayList<>(Arrays.asList(
			new Player(1, "Manuel", "Schmidt"),
			new Player(2, "Junior", "Marim")
			));
			
	remove it later		
	*/
	
	public List<Player> getAllPlayers(){
		List<Player> playerList = new ArrayList<Player>();
		playerRepository.findAll().forEach(playerList::add);
		return playerList;
	}
	
	public Player getPlayerById(Integer id){
		return playerRepository.findOne(id);
	}
	
	public void addPlayer(Player player){
		playerRepository.save(player);
	}
	
	public void updatePlayer(Integer id, Player player){
		playerRepository.save(player);
	}

	public void deletePlayer(Integer id) {
		playerRepository.delete(id);
	}
	

}
