package Generic_Utilies;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utilities {
	//static WebDriver driver;
	public void maxmizewindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public void implicitwait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void windowSwitch(WebDriver driver,String partialTitle) {
		  Set<String> allwinid = driver.getWindowHandles();
		    Iterator<String> it = allwinid.iterator();
		    while (it.hasNext()) {
				String win = it.next();
				driver.switchTo().window(win);
				
				String title = driver.getTitle();
				if(title.contains(partialTitle)) {
					break;
				}
				
					
			}
	}
	public void dropDownSelect(WebElement ele,String data) {
		Select s=new Select(ele);
		s.selectByValue(data);
	}
	public void switchtoAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public static String getScreenShotOfScript(WebDriver driver,String ScreenShotName) throws Throwable {
	TakesScreenshot	tsk=(TakesScreenshot)driver;
	File src = tsk.getScreenshotAs(OutputType.FILE);
	File des = new File("./Screenshot"+ScreenShotName+".png");
	FileUtils.copyFile(src, des);
		return des.getAbsolutePath();
		
	}


}
