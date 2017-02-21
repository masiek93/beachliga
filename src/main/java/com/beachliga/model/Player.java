package com.beachliga.model;

import java.time.LocalDateTime;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {
	@Id
	private Integer id;
	private String name;
	private String lastName;
	private String email;
	private Integer phoneNumber;
	private String homeCity;
	private LocalDateTime joinDate;
	private Integer totalGenderPoints;
	private Integer totalMixedPoints;
	//private Map<String, Integer> classificationList;
	
	public Player(){}
	
	public Player(Integer id, String name, String lastName) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}

	public Player(String name, String lastName, String email, Integer phoneNumber, String homeCity, LocalDateTime joinDate){
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.homeCity = homeCity;
		this.joinDate = joinDate;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHomeCity() {
		return homeCity;
	}

	public void setHomeCity(String homeCity) {
		this.homeCity = homeCity;
	}

	public LocalDateTime getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDateTime joinDate) {
		this.joinDate = joinDate;
	}

	public Integer getTotalGenderPoints() {
		return totalGenderPoints;
	}

	public void setTotalGenderPoints(Integer totalGenderPoints) {
		this.totalGenderPoints = totalGenderPoints;
	}

	public Integer getTotalMixedPoints() {
		return totalMixedPoints;
	}

	public void setTotalMixedPoints(Integer totalMixedPoints) {
		this.totalMixedPoints = totalMixedPoints;
	}

/*	public Map<String, Integer> getClassificationList() {
		return classificationList;
	}

	public void setClassificationList(Map<String, Integer> classificationList) {
		this.classificationList = classificationList;
	}
	*/
	
}
