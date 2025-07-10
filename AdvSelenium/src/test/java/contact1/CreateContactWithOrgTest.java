package contact1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Generic_Utilies.BaseClass;
import Generic_Utilies.Excel_Utilities;
import Generic_Utilies.File_Utilities;
import Generic_Utilies.WebDriver_Utilities;
import Generic_Utilies.java_utilities;
import POM_repo.CreateContactLookUp;
import POM_repo.CreateContactValidation;
import POM_repo.CreateOrgPage;
import POM_repo.CreatecontactPage;
import POM_repo.HomePage;
import POM_repo.LoginPage;
import POM_repo.OrgValidation;
import POM_repo.createOrgLookup;
import POM_repo.orgWindowSwitchImg;
@Test
public class CreateContactWithOrgTest extends BaseClass{
	public void createContactWithOrgTest() throws Throwable {
//		File_Utilities file=new File_Utilities();
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
//        LoginPage log=new LoginPage(driver);
//        log.loginToPage(username, password);
        HomePage hp=new HomePage(driver);
        hp.clickToOrzanization();
        createOrgLookup col=new createOrgLookup(driver);
        col.getOrgCreateLookupLink();
        java_utilities jutil=new java_utilities();
        int   rannum=jutil.getRandomNum();

        Excel_Utilities eutil=new Excel_Utilities();
       String cellvalue = eutil.getExcelData("org", 0, 0)+rannum;
       CreateOrgPage cop=new CreateOrgPage(driver);
      
       cop.orgName(cellvalue);
       String no = eutil.getExcelDatawithdataFormatter("org", 1, 0);
       cop.PhoneNo(no);
       String email = eutil.getExcelData("org", 2, 0);
       cop.emailid(email);
       cop.getSaveButton().click();
     OrgValidation ov = new OrgValidation(driver);
     ov.orgCreationValidation(driver, cellvalue);
     //--------------------------------------------------------------------
     hp.clickToContact();
     CreateContactLookUp ccl=new CreateContactLookUp(driver);
     ccl.getCreateContactLookupLink();
     
     int ran = jutil.getRandomNum();
     
     String firstName=eutil.getExcelData("contact", 0, 0)+ran;
        int ran1= jutil.getRandomNum();
      String lastname=eutil.getExcelData("contact", 1, 0)+ran1;

      CreatecontactPage ccp=new CreatecontactPage(driver);
     WebElement sal = ccp.Salutationtype();
  wutil.dropDownSelect(sal, "Mrs.");
  ccp.Firstname(firstName);
  ccp.Lastname(lastname);
 orgWindowSwitchImg osi = new orgWindowSwitchImg(driver);
 osi.orgLookupimg();
  wutil.windowSwitch(driver,"Accounts&action");
  osi.seachText(cellvalue);
  osi.enterorgNameInContact(driver, cellvalue);
  wutil.windowSwitch(driver, "Campaigns&action");
  ccp.getSaveButton().click();

 CreateContactValidation ccv=new CreateContactValidation(driver);
 ccv.CreateConValidation(driver,firstName);
 


}
}
