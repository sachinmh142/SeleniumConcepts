package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadNumberOfSheets
{
     
	
	@Test
    public void readNumberOfsheets() throws FileNotFoundException
    {
		
		String currentPath=System.getProperty("user.dir");
		System.out.println(currentPath);
		FileInputStream fin =new FileInputStream(currentPath+"\\ExcelOperations\\XLSSF\\POI.xlsx");
		XSSFWorkbook wb=null;
		try {
			wb=new XSSFWorkbook(fin);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//using for loop
		int totalNumberOfSheets=wb.getNumberOfSheets();
		for(int i=0;i<totalNumberOfSheets;i++)
		{
			System.out.println("Sheet Name : "+wb.getSheetName(i));
		}
		
		System.err.println("*************************************************");
		
		// using iterator
		Iterator<Sheet> it = wb.iterator();
		while (it.hasNext()) {
			Sheet sheet = it.next();
			
			System.out.println("Sheet Name : "+sheet.getSheetName());
		}
		System.err.println("*************************************************");
		
		
		
		//using while loop
		int k=0;
		while(k<totalNumberOfSheets)
		{
			System.out.println("Sheet Name : "+wb.getSheetName(k));
			k++;
		}
		System.err.println("*************************************************");
		
		
		
		//using do while loop
		int j=0;
		do 
		{
			System.out.println("Sheet Name : "+wb.getSheetName(j));
			j++;	
		}while (j<totalNumberOfSheets);
			
		System.err.println("*************************************************");
		
		
    }

}
