package com.beachliga.model;

import java.time.LocalDateTime;
import java.util.List;

public class Tournament {
	private int id;
	private String name;
	private String date;
	private String city;
	private String localization;
	private LocalDateTime registrationDeadline;
	private int cost;
	private String drawType;
	private String specialInformation;
	// private Organizator organizator;
	private List<Player> registredPlayers;
	private List<Player> finalClassification;
}
