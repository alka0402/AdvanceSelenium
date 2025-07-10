package demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Method {

	
		// TODO Auto-generated method stub
		public void maximize (WebDriver driver) {
			driver.manage().window().maximize();
		}
		public void timeout (WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}


