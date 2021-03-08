package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoMain {

	public static void main(String[] args)throws Exception {
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		Statement s=c.createStatement();
	//	s.execute("insert into customer values (1,'Arun','8787876765')");
	//	s.execute("Alter table customer add(caddress varchar(20)");
		s.executeUpdate("update customer SET cname='bala' where cno=1");
		System.out.println("after update");
		//ResultSet rs=s.executeQuery("select * from customer");
		//while(rs.next()) {
			//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));		
			
		}
	// 	c.close();

	}

}
