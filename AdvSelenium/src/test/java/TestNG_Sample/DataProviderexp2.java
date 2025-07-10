package TestNG_Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Utilies.File_Utilities;
import Generic_Utilies.WebDriver_Utilities;
import POM_repo.CreateContactLookUp;
import POM_repo.CreatecontactPage;
import POM_repo.HomePage;
import POM_repo.LoginPage;

public class DataProviderexp2 {
	@Test (dataProvider = "getData")
	public void createContact(String firstName,String lastname) throws Throwable {
		WebDriver_Utilities wu=new WebDriver_Utilities();
File_Utilities file=new File_Utilities();
		
		String url = file.getKeyAndValue("url");
		String username = file.getKeyAndValue("username");
		String pass = file.getKeyAndValue("password");
		String browser = file.getKeyAndValue("browser");
		WebDriver driver;
		if (browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		 driver.get(url);
		 wu.maxmizewindow(driver);
			wu.implicitwait(driver);
	        LoginPage log = new LoginPage(driver);
	        log.loginToPage(username, pass);
	        HomePage hp=new HomePage(driver);
	        hp.clickToContact();
	        CreateContactLookUp ccl=new CreateContactLookUp(driver);
	        ccl.getCreateContactLookupLink();
	        CreatecontactPage ccp=new CreatecontactPage(driver);
	        
	     ccp.Firstname(firstName);
	     ccp.Lastname(lastname);
	     ccp.getSaveButton().click();
		
		
	}




	
	
	

}
