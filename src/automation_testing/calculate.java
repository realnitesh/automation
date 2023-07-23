package automation_testing;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class calculate {

	public static void main(String[] args) throws Throwable {
		
		//1) To Open Browser 
		
		 System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver113.exe");
		 ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			
			WebDriver driver= new ChromeDriver(options);
			
		    driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		    driver.manage().window().maximize();
					
		//2) To Get Data from Excel
		 
		System.out.println("Getting Data From Excel");
		
		FileInputStream file = new FileInputStream("C:\\eclipse\\calc.xlsx"); // to read excel
		//FileInputStream file = new FileInputStream("C:\\eclipse\\registration.xlsx");
		System.out.println("File Read");
		XSSFWorkbook workbook = new XSSFWorkbook(file); // to  read workbook
		System.out.println("Workbook Read");
		XSSFSheet sheet = workbook.getSheetAt(0); // to get sheet by index number
		System.out.println("Sheet Read");
			
		int rowcount = sheet.getLastRowNum();
		System.out.println("row count is  " + rowcount);
		int colcount = sheet.getRow(0).getLastCellNum();
		System.out.println("colcount count is  " + colcount);
		
		for(int row=1; row<=rowcount; row++)			
		{			
			XSSFRow currentrow = sheet.getRow(row);
					
			System.out.println("current row is " +  row);	
			
			int principal = (int) currentrow.getCell(0).getNumericCellValue();
			
			XSSFCell roicell = currentrow.getCell(1);
			int roi= (int)roicell.getNumericCellValue();
		
		    int periodY = (int) currentrow.getCell(2).getNumericCellValue();
		    String frequency = currentrow.getCell(3).getStringCellValue();
		    int maturity = (int) currentrow.getCell(4).getNumericCellValue();
		    
		    System.out.println("Data Get Sucessfully");
		
		//Post on site	
		    
		   		
			driver.findElement(By.id("principal")).sendKeys(String.valueOf(principal));
			
			System.out.println("principal amount updated  " +  principal);
			
			driver.findElement(By.id("interest")).sendKeys(String.valueOf(roi));
			
			System.out.println("Rate of interest updated  " +  roi);
			
			driver.findElement(By.id("tenure")).sendKeys(String.valueOf(periodY));
			
			System.out.println("Period updated  " +  periodY);
			
			Select periodcombo= new Select (driver.findElement(By.id("tenurePeriod")));
			
			periodcombo.selectByValue("1");
			
			
			
			
			Select frequencycombo= new Select (driver.findElement(By.id("frequency")));
			
			frequencycombo.selectByVisibleText(frequency);
			
			driver.findElement(By.xpath("//body/div[@id='mc_mainWrapper']/div[@class='PA10']/div[@class='FL']/div[@class='MT10']/div[@class='PT10 b_22']/div[@class='PT25']/div[@class='cal_div']/form[@id='fdMatVal']/div[@class='CTR PT15']/a[1]")).click();
			System.out.println(" Data Submitted ");
			
			String act_maturity= driver.findElement(By.className("gL_27")).getText();
			
			if ((Double.parseDouble(act_maturity))==maturity)
			{
			
				System.out.println("Test Passed");
			}
			else
			{
			
			System.out.println("Test Failed");
			
			
			}	
			driver.findElement(By.xpath("//img[@class='PL5']")).click();
			System.out.println("Data Clear");
	     }
	
		
	}
	}
