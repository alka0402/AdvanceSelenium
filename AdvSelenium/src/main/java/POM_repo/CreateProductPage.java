package POM_repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPage {
	public CreateProductPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(name = "productname")
	private WebElement productName;
	@FindBy(name = "button")
	private WebElement saveButton;
	
	public WebElement getProductName() {
		return productName;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	public void productName(String prdName) {
		getProductName().sendKeys(prdName);
		
	}
    public void deleteProd(WebDriver driver,String prdname) {
    driver.findElement(By.xpath("//table[@class='lvt small']//a[text()='"+prdname+"']/../preceding-sibling::td[2]//input[@type='checkbox']")).click();
    driver.findElement(By.xpath("//input[@value='Delete']")).click();
    }
}
