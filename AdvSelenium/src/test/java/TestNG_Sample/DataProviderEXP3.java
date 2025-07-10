package TestNG_Sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Utilies.Excel_Utilities;

public class DataProviderEXP3 {
	@Test(dataProvider = "createContact")
	public void createContact1(String FirstName,String LastName) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://localhost:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
	driver.findElement(By.name("firstname")).sendKeys(FirstName);
	driver.findElement(By.name("lastname")).sendKeys(LastName);
	
	
	}
	@DataProvider
	public Object[][] createContact() throws Throwable{
		Excel_Utilities eutil=new Excel_Utilities();
		Object[][] data =eutil.readDataUsingDataProvider("contact");
		
		return data;
		
	}

}
