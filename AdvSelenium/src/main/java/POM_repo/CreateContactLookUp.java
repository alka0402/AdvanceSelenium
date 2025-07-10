package POM_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactLookUp {
	public CreateContactLookUp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "//img[@title='Create Contact...']")
	private WebElement createLooup;
	public WebElement getCreateLooup() {
		return createLooup;
	}
	public void getCreateContactLookupLink() {
		getCreateLooup().click();
	}
}
