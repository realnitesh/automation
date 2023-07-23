package automation_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_title_from_fb {
	
	public static void main(String[] args)
	
	{
		// 1) open Chrome browser
		System.setProperty("webdriver.chrome.drive" , "c:\\eclipse\\chromedriver.exe");
		
		//o
		
		WebDriver driver= new ChromeDriver();
		
		
		//Open the link in browser fb.me
		driver.get("https://fb.me");
		
		// get the title from facebook
		
	    String title = driver.getTitle();
	     
	     //print title
	     
	    System.out.println(title);
	
		 
		//close the browser
	    
	    driver.close();
	}
	
	

}
