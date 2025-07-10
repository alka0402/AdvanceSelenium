package POM_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="user_name")
	private WebElement userNameTextField;
	@FindBy(name="user_password")
	private WebElement passwordTextField;
	@FindBy (id="submitButton")
	private WebElement submitButton;
	public WebElement getUserNameTextField() {
		return userNameTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}
	/**
	 * Business libraries -which is common to particular class not for all automation script 
	 * This method is used for login to the application 
	 * @param userName
	 * @param Password
	 */
	public void loginToPage(String userName,String Password) {
		getUserNameTextField().sendKeys(userName);
		getPasswordTextField().sendKeys(Password);
		getSubmitButton().click();
	}
	

}
