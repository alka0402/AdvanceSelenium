package Product;

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
import POM_repo.CreateProductPage;
import POM_repo.HomePage;
import POM_repo.LoginPage;
import POM_repo.ProductLookupImg;
import POM_repo.ProductValidation;
@Test
@Listeners(Generic_Utilies.ListenersImp.class)
public class CreateProductTest extends BaseClass {

	public void CreateProductTest() throws Throwable {
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
        hp.clickToProduct();
        ProductLookupImg prodimg = new ProductLookupImg(driver);
        prodimg.clickProductlookupLink();
                java_utilities jutil=new java_utilities();
                int ran=jutil.getRandomNum();
                 Excel_Utilities eutil=new Excel_Utilities();
                 String cellvalue = eutil.getExcelData("sheet1", 0, 0)+ran;
                CreateProductPage createprod = new CreateProductPage(driver);
                
                createprod.productName(cellvalue);
                createprod.getSaveButton().click();
                Thread.sleep(2000);
                //Assert.fail("i am failing");
                ProductValidation pv=new ProductValidation(driver);
                pv.ProductValidate(driver, cellvalue);
     
	}

}
