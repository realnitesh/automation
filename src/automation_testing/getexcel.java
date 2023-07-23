package automation_testing;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.*;

public class getexcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream file = new FileInputStream("C:\\eclipse\\excel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file); 
		
		// XSSFSheet sheet = workbook.getSheet("Sheet1"); // get sheet details by sheet name
		
		XSSFSheet sheet = workbook.getSheetAt(0);// get sheet details by index
		
		int rowcount = sheet.getLastRowNum(); // get last row number
		int columncount = sheet.getRow(0).getLastCellNum(); // get any row last cell number
		
		for(int i = 0;i<rowcount;i++)
		{
			XSSFRow currentrow = sheet.getRow(i); // get current row 
			
			for(int j=0; j<columncount;j++)
			{
				String value = currentrow.getCell(j).toString(); // get current row cell data
				System.out.print(" " + value); //remove ln so that cell print in same line
				
			}
			System.out.println(); // to print in next line after 1 row print
		}
		
		
		
	}

}
