package POM_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrgPage {
	public CreateOrgPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(name = "accountname")
	private WebElement accountName;
	@FindBy (id = "phone")
	private WebElement phoneNo;
	@FindBy (id="email1")
	private WebElement emailid;
	@FindBy(name = "button")
	private WebElement saveButton;
	public WebElement getAccountName() {
		return accountName;
	}
	public WebElement getEmailid() {
		return emailid;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	public WebElement getPhoneNo() {
		return phoneNo;
	}
	public void orgName(String value) {
		getAccountName().sendKeys(value);
	}
	

	public void PhoneNo(String number) {
		getPhoneNo().sendKeys(number);
	}
	public void emailid(String emailid) {
		getEmailid().sendKeys(emailid);
	}

}
