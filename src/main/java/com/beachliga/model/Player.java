package com.beachliga.model;

import javax.persistence.Entity;

import com.beachliga.abstraction.User;

@Entity
public class Player extends User {
	private Integer totalGenderPoints;
	private Integer totalMixedPoints;
	//private Map<String, Integer> classificationList;
	
	public Player(){}

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
}
