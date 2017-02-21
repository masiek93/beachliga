package com.beachliga.model;

import java.time.LocalDateTime;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="player")
public class Player {
	private int id;
	private String name;
	private String lastName;
	private String email;
	private int phoneNumber;
	private String homeCity;
	private LocalDateTime joinDate;
	private int totalGenderPoints;
	private int totalMixedPoints;
	private Map<String, Integer> classificationList;
	
	public Player(){
	}
	
	public Player(String name, String lastName, String email, int phoneNumber, String homeCity, LocalDateTime joinDate){
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.homeCity = homeCity;
		this.joinDate = joinDate;
	}
}
