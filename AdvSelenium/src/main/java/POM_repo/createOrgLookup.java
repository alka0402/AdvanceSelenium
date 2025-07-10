package POM_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createOrgLookup {
	public createOrgLookup(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "//img[@title='Create Organization...']")
	private WebElement createLooup;
	
	public WebElement getCreateLooup() {
		return createLooup;
	}
	

	public void getOrgCreateLookupLink() {
		getCreateLooup().click();
	}
	

}
