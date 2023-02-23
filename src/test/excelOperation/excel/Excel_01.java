package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_01 {

	@Test
	public void excel_01() throws IOException {
		File file = new File("C:\\POI.xlsx"); // creating a new file instance
		FileInputStream fis = new FileInputStream(file); // obtaining bytes from the file
		// creating Workbook instance that refers to .xlsx file
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0); // creating a Sheet object to retrieve object
		String shName = sheet.getSheetName();
		System.out.println(shName);
		
		Iterator<Row> row = sheet.iterator();
		Iterator<Cell> cellIterator = ((Row) row).cellIterator();   //iterating over each column  
		while(cellIterator.hasNext())
		{
			while (cellIterator.hasNext())   
			{  
			Cell cell = cellIterator.next();  
			switch (cell.getCellType())               
			{  
			case Cell.CELL_TYPE_STRING:    //field that represents string cell type  
			System.out.print(cell.getStringCellValue() + "\t\t\t");  
			break;  
			case Cell.CELL_TYPE_NUMERIC:    //field that represents number cell type  
			System.out.print(cell.getNumericCellValue() + "\t\t\t");  
			break;  
			default:  
			}  
			}   
		}
	}
}
