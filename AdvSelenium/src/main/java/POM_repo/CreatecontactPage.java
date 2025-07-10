package POM_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatecontactPage {
	public CreatecontactPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(name = "salutationtype")
	private WebElement salutationtype;
	
	@FindBy (name = "firstname")
	private WebElement firstname;
	@FindBy (name="lastname")
	private WebElement lastname;
	@FindBy(xpath ="//input[@title='Save [Alt+S]']" )
	private WebElement saveButton;
	
	public WebElement getSalutationtype() {
		return salutationtype;
	}


	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getSaveButton() {
		return saveButton;
	}


	public WebElement Salutationtype() {
		getSalutationtype().click();
		return salutationtype;
		
	}
	

	public void Firstname(String FirstName) {
		getFirstname().sendKeys(FirstName);
	}
	public void Lastname(String Lastname) {
		getLastname().sendKeys(Lastname);
	}

}
