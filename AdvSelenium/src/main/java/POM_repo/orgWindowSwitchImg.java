package POM_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orgWindowSwitchImg {
	public orgWindowSwitchImg(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//img[@title='Select'][1]")
	private WebElement createorgimg;
	@FindBy(name = "search_text")
	private WebElement searchText;
	@FindBy(name = "search")
	private WebElement searchButton;
	public WebElement getCreateorgimg() {
		return createorgimg;
	}
	public WebElement getSearchText() {
		return searchText;
	}
	public WebElement getSearchButton() {
		return searchButton;
	}
	public void orgLookupimg() {
		getCreateorgimg().click();
	}
	public void seachText(String orgvalue) {
		getSearchText().sendKeys(orgvalue);
		getSearchButton().click();
	}
	public void enterorgNameInContact(WebDriver driver,String orgname) {
		driver.findElement(By.xpath("//a[text()='"+orgname+"']")).click();
	}

}
