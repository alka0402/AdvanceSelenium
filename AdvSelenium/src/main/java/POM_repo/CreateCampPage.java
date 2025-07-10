package POM_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampPage {
	public CreateCampPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (name = "campaignname")
	private WebElement campName;
	@FindBy (name="button")
	private WebElement saveButton;

   
	public WebElement getCampName() {
		return campName;
	}

	public void getCampName(String value) {
		getCampName().sendKeys(value);
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	public void clicksaveButton() {
		getSaveButton().click();
	}

	
	
	

}
