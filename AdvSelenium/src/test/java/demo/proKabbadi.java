package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class proKabbadi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 driver.get("https://www.prokabaddi.com/");
 List<WebElement> allteam = driver.findElements(By.xpath("//div[@class='table standings-table']//div[@class='table-data team']//p[@class='name']"));
	for(WebElement at:allteam) {
		String team = at.getText();
		if(team.contains("Haryana Steelers")) {
			
		}
	}
	
	
	}

}
