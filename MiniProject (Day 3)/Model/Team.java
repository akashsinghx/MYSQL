package com.ltts.model;

public class Team {
	private int team_id;
	private String teamname;
    private String ownername;
    private String coachname;
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Team(int team_id, String teamname, String ownername, String coachname) {
		super();
		this.team_id = team_id;
		this.teamname = teamname;
		this.ownername = ownername;
		this.coachname = coachname;
	}
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getCoachname() {
		return coachname;
	}
	public void setCoachname(String coachname) {
		this.coachname = coachname;
	}
	@Override
	public String toString() {
		return "Team [team_id=" + team_id + ", teamname=" + teamname + ", ownername=" + ownername + ", coachname="
				+ coachname + "]";
	}
    
    
}