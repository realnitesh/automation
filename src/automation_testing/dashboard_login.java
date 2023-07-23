package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dashboard_login {

	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.drive" , "c:\\eclipse\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			
			driver.manage().window().maximize();
			
			 driver.get("https://dashboard.pickrr.com");
			 
			 driver.findElement(By.xpath(".//span[contains(text(),'Login')]")).click();
			 
			 String link=driver.getCurrentUrl();
			 
			 if(link.contains("https://dashboard.pickrr.com"))
			 {
		   
			driver.findElement(By.id("email")).sendKeys("abcdefghi");
			
			driver.findElement(By.id("password")).sendKeys("abcdefghi");
			 }
			else 
			{
				
				System.out.println("invalid link");
			}
		
		
		
		
		
		
		
		
		
		
		

	}

}
