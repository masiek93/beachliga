package com.beachliga.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Transient;

@Entity
@Table(name = "user")
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private Long id;
	
	@Column(name = "email")
	@Email(message = "*Please provide a valid Email")
	@NotEmpty(message = "*Please provide an email")
	private String email;
	
	@Column(name = "password")
	@Length(min = 5, message = "*Your password must have at least 5 characters")
	@NotEmpty(message = "*Please provide your password")
	@Transient
	private String password;
	
	@Column(name = "name")
	@NotEmpty(message = "*Please provide your name")
	private String name;
	
	@Column(name = "last_name")
	@NotEmpty(message = "*Please provide your last name")
	private String lastName;
	
	@Column(name = "active")
	private int active;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;
	
	/* Less important data */
	
	private Integer phoneNumber;
	private String homeCity;
	private LocalDateTime joinDate;
	private Integer totalGenderPoints;
	private Integer totalMixedPoints;
	//private Map<String, Integer> classificationList;
	@OneToMany
	@JoinTable(name = "user_tournament")
	/*												  
	 * TODO name columns in jointable 
		joinColumns="tournament_id", inverseJoinColumns="organiser_id"
	 */	
	private List<Tournament> organisedTournaments;
	
	public User(){}

	public User(String email, String password, String name, String lastName, int active, Set<Role> roles,
			Integer phoneNumber, String homeCity, LocalDateTime joinDate, Integer totalGenderPoints,
			Integer totalMixedPoints, List<Tournament> organisedTournaments) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.lastName = lastName;
		this.active = active;
		this.roles = roles;
		this.phoneNumber = phoneNumber;
		this.homeCity = homeCity;
		this.joinDate = joinDate;
		this.totalGenderPoints = totalGenderPoints;
		this.totalMixedPoints = totalMixedPoints;
		this.organisedTournaments = organisedTournaments;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
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
