package POM_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "More")
	private WebElement moreButton;
	@FindBy(name = "Campaigns")
	private WebElement campaign;
	@FindBy(linkText = "Products")
	private WebElement product;
	@FindBy(linkText = "Contacts")
	private WebElement contact;
	
	@FindBy(linkText ="Organizations" )
	private WebElement organization;
	@FindBy(xpath = "//img[@style='padding: 0px;padding-left:5px'  and @src='themes/softed/images/user.PNG']")
	private WebElement logOutLink;
	@FindBy(linkText ="Sign Out" )
	private WebElement signout;  
     

	public WebElement getMoreButton() {
		return moreButton;
	}

	public WebElement getCampaign() {
		return campaign;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getContact() {
		return contact;
	}

	public WebElement getOrganization() {
		return organization;
	}
	public void clickToCampaign() {
		getMoreButton().click();
		getCampaign().click();
	}
	public void clickToProduct() {
		getProduct().click();
			}
	public void clickToContact() {
		getContact().click();
			}
	public void clickToOrzanization() {
		getOrganization().click();
	}

	public WebElement getLogOutLink() {
		return logOutLink;
	}


	public WebElement getSignout() {
		return signout;
	}
	public void clickTologout() {
		getLogOutLink().click();
		getSignout().click();
	}
	

	
	
	
	
	

}
