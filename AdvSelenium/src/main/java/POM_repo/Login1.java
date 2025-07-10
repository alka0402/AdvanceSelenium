package POM_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login1 {
	private WebDriver driver;
	private By userTextField=By.name("user_name");
	private By passwordTextField=By.name("user_password");
	private By loginButton=By.id("submitButton");
	public Login1(WebDriver driver) {
		this.driver=driver;
	}
	public void loginpage(String userName,String password) {
		WebElement usename=driver.findElement(userTextField);
		usename.sendKeys(userName);
		WebElement pass = driver.findElement(passwordTextField);
		pass.sendKeys(password);
		WebElement login = driver.findElement(loginButton);
		login.click();
	}

}
