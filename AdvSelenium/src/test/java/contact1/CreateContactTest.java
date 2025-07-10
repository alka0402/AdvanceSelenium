package contact1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utilies.BaseClass;
import Generic_Utilies.Excel_Utilities;
import Generic_Utilies.File_Utilities;
import Generic_Utilies.WebDriver_Utilities;
import Generic_Utilies.java_utilities;
import POM_repo.CreateCampPage;
import POM_repo.CreateCampaignLookup;
import POM_repo.CreateContactLookUp;
import POM_repo.CreateContactValidation;
import POM_repo.CreatecontactPage;
import POM_repo.HomePage;
import POM_repo.LoginPage;
import POM_repo.campValidation;
@Test(groups = "SmokeTest")
//@Listeners(Generic_Utilies.ListenersImp.class)
public class CreateContactTest extends BaseClass{

	public void CreateContactTest() throws Throwable {
		// TODO Auto-generated method stub
//File_Utilities file=new File_Utilities();
//		
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
		WebDriver_Utilities wutil=new WebDriver_Utilities();
//		wutil.maxmizewindow(driver);
//		wutil.implicitwait(driver);
//        driver.get(url);
//        LoginPage log = new LoginPage(driver);
//        log.loginToPage(username, password);
        HomePage hp=new HomePage(driver);
        hp.clickToContact();
        CreateContactLookUp ccl=new CreateContactLookUp(driver);
        ccl.getCreateContactLookupLink();
        java_utilities jutil=new java_utilities();
        int ran = jutil.getRandomNum();
        Excel_Utilities eutil=new Excel_Utilities();
        String firstName=eutil.getExcelData("contact", 0, 0)+ran;
           int ran1= jutil.getRandomNum();
         String lastname=eutil.getExcelData("contact", 1, 0)+ran1;
         CreatecontactPage ccp=new CreatecontactPage(driver);
        WebElement sal = ccp.Salutationtype();
     wutil.dropDownSelect(sal, "Mrs.");
     ccp.Firstname(firstName);
     ccp.Lastname(lastname);
     ccp.getSaveButton().click();
    CreateContactValidation ccv=new CreateContactValidation(driver);
    ccv.CreateConValidation(driver,firstName);
	}
//-----------------------------------------------------------------------------
    
    public void createCampaignTest() throws Throwable {
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
    Thread.sleep(2000);
    campValidation cv=new campValidation(driver);
    cv.campCreationValidation(driver, cellvalue);}
   
   //---------------------------------------------------------------------------------
    public void m3() {
    	System.out.println("M3");
    }
    
    
    
    
	

}
