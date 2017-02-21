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
	
	
/*	used only for testing
 * 
 * private List<Tournament> tournaments = new ArrayList<>(Arrays.asList(
			new Tournament(1, "first", "Valencia"),
			new Tournament(2, "second", "Alicante")
			));*/
	
	public List<Tournament> getAllTournaments(){
		List<Tournament> tournamentList = new ArrayList<Tournament>();
		tournamentRepository.findAll().forEach(tournamentList::add);
		
		return tournamentList;
	}
	
	public Tournament getTournamentById(Integer id){
		return tournamentRepository.findOne(id);
	}
	
	public void addTournament(Tournament tournament){
		tournamentRepository.save(tournament);
	}
	
	public void updateTournament(Integer id, Tournament tournament){
		tournamentRepository.save(tournament);
	}

	public void deleteTournament(Integer id) {
		tournamentRepository.delete(id);
	}
	
}
