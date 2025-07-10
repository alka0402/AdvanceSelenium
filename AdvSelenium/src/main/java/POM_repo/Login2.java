package POM_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Login2 {
	public Login2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy (name="user_name")
	private WebElement userName;
	@FindAll ({@FindBy(name="user_password"),@FindBy(css = "[type='password']") })
	private WebElement password;
	@FindAll ({@FindBy(id="submitButton"),@FindBy(css = "[type='submit']")})
	private WebElement submit;
	public void loginToVtiger(String uName,String Password) {
		userName.sendKeys(uName);
		password.sendKeys(Password);
		submit.click();
	}

}
