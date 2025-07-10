package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readDataFromExcel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\v-alkaasati\\Downloads\\Book1.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(1);
		//String cellvalue = cell.getStringCellValue();
		//double no = cell.getNumericCellValue();
		DataFormatter data=new DataFormatter();
		String celldata = data.formatCellValue(cell);
		System.out.println(celldata);
		

	}

}
