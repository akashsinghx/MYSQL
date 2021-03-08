package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.Statement;

public class DemoPrepared {
	
		public static void main(String[] args)throws Exception {
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			PreparedStatement ps=c.prepareStatement("selct * from customer");
			ResultSet rs=ps.executeQuery();
			System.out.println("");
			
			//Statement s=c.createStatement();
	}

}
