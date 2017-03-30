package com.beachliga.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String lastName;
	private String email;
	private Integer phoneNumber;
	private String homeCity;
	private LocalDateTime joinDate;
	private Integer totalGenderPoints;
	private Integer totalMixedPoints;
	//private Map<String, Integer> classificationList;
	@OneToMany
	@JoinTable(name = "user_tournament")
	/*												  
	 * TODO find how to give colum names to jointable 
		joinColumns="tournament_id", inverseJoinColumns="organiser_id"
	 */	
	private List<Tournament> organisedTournaments;
	
	public User(){}
	
	
	
	public User(User user) {
		super();
		this.id = user.id;
		this.name = user.name;
		this.lastName = user.lastName;
		this.email = user.email;
		this.phoneNumber = user.phoneNumber;
		this.homeCity = user.homeCity;
		this.joinDate = user.joinDate;
		this.totalGenderPoints = user.totalGenderPoints;
		this.totalMixedPoints = user.totalMixedPoints;
		this.organisedTournaments = user.organisedTournaments;
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public List<Tournament> getOrganisedTournaments() {
		return organisedTournaments;
	}
	public void setOrganisedTournaments(List<Tournament> organisedTournaments) {
		this.organisedTournaments = organisedTournaments;
	}
	
	
	
}
