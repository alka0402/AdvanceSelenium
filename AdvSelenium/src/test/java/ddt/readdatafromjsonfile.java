package ddt;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class readdatafromjsonfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("./src/test/resources/json1.json");
		ObjectMapper obj = new ObjectMapper();
		JsonNode read = obj.readTree(file);
		String browser = read.get("browser").asText();
		String url = read.get("url").asText();
		String username = read.get("username").asText();
		String password=read.get("password").asText();
		WebDriver driver = null;
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			driver.get(url);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("submitButton")).click();
		
		

	}

}
