package Campaign;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utilies.BaseClass;
import Generic_Utilies.Excel_Utilities;
import Generic_Utilies.File_Utilities;
import Generic_Utilies.WebDriver_Utilities;
import Generic_Utilies.java_utilities;
import POM_repo.CreateCampPage;
import POM_repo.CreateCampaignLookup;
import POM_repo.HomePage;
import POM_repo.LoginPage;
import POM_repo.campValidation;

//@Listeners(Generic_Utilies.ListenersImp.class)
@Test
public class CreateCampaignTest extends BaseClass {
	//polling this -->push1
	//pushback by test engg 1
	public void createCampaignTest() throws Throwable {
//	    File_Utilities file=new File_Utilities();
//		String url = file.getKeyAndValue("url");
//		String username = file.getKeyAndValue("username");
//		String password = file.getKeyAndValue("password");
//		String browser = file.getKeyAndValue("browser");
//		WebDriver driver;
//		if (browser.equalsIgnoreCase("chrome")) {
//			driver=new ChromeDriver();
//		}
//		else if (browser.equalsIgnoreCase("edge")) {
//			driver=new EdgeDriver();
//		}
//		else if (browser.equalsIgnoreCase("Firefox")) {
//			driver=new FirefoxDriver();
//		}
//		else {
//			driver=new ChromeDriver();
//		}

//		WebDriver_Utilities wutil=new WebDriver_Utilities();
//		wutil.maxmizewindow(driver);
//		wutil.implicitwait(driver);
//        driver.get(url);
//        LoginPage log = new LoginPage(driver);
//        log.loginToPage(username, password);
        HomePage hp=new HomePage(driver);
        hp.clickToCampaign();
        CreateCampaignLookup ccl=new CreateCampaignLookup(driver);
        ccl.getCreateLookupLink();
        java_utilities jutil=new java_utilities();
       int ran=jutil.getRandomNum();
        Excel_Utilities eutil=new Excel_Utilities();
        String cellvalue = eutil.getExcelData("camp", 1, 0);
        CreateCampPage ccp=new CreateCampPage(driver);
        ccp.getCampName(cellvalue);
        ccp.clicksaveButton();
        //Assert.fail("i AM failing the camp page");
        Thread.sleep(2000);
        campValidation cv=new campValidation(driver);
        cv.campCreationValidation(driver, cellvalue);
       // Assert.fail();
        //hp.clickTologout();
       
       
        Thread.sleep(5000);
        

	}
	 public void m2(){
     	System.out.println("Hellooo......................");
     }

}
