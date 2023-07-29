package automation_testing;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class switch_window {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver114.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://demo.automationtesting.in/Windows.html");
		
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/button[1]")).click();
	    
	    Set <String> s = driver.getWindowHandles();  //store windows/tab all details
	    
	    System.out.println("No of Tab  "+ s.size()); //print windows  size or open windows
	    
	   for(String i:s) 
		   
	   {
		  
		   String t=driver.switchTo().window(i).getCurrentUrl(); //switch from 1 windos to another
		   System.out.println("After Switch " + t);
		   
		   if(t.contains("https://demo.automationtesting.in/Windows.html")) // closing windows
		   {
			   driver.close();
			   
			   
		   }
		   Set <String> s1 = driver.getWindowHandles();
		   
		   System.out.println("No of Tab  "+ s1.size());
	   }
	   
	  	
		driver.quit();
		

	}

}
