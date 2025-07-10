package POM_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CreateContactValidation {
	public CreateContactValidation (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void CreateConValidation (WebDriver driver ,String expData){
	 String actdata=driver.findElement(By.xpath("//span[@id='dtlview_First Name']")).getText();
     Assert.assertEquals(actdata,expData,"contact is not created" );
     System.out.println("contact is created");
     
//       if(actdata.equals(expData)) {
//       	System.out.println("contact is created");
//       }
//       else {
//       	System.out.println("contact is not created");
//       }
     }
	
}
