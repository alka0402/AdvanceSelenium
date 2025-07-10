package POM_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class campValidation {
	public campValidation(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void campCreationValidation(WebDriver driver ,String expData){
	 String actdata=driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();
	 Assert.assertEquals(actdata,expData,"campaign is not created" );
     System.out.println("campaign is created");
     SoftAssert asser=new SoftAssert();
     //asser.assertEquals(actdata, expData,"campaign is not created");
     //System.out.println("campaign is created");
     asser.assertAll();
     
//     
//       if(actdata.equals(expData)) {
//       	System.out.println("camp is created");
//       }
//       else {
//       	System.out.println("camp is not created");
//       }
       }

}
