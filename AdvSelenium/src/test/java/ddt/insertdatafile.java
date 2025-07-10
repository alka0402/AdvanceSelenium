package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class insertdatafile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileOutputStream fo=new FileOutputStream("C:\\Users\\v-alkaasati\\Documents\\property.properties");
		Properties pro=new Properties();
		pro.setProperty("Browser","Edge");
		pro.store(fo, "common data");
		System.out.println("inserted");
		FileInputStream fis=new FileInputStream("C:\\Users\\v-alkaasati\\Documents\\property.properties");
		pro.getProperty("Browser");
		
		

	}

}
