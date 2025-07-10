package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class printalllinkfromexcel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 FileInputStream fis=new FileInputStream("C:\\Users\\v-alkaasati\\Desktop\\Book2.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			int lastrow = sheet.getLastRowNum();
			 for (int i = 0; i < lastrow; i++) {
				Row row = sheet.getRow(i);
				Cell cell = row.getCell(0);
				String value = cell.getStringCellValue();
				System.out.println(value);
			}

	}

}
