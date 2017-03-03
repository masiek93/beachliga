package com.beachliga.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import com.beachliga.abstraction.User;

@Entity
public class Organiser extends User {
	
	@OneToMany
	@JoinTable(name = "organiser_tournaments")
	/*												  
	 * TODO find how to give colum names to jointable 
		joinColumns="tournament_id", inverseJoinColumns="organiser_id"
	 */	
	private List<Tournament> organisedTournaments;

	public List<Tournament> getOrganisedTournaments() {
		return organisedTournaments;
	}

	public void setOrganisedTournaments(List<Tournament> organisedTournaments) {
		this.organisedTournaments = organisedTournaments;
	}

}
