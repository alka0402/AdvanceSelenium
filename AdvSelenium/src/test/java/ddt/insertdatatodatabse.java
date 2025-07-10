package ddt;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


public class insertdatatodatabse {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Driver driverRef = new Driver();
		
		DriverManager.registerDriver(driverRef);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advanceselenium","root","Tiger");
		Statement state=conn.createStatement();
		String query=" insert into selenium(first_name,last_name,address)values('ram','sam','goa')";
		int result=state.executeUpdate(query);
		if(result==1) {
			System.out.println("inserted");
		}
		else {
			System.out.println("not inserted");
		}
		conn.close();

	}

}
