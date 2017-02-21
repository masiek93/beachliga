package com.beachliga.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.beachliga.model.Player;

@Service
public class PlayerService {

	private List<Player> players = new ArrayList<>(Arrays.asList(
			new Player(1, "Manuel", "Schmidt"),
			new Player(2, "Junior", "Marim")
			));
	
	public List<Player> getAllPlayers(){
		return players;
	}
	
	public Player getPlayerById(Integer id){
		return players.stream().filter(p -> p.getId().equals(id)).findFirst().get();
	}
	
	public void addPlayer(Player player){
		players.add(player);
	}
	
	public void updatePlayer(Integer id, Player player){
		Player p;
		for(int i=0; i<players.size(); i++){
			p = players.get(i);
			if(p.getId().equals(id)){
				players.set(i, player);
				return;
			}
		}
	}

	public void deletePlayer(Integer id) {
		players.removeIf(p -> p.getId().equals(id));
	}
	

}
