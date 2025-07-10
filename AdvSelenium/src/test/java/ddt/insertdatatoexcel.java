package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class insertdatatoexcel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
        FileInputStream fis=new FileInputStream("C:\\Users\\v-alkaasati\\Desktop\\Book2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.createRow(5);
		Cell cell = row.createCell(5);
		cell.setCellValue("Qspider");
		FileOutputStream fo=new FileOutputStream("C:\\Users\\v-alkaasati\\Desktop\\Book2.xlsx");
		wb.write(fo);
		wb.close();

	}

}
