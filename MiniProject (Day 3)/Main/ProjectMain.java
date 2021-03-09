package com.ltts.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Date;

import com.ltts.dao.PlayerDao;
import com.ltts.dao.TeamDao;
import com.ltts.model.Player;
import com.ltts.model.Team;
public class ProjectMain {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Choice"); 
		System.out.println("1. Insert Data"); 
		System.out.println("2. Search Data"); 
		System.out.println("3. Update Data"); 
		System.out.println("4. View all the Players"); 
		System.out.println("5. View Players"); 
		int n= Integer.parseInt(br.readLine());
		if(n==1)
		{
			System.out.println("Enter the Team Id: "); 
			int tid=Integer.parseInt(br.readLine());
			System.out.println("Enter the Team Name: ");
		    String tname=br.readLine();
		    System.out.println("Enter the Owner Name: ");
		    String towner=br.readLine();
		    System.out.println("Enter the Coach Name: ");
		    String tcoach=br.readLine();
		    Team t= new Team(tid,tname,towner,tcoach);
		    TeamDao td=new TeamDao();
		    td.insertTeam(t);
			


			System.out.println("Enter the Player Id: "); 
			int pid=Integer.parseInt(br.readLine());
			System.out.println("Enter the Player Name: ");
		    String pname=br.readLine();
			System.out.println("Enter the Date of Birth: ");
		    Date pdate=Date.valueOf(br.readLine());
		    System.out.println("Enter the Player Nationality: ");
		    String pnation=br.readLine();
		    System.out.println("Enter the Player Skills: ");
		    String pskills=br.readLine();
		    System.out.println("Enter the Player runs: ");
		    int pruns=Integer.parseInt(br.readLine());
		    System.out.println("Enter the Player Wickets: ");
		    int pwic=Integer.parseInt(br.readLine());
		    System.out.println("Enter the Player Number of Matches: ");
		    int pnum=Integer.parseInt(br.readLine());
		    System.out.println("Enter Player Team Id: ");
		    int pteam=Integer.parseInt(br.readLine());
		    
		    Player p=new Player(pid,pname,pdate,pnation,pskills,pruns,pwic,pnum,pteam);
		    PlayerDao pd=new PlayerDao();
		    pd.insertPlayer(p);
		}
		else if(n==2)
		{
			System.out.println("Enter the Player Name: "); 
			String name=br.readLine();
			PlayerDao pd=new PlayerDao();
		    pd.getAll(name);
		}
		else if(n==3)
		{
			System.out.println("Enter table to update:");
			System.out.println("1.Team 2.Player");
			int u=Integer.parseInt(br.readLine());
		    if(u==1)
		    {
		    	System.out.println("Enter Team ID: ");
		    	int id=Integer.parseInt(br.readLine());
		    	System.out.println("Enter new Team Name: ");
		    	String name=br.readLine();
				TeamDao pd=new TeamDao();
			    pd.updateTeam(id,name);
		    }
		    else if(u==2)		
		    {
		    	System.out.println("Enter Player ID: ");
		    	int id=Integer.parseInt(br.readLine());
		    	System.out.println("Enter new Player Name: ");
		    	String name=br.readLine();
				PlayerDao pd=new PlayerDao();
			    pd.updatePlayer(id,name);
		    }
		}
		else if(n==4)
		{
			PlayerDao pd=new PlayerDao();
		    pd.showPlayer();
		}
		else if(n==5)
		{
			System.out.println("1. View Players based on Team");
			System.out.println("2. View Players based on Skills & Team");
			int v=Integer.parseInt(br.readLine());
			if(v==1)
			{
				System.out.println("Enter Team Name: ");
				String tname=br.readLine();
				TeamDao pd=new TeamDao();
			    pd.teamPlayer(tname);
			}
			else if(v==2)
			{
				System.out.println("Enter Team Name: ");
				String tname=br.readLine();
				System.out.println("Enter Team Skill: ");
				String tskill=br.readLine();
				TeamDao pd=new TeamDao();
			    pd.skillPlayer(tname,tskill);
			}

		}


	}
}