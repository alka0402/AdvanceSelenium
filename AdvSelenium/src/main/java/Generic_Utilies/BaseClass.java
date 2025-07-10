package Generic_Utilies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import POM_repo.HomePage;
import POM_repo.LoginPage;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver sdriver;
	@BeforeSuite(groups = {"SmokeTest","RegressionTest"})
	public void bS() {
		System.out.println("Database connection");
	}
	@BeforeTest(groups = {"SmokeTest","RegressionTest"})
	public void bT() {
		System.out.println("parallel execution");
	}
	@BeforeClass(groups = {"SmokeTest","RegressionTest"})
	
	public void bC() throws Throwable {
		File_Utilities file=new File_Utilities();
		//String BROWSER = System.getProperty("browser");
		String BROWSER = file.getKeyAndValue("browser");
		
		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else if (BROWSER.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		System.out.println("browser lunching is done ");
		sdriver=driver;
	}
	@BeforeMethod(groups = {"SmokeTest","RegressionTest"})
	public void bM() throws Throwable {
		File_Utilities file=new File_Utilities();
		
		String url =file.getKeyAndValue("url");
		String username = file.getKeyAndValue("username");
		String Password = file.getKeyAndValue("password");
//		String url=System.getProperty("url");
//		String username =System.getProperty("username");
//		String Password=System.getProperty("password");
		WebDriver_Utilities wutil=new WebDriver_Utilities();
		wutil.maxmizewindow(driver);
		wutil.implicitwait(driver);
        driver.get(url);
        LoginPage log = new LoginPage(driver);
        log.loginToPage(username, Password);
		System.out.println("login is done ");
	}
	
	
	@AfterMethod(groups = {"SmokeTest","RegressionTest"})
	public void aM() {
		HomePage hp=new HomePage(driver);
		hp.clickTologout();
		System.out.println("logout is done ");
	}
	@AfterClass(groups = {"SmokeTest","RegressionTest"})
	public void aC() {
		driver.quit();
		System.out.println("Ac");
	}

	@AfterTest(groups = {"SmokeTest","RegressionTest"})
	public void aT() {
		System.out.println("At");
	}
	@AfterSuite(groups = {"SmokeTest","RegressionTest"})
	public void aS() {
		System.out.println("AS");
	}
	
}
