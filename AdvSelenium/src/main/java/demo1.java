import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		Method m=new Method();
		m.maximize(driver);
		m.timeout(driver);
		

	}

}
