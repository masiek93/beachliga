package com.beachliga.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Tournament {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String date;

	@OneToOne
	@JoinColumn(name = "address_id")
	private Address address;
	private LocalDateTime registrationDeadline;
	private Integer cost;
	private String drawType;
	private String specialInformation;

	@ManyToOne
	private Organiser organiser;

	@OneToMany
	@JoinTable(name = "tournament_players")
	private ArrayList<Player> registredPlayers;

	/*
	 * TODO check how to represent colletions in hibernate 
	 * private HashMap<Integer, Player> finalClassification;
	 */
	public Tournament() {
	}

	// only for tests
	public Tournament(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public LocalDateTime getRegistrationDeadline() {
		return registrationDeadline;
	}

	public void setRegistrationDeadline(LocalDateTime registrationDeadline) {
		this.registrationDeadline = registrationDeadline;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	public String getDrawType() {
		return drawType;
	}

	public void setDrawType(String drawType) {
		this.drawType = drawType;
	}

	public String getSpecialInformation() {
		return specialInformation;
	}

	public void setSpecialInformation(String specialInformation) {
		this.specialInformation = specialInformation;
	}

	public Organiser getOrganiser() {
		return organiser;
	}

	public void setOrganiser(Organiser organiser) {
		this.organiser = organiser;
	}

	public ArrayList<Player> getRegistredPlayers() {
		return registredPlayers;
	}

	public void setRegistredPlayers(ArrayList<Player> registredPlayers) {
		this.registredPlayers = registredPlayers;
	}

}
