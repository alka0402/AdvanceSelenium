package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class propertiesfile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
	   FileInputStream fis=new FileInputStream("C:\\Users\\v-alkaasati\\Documents\\property.properties");
	   Properties prop = new Properties();
	   prop.load(fis);
	String Browser = prop.getProperty("Browser");
	WebDriver driver;
	if (Browser.equalsIgnoreCase("Chrome")) {
		driver=new ChromeDriver();
		
	}
	else if 
		
	 (Browser.equalsIgnoreCase("Edge")) {
		driver=new EdgeDriver();
		
	}
	else if(Browser.equalsIgnoreCase("Firefox")) {
		driver=new FirefoxDriver();
		
	}
	else {
		driver=new ChromeDriver();
	}
	String url = prop.getProperty("Url");
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	String username = prop.getProperty("UserName");
	String password=prop.getProperty("PassWord");
	driver.findElement(By.name("user_name")).sendKeys(username);
	driver.findElement(By.name("user_password")).sendKeys(password);
	driver.findElement(By.id("submitButton")).click();

	}

}
