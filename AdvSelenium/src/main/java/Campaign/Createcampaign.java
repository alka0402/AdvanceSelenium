package Campaign;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Generic_Utilies.Excel_Utilities;
import Generic_Utilies.File_Utilities;
import Generic_Utilies.WebDriver_Utilities;
import Generic_Utilies.java_utilities;
import POM_repo.LoginPage;

public class Createcampaign {

	public static void main(String[] args) throws Throwable {
		File_Utilities file=new File_Utilities();
		String url = file.getKeyAndValue("url");
		String username = file.getKeyAndValue("username");
		String password = file.getKeyAndValue("password");
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

		WebDriver_Utilities wutil=new WebDriver_Utilities();
		wutil.maxmizewindow(driver);
		wutil.implicitwait(driver);
        driver.get(url);
        LoginPage log = new LoginPage(driver);
        log.getUserNameTextField().sendKeys(username);
        log.getPasswordTextField().sendKeys(password);
        log.getSubmitButton().click();
        driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']")).click();
        
        driver.findElement(By.name("Campaigns")).click();
        driver.findElement(By.xpath("//img[@title='Create Campaign...']")).click();

        java_utilities jutil=new java_utilities();
       int ran=jutil.getRandomNum();
        Excel_Utilities eutil=new Excel_Utilities();
        String cellvalue = eutil.getExcelData("camp", 1, 0);
        
       WebElement campname = driver.findElement(By.name("campaignname"));
      campname.sendKeys(cellvalue);
       
       driver.findElement(By.name("button")).click();
        Thread.sleep(2000);
      String actdata=driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();
      
      Thread.sleep(2000);
        if(actdata.equals(cellvalue)) {
        	System.out.println("camp is created");
        }
        else {
        	System.out.println("camp is not created");
        }
        driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
        driver.findElement(By.linkText("Sign Out")).click();
        Thread.sleep(5000);
        driver.quit();
	}




	}


