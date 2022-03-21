package com.sports.entity;

public class Player {

	private String playerName;
	private String playerRole;

	public Player() {
		
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerRole() {
		return playerRole;
	}

	public void setPlayerRole(String playerRole) {
		this.playerRole = playerRole;
	}

	public Player(String playerName, String playerRole) {
		super();
		this.playerName = playerName;
		this.playerRole = playerRole;
	}

}
