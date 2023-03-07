package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelSmaple {

	 @Test
	 public void howManySheet() throws IOException
	 {
		 FileInputStream file = new FileInputStream(new File("C:\\Users\\Bala Subramanyam\\eclipse-workspace\\SeleniumConcepts\\ExcelOperations\\XLSSF\\POI.xlsx"));

	     //Create Workbook instance holding reference to .xlsx file
	     XSSFWorkbook workbook = new XSSFWorkbook(file);
	        
	    
	     //total number of sheets
	     int totalNumberOfSheets=  workbook.getNumberOfSheets();
	     System.out.println(totalNumberOfSheets);
	     
	     
	     for(int i=0;i<totalNumberOfSheets;i++)
	     {
	    	 if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1"))
	    	 {
	    		 
	    		 XSSFSheet sheet = workbook.getSheetAt(i);
	    		 
	    		 
	    		int totalNumberOfRows = sheet.getPhysicalNumberOfRows();
	    		System.out.println("Total number of rows :  "+totalNumberOfRows);
	    		  
	    		                        
	    		for(int j=0;j<totalNumberOfRows;j++)
	    		{
	    			XSSFRow coloumnOrCell = sheet.getRow(j);
	    			
	    			int cellsOfEachRow=coloumnOrCell.getPhysicalNumberOfCells();
	    			
	    			System.out.println("Total number of cells/columns in each row :  "+cellsOfEachRow);
		    		
	    			
	    			Iterator<Cell> asdasd = coloumnOrCell.cellIterator(); 
	    			while(asdasd.hasNext())
	    			{
	    			Cell asda = asdasd.next();
	    			
	    			System.out.println(asda.getStringCellValue()); 
	    			}
	    			
	    		}
	    		
	    		 
	    		 break;
	    	 }
	     }
	 }


}
