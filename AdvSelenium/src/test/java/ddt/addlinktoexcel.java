package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addlinktoexcel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 FileInputStream fis=new FileInputStream("C:\\Users\\v-alkaasati\\Desktop\\Book2.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			driver.get("https://www.flipkart.com/");
			 List<WebElement> link = driver.findElements(By.xpath("//a"));
			
			for (int i=0;i<link.size(); i++) {
				Row row =sheet.createRow(i);
				Cell cell = row.createCell(0);
				cell.setCellValue(link.get(i).getAttribute("href"));
			}
			
			FileOutputStream fo=new FileOutputStream("C:\\Users\\v-alkaasati\\Desktop\\Book2.xlsx");
			wb.write(fo);
			DataFormatter data=new DataFormatter();
			
			wb.close();

	}

}
