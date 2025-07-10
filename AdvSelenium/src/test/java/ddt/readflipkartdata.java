package ddt;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class readflipkartdata {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		File file = new File("./src/test/resources/json1.json");
		ObjectMapper obj = new ObjectMapper();
		JsonNode read = obj.readTree(file);
		String browser = read.get("browser").asText();
		WebDriver driver;
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			
			}
		//driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iphone");
		

	}

}
