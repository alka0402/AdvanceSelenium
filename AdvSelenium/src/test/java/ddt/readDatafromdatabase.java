package ddt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class readDatafromdatabase {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TrainerDetails","root","Tiger");
		Statement state = conn.createStatement();
		String selectquery = "select * from Trainers";
		ResultSet result = state.executeQuery(selectquery);
		while(result.next()) {
			System.out.println(result.getInt(1)+ " "+ result.getString(2)+" "+ result.getString(3)+" "+result.getString(4));
		}
		conn.close();

	}

}
