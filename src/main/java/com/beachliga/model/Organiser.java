package com.beachliga.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import com.beachliga.abstraction.User;

@Entity
public class Organiser extends User {
	
	@OneToMany
	@JoinTable(name = "organiser_tournament")
	private ArrayList<Tournament> organisedTournaments;

	public ArrayList<Tournament> getOrganisedTournaments() {
		return organisedTournaments;
	}

	public void setOrganisedTournaments(ArrayList<Tournament> organisedTournaments) {
		this.organisedTournaments = organisedTournaments;
	}

}
