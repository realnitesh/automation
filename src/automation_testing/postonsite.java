package automation_testing;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class postonsite {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {
		
		//1) To Open Browser 
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver111.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver(options);
		
		
		
		
		
		//2) To Get Data from Excel
		
		FileInputStream file = new FileInputStream("C:\\eclipse\\registration.xlsx"); // to read excel
		//FileInputStream file = new FileInputStream("C:\\eclipse\\calculation.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file); // to  read workbook
		XSSFSheet sheet = workbook.getSheetAt(0); // to get sheet by index number
		
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		
		for(int row=1; row<=rowcount; row++)
		{
			XSSFRow currentrow = sheet.getRow(row);
			
			String Name= currentrow.getCell(0).getStringCellValue();
			Double Dob = currentrow.getCell(1).getNumericCellValue();
			String Email = currentrow.getCell(2).getStringCellValue();
			Double Mobile =currentrow.getCell(3).getNumericCellValue();
			Double cardnumber = currentrow.getCell(4).getNumericCellValue();
			Double cvv = currentrow.getCell(5).getNumericCellValue();
			
		
		
			//Post on site
			
			driver.get("https://claimgiftcardrewards.online/ninja-forms/14lerj/");
			driver.manage().window().maximize();
			
			
			
			driver.findElement(By.name("fname")).sendKeys(Name);
			driver.findElement(By.name("email")).sendKeys(Email);
			driver.findElement(By.name("nf-field-64")).sendKeys(String.valueOf(Mobile));
			
			
			
			driver.findElement(By.id("nf-field-65")).click();	
			
			//Next Page
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);      

			
			driver.findElement(By.id("nf-field-55")).sendKeys(String.valueOf(cardnumber));
			driver.findElement(By.id("nf-field-58")).sendKeys(String.valueOf(cvv));
			driver.findElement(By.id("nf-field-59")).sendKeys(Name);
			
			
			driver.findElement(By.id("nf-field-60")).click();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			//otp
			
			driver.findElement(By.id("nf-field-16")).sendKeys(String.valueOf(Dob));
			
			
			driver.findElement(By.id("nf-field-17")).click();
			
			System.out.println(row);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
	
			
		}
		
	

	}

}
