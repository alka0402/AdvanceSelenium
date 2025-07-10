package ddt;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone" ,Keys.ENTER);
		List<WebElement> phone = driver.findElements(By.xpath("//div[text()='Apple iPhone 15 (Pink, 128 GB)']/..)"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR'] "));
		for(int i=0; i<phone.size();i++) {
		 
			
		}

	}

}
