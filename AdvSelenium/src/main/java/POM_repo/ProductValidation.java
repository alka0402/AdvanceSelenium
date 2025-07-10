package POM_repo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductValidation {
	public ProductValidation(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	public void ProductValidate(WebDriver driver,String expdata) {
		 
        String actdata=driver.findElement(By.xpath("//span[@id='dtlview_Product Name']")).getText();
        Assert.assertEquals(actdata,expdata,"product is not created" );
        System.out.println("product is created");
//        if(actdata.equals(expdata)) {
//        	System.out.println("product is created");
//        }
//        else {
//        	System.out.println("product is not created");
//        }
        }
       public void deleteValidate (WebDriver driver,String prodname) {
    	   List<WebElement> allproduct = driver.findElements(By.xpath("//a[@title='Products']"));
           boolean flag = false;
           
           for (WebElement prod:allproduct) {
        	   String actprd = prod.getText();
        	   if(actprd.contains(prodname)) {
        		   flag=true;
        		   break;
        	   }}
			if(flag) {
				System.out.println("prod is delete");
			}
			else {
				System.out.println("prod is not delete");
			}
       }
	}


