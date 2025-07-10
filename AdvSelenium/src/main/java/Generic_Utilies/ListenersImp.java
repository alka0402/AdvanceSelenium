package Generic_Utilies;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersImp  implements ITestListener{

	
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts = (TakesScreenshot)BaseClass.sdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./FailedTest.png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	

}
