package Product;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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

public class createProductDeleteProductTest extends BaseClass {

	public void createProductDeleteProductTest() throws Throwable {

				WebDriver_Utilities wutil=new WebDriver_Utilities();

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
		                ProductValidation pv=new ProductValidation(driver);
		                pv.ProductValidate(driver, cellvalue);
		                hp.clickToProduct();
		                createprod.deleteProd(driver, cellvalue);
		               wutil.switchtoAlert(driver);
		               pv.deleteValidate(driver, cellvalue);
		               
		               
	}

}
