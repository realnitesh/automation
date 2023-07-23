package automation_testing;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class get_data_from_excel {

	public static void main(String[] args) throws IOException {
		
		
		
		
		FileInputStream file = new FileInputStream("C:/eclipse/excel.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet= workbook.getSheetAt(0);
		
		int lastrow = sheet.getLastRowNum();
		int lastcol = sheet.getRow(0).getLastCellNum();
		
		for(int i=0; i<lastrow; i++)
		{
			XSSFRow currentrow = sheet.getRow(i);
			
		
			
		for(int j=0; j<lastcol; j++)
		{
			
		
		String value= currentrow.getCell(j).toString();
		
		System.out.print("  " + value);
		
		}
		
		System.out.println();
		
		}	
		
	}
	}
	