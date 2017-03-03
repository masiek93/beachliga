package com.beachliga.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beachliga.dao.PlayerRepository;
import com.beachliga.model.Player;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository playerRepository;
	
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
