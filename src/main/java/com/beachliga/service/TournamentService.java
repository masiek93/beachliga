package com.beachliga.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beachliga.model.Tournament;
import com.beachliga.repository.TournamentRepository;

@Service
public class TournamentService {

	@Autowired
	private TournamentRepository tournamentRepository;
	
	
	private List<Tournament> tournaments = new ArrayList<>(Arrays.asList(
			new Tournament(1, "first", "Valencia"),
			new Tournament(2, "second", "Alicante")
			));
	
	public List<Tournament> getAllTournaments(){
		return tournaments;
	}
	
	public Tournament getTournamentById(Integer id){
		return tournaments.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTournament(Tournament tournament){
		tournaments.add(tournament);
	}
	
	public void updateTournament(Integer id, Tournament tournament){
		Tournament t;
		for(int i=0; i<tournaments.size(); i++){
			t = tournaments.get(i);
			if(t.getId().equals(id)){
				tournaments.set(i, tournament);
				return;
			}
		}
	}

	public void deleteTournament(Integer id) {
		tournaments.removeIf(t -> t.getId().equals(id));
	}
	
}
