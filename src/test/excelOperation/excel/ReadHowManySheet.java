package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadHowManySheet 
{
 
	 @Test
	 public void howManySheet() throws IOException
	 {
		 FileInputStream file = new FileInputStream(new File("C:\\Users\\Bala Subramanyam\\eclipse-workspace\\SeleniumConcepts\\ExcelOperations\\XLSSF\\POI.xlsx"));

	     //Create Workbook instance holding reference to .xlsx file
	     XSSFWorkbook workbook = new XSSFWorkbook(file);
	        
	    
	     //total number of sheets
	     int totalNumberOfSheets=  workbook.getNumberOfSheets();
	     System.out.println(totalNumberOfSheets);
	     
	     
	     System.out.println("********************************");
	 	  
	     //using for loop
	     for(int i=0;i<totalNumberOfSheets;i++)
	     {
	    	 System.out.println(workbook.getSheetName(i));
	     }
	     
	     System.out.println("********************************");
	     
	     
	     //using for while loop
	     int j=0;
	     while(j<totalNumberOfSheets)
	     {
	    	 System.out.println(workbook.getSheetName(j));
	    	 j++;
	     }
	    
	     //using for do while loop
	    System.out.println("********************************");
	 	int k=0;
	     do {
	    	 System.out.println(workbook.getSheetName(k));
	    	 k++; 
	    	 
	     }while(k<totalNumberOfSheets);
	     
	     System.out.println("********************************");
	     
	     //using for iterator
	     Iterator<Sheet> it = workbook.iterator(); 
	     
	     while(it.hasNext())
	     {
	    	 Sheet sheet = it.next();
	    	 System.out.println(sheet.getSheetName());
	     }
	 }







}
