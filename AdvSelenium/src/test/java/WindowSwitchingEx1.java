import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitchingEx1 {

		// Switching Window
		// * Switching windows by using id----->only 2  windows
		// * Switching windows by using Title---->multiple windows
		public static void main(String[] args) throws Throwable {

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);
			driver.findElement(By.xpath("(//div[@class='_4WELSP'])[1]")).click();

			String mainId = driver.getWindowHandle();// win1
			System.out.println(mainId);
			
			Thread.sleep(1000);
			Set<String> allWins = driver.getWindowHandles();// win1, win2
			System.out.println(allWins);

			for (String win : allWins)
			{
				if (!mainId.equals(win))
				{
					driver.switchTo().window(win);
				}

			}
			String price = driver.findElement(By.xpath("//div[@class='Nx9bqj CxhGGd']")).getText();
			System.out.println(price);
		}
	}


