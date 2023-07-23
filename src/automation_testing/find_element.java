package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class find_element {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\eclipse\\geckodriver.exe");
		
		// WebDriver driver= new FirefoxDriver();
		
      //  System.setProperty("webdriver.edge.driver", "C:\\eclipse\\msedgedriver.exe");
		
		// WebDriver driver = new EdgeDriver();
		
        System.setProperty("webdriver.chrome.drive" , "c:\\eclipse\\chromedriver.exe");
		
	
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		 driver.get("https://www.facebook.com/");
		 
		 String link=driver.getCurrentUrl();
		 
		 if(link.contains("https://www.facebook.com/"))
		 {
	   
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcdefghi");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcdefghi");
		
		System.out.println("Login");
		 }
		else 
		{
			
			System.out.println("invalid link");
		}
		 
	
		 
	}
			
	
		
		
}

