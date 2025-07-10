package POM_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Campaign.Createcampaign;

public class CreateCampaignLookup {
	public CreateCampaignLookup(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "//img[@title='Create Campaign...']")
	private WebElement createLooup;
	public WebElement getCreateLooup() {
		return createLooup;
	}
	public void getCreateLookupLink() {
		getCreateLooup().click();
	}

}
