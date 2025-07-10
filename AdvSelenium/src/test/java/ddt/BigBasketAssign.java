package ddt;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BigBasketAssign {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zeptonow.com/");
		Thread.sleep(2000);
//		Set<String> windowid = driver.getWindowHandles();
//		Iterator<String> it = windowid.iterator();
//		while (it.hasNext()) {
//			String win =  it.next();
//			driver.switchTo().window(win);
//			@Nullable
//			String title = driver.getTitle();
//			if (title.contains(""))
//			
//		}
		WebElement search = driver.findElement(By.xpath("//span[@data-testid='searchBar']"));
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.elementToBeClickable(search));
		search.click();
		
		Thread.sleep(2000);
		WebElement s1 = driver.findElement(By.xpath("//input[@id='«r5i»--input']"));
		Set<String> windowid = driver.getWindowHandles();
		Iterator<String> it = windowid.iterator();
		while (it.hasNext()) {
		String win =  it.next();
			driver.switchTo().window(win);
			@Nullable
		String title = driver.getTitle();
			if (title.contains("search")) {
				break;}
			}
		s1.sendKeys("apple");
			
	
		
//		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].click();",search);
//		
//		
//		Thread.sleep(2000);
		//search.click();
		//driver.switchTo().frame(search);
		//search.sendKeys("Mangos",Keys.ENTER);
		

	}

}
