package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadHowManyNumberOFRows {

	@Test
	public void readNumberoFRows() throws IOException
	{
		 FileInputStream file = new FileInputStream(new File("C:\\Users\\Bala Subramanyam\\eclipse-workspace\\SeleniumConcepts\\ExcelOperations\\XLSSF\\POI.xlsx"));

	     //Create Workbook instance holding reference to .xlsx file
	     XSSFWorkbook workbook = new XSSFWorkbook(file);
	        
	    
	     //total number of sheets
	     int totalNumberOfSheets=  workbook.getNumberOfSheets();
	     System.out.println(totalNumberOfSheets);
	     
	     
	     Iterator<Sheet> it = workbook.iterator();
	     while (it.hasNext()) 
	     {
			  Sheet sheet = it.next();
			  Iterator<Row> row = sheet.iterator();
			  
			  while (row.hasNext())
			  {
				  Row type = row.next();
				  System.out.println(type.getPhysicalNumberOfCells());
			  }
			  
		  }
	     
	}
}
