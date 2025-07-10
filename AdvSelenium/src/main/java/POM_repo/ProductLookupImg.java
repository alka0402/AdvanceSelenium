package POM_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductLookupImg {
	public ProductLookupImg(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//img[@title='Create Product...']")
	private WebElement createProductimg;
	public WebElement getCreateProductimg() {
		return createProductimg;
	}
	public void clickProductlookupLink() {
		getCreateProductimg().click();
	}

}
