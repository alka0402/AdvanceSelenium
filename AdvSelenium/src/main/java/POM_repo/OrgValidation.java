package POM_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OrgValidation {
	public OrgValidation(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void orgCreationValidation(WebDriver driver, String expdata) {
		 String actdata=driver.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();
		 Assert.assertEquals(actdata,expdata,"org is not created" );
	     System.out.println("org is created");
//	     if(actdata.equals(expdata)) {
//	     	System.out.println("org is created");
//	     }
//	     else {
//	     	System.out.println("org is not created");
//	     }	
		
	}


}
