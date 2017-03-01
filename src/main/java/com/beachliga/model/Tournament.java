package com.beachliga.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Tournament {
	@Id
	private Integer id;
	private String name;
	private String date;
	//private Address address;
	private LocalDateTime registrationDeadline;
	private Integer cost;
	private String drawType;
	private String specialInformation;
	//private Organizer organizer;
	//private List<Player> registredPlayers;
	//private List<Player> finalClassification;
	
	public Tournament() {}
	
	//only for tests
	public Tournament(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	
}
