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
	private String city;
	private String localization; //to think about
	private LocalDateTime registrationDeadline;
	private Integer cost;
	private String drawType;
	private String specialInformation;
	private Organizer organizer;
	private List<Player> registredPlayers;
	private List<Player> finalClassification;
	
	public Tournament() {}
	
	//only for tests
	public Tournament(Integer id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Tournament(Integer id, String name, String date, String city, String localization,
			LocalDateTime registrationDeadline, Integer cost, String drawType, String specialInformation,
			Organizer organizer, List<Player> registredPlayers, List<Player> finalClassification) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.city = city;
		this.localization = localization;
		this.registrationDeadline = registrationDeadline;
		this.cost = cost;
		this.drawType = drawType;
		this.specialInformation = specialInformation;
		this.organizer = organizer;
		this.registredPlayers = registredPlayers;
		this.finalClassification = finalClassification;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLocalization() {
		return localization;
	}
	public void setLocalization(String localization) {
		this.localization = localization;
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
	public Organizer getOrganizer() {
		return organizer;
	}
	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
	}
	public List<Player> getRegistredPlayers() {
		return registredPlayers;
	}
	public void setRegistredPlayers(List<Player> registredPlayers) {
		this.registredPlayers = registredPlayers;
	}
	public List<Player> getFinalClassification() {
		return finalClassification;
	}
	public void setFinalClassification(List<Player> finalClassification) {
		this.finalClassification = finalClassification;
	}
	
}
