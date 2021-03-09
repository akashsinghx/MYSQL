package com.ltts.dao;

import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ltts.configuration.MyConnection;
import com.ltts.model.Player;

public class PlayerDao {
	public List<Player> getAllPlayers()
	{
		List<Player> li= new ArrayList<Player>();
		return li;
	}
	public Player getPlayerById(int id)
	{
		Player p=new Player();
		return p;
	}
	
	public boolean insertPlayer(Player p) throws Exception
	{
		Connection c= MyConnection.getConnection();
		PreparedStatement ps= c.prepareStatement("insert into player values(?,?,?,?,?,?,?,?,?)");
		ps.setInt(1, p.getPlayer_id());
		ps.setString(2, p.getName());
		ps.setDate(3,(Date) p.getDateOfBirth());
		ps.setString(4, p.getNationality());
		ps.setString(5, p.getSkills());
		ps.setInt(6, p.getRuns());
		ps.setInt(7, p.getWickets());
		ps.setInt(8, p.getNumber_of_matches());
		ps.setInt(9, p.getTeam_id());
		return ps.execute();
	}
	public void getAll(String name) throws Exception
	{
		Connection c= MyConnection.getConnection();
		PreparedStatement ps=c.prepareStatement("Select p.name,t.teamname,t.coachname,TIMESTAMPDIFF(YEAR, dateOfBirth, CURDATE()) AS age from player as p inner join team as t on p.team_id=t.team_id where p.name=?");
		ps.setString(1, name);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			String name1=rs.getNString(1);
			String n=rs.getString(2);
			String cn=rs.getString(3);
			String dob=rs.getString(4);
			System.out.println("Player Name: "+name1+" Team Name: "+n+" Coach Name: "+cn+" Age: "+dob);
			
		}
	}

	public boolean updatePlayer(int id,String name) throws Exception
	{
		Connection c= MyConnection.getConnection();
		PreparedStatement ps= c.prepareStatement("UPDATE player SET name=? WHERE player_id=?");
		ps.setString(1, name);
		ps.setInt(2, id);
		System.out.println("Data Updated Succesfully");
		return ps.execute();
	}
	
	public void showPlayer() throws Exception
	{
		Connection c= MyConnection.getConnection();
		PreparedStatement ps=c.prepareStatement("Select * from player;");
		ps.execute();
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDate(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getInt(6)+" "+rs.getInt(7)+" "+rs.getInt(8)+" "+rs.getInt(9));
			
		}
	}

}