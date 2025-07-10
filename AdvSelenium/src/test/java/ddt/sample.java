package ddt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_repo.Login1;
import POM_repo.Login2;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
//		Login1 log=new Login1(driver);
//		log.loginpage("admin", "admin");
		Login2 lg=new Login2(driver);
		lg.loginToVtiger("admin", "admin");
		
		

	}

}
