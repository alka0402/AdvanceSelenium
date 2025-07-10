package ddt;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetNameAndPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		Set<String> allwin = driver.getWindowHandles();
		Iterator<String> id = allwin.iterator();
		while (id.hasNext()) {
			String win =  id.next();
			driver.switchTo().window(win);
			@Nullable
			String title = driver.getTitle();
			if (title.contains("q=iphone")) {
				break;
			}
			
		}
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='cN1yYO']"));
		for(int i=0;i<name.size();i++) {
			System.out.println(name.get(i).getText());
			System.out.println(price.get(i).getText());
		}

	}

}
