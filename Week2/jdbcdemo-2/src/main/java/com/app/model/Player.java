package com.app.model;

public class Player {

	private int player_id;
	private String player_name;
	private int team_id;
	private int player_age;
	private int state_id;
	private int jersey_no;
	private int manager_id;
	private int position_id;
	private String player_gender;
	private String dob;
	
	public Player() {
		
	}

	public Player(int player_id, String player_name, int team_id, int player_age, int state_id, int jersey_no,
		int manager_id, int position_id, String player_gender, String dob) {
		super();
		this.player_id = player_id;
		this.player_name = player_name;
		this.team_id = team_id;
		this.player_age = player_age;
		this.state_id = state_id;
		this.jersey_no = jersey_no;
		this.manager_id = manager_id;
		this.position_id = position_id;
		this.player_gender = player_gender;
		this.dob = dob;
	}

	public int getPlayer_id() {
		return player_id;
	}

	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}

	public String getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}

	public int getTeam_id() {
		return team_id;
	}

	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}

	public int getPlayer_age() {
		return player_age;
	}

	public void setPlayer_age(int player_age) {
		this.player_age = player_age;
	}

	public int getState_id() {
		return state_id;
	}

	public void setState_id(int state_id) {
		this.state_id = state_id;
	}

	public int getJersey_no() {
		return jersey_no;
	}

	public void setJersey_no(int jersey_no) {
		this.jersey_no = jersey_no;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getPosition_id() {
		return position_id;
	}

	public void setPosition_id(int position_id) {
		this.position_id = position_id;
	}

	public String getPlayer_gender() {
		return player_gender;
	}

	public void setPlayer_gender(String player_gender) {
		this.player_gender = player_gender;
	}
	
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Player [player_id=" + player_id + ", player_name=" + player_name + ", team_id=" + team_id
				+ ", player_age=" + player_age + ", state_id=" + state_id + ", jersey_no=" + jersey_no + ", manager_id="
				+ manager_id + ", position_id=" + position_id + ", player_gender=" + player_gender + ", dob=" + dob
				+ "]";
	}

	
	
	
	
	
	
}
