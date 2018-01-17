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
@Table(name="user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6931890028599918000L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id")
	private Long id;
	
	@Column(name = "name")
	@NotEmpty(message = "*Please provide your name")
	private String name;
	
	@Column(name = "last_name")
	@NotEmpty(message = "*Please provide your last name")
	private String lastName;
	
	@Email(message = "*Please provide a valid Email")
	@NotEmpty(message = "*Please provide an email")
	private String email;
	
	@Column(name = "password")
	@Length(min = 8, message = "*Your password must have at least 8 characters")
	@NotEmpty(message = "*Please provide your password")
	@Transient
	private String password;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;
	
	@Column(name = "active")
	private int active;
	
	private Integer phoneNumber;
	private String homeCity;
	private LocalDateTime joinDate;
	private Integer totalGenderPoints;
	private Integer totalMixedPoints;
	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Set<Role> getRoles() {
		return roles;
	}



	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}



	public int getActive() {
		return active;
	}



	public void setActive(int active) {
		this.active = active;
	}
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
