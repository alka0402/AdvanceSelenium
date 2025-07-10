package Generic_Utilies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utilities {
	/**
	 * This method is used to read data from excel file
	 * @param SheetName
	 * @param Rownum
	 * @param cellValue
	 * @return
	 * @throws Throwable
	 * @author v-alkaasati
	 */
	public String getExcelData(String SheetName,int Rownum,int cellValue) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\v-alkaasati\\Documents\\product.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet(SheetName);
	Row row = sheet.getRow(Rownum);
	Cell cell = row.getCell(cellValue);
	
	String value = cell.getStringCellValue();
	return value;}
	public String getExcelDatawithdataFormatter(String SheetName,int Rownum,int cellValue) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\v-alkaasati\\Documents\\product.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(SheetName);
		Row row = sheet.getRow(Rownum);
		Cell cell = row.getCell(cellValue);
		DataFormatter data=new DataFormatter();
		String value = data.formatCellValue(cell);
		return value;
		
	}
	public Object[][] readDataUsingDataProvider(String SheetName) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\v-alkaasati\\Documents\\product.xlsx");
	    Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(SheetName);
		int lastRow = sheet.getLastRowNum();
		int lastCell=sheet.getRow(0).getLastCellNum();
		Object[][] objArr=new Object[lastRow][lastCell];
		for(int i=0;i<=lastRow;i++) {
		for (int j=0;j<=lastCell;j++) {
			objArr[i][j] = sheet.getRow(i).getCell(j).toString();
			
		}}
		
		return objArr;
	}

}
