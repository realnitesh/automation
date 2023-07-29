package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://eclipse/chromedriver114.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
		
	    WebElement slider = driver.findElement(By.xpath("/html/body/div/span"));
	    
	    Actions act = new Actions(driver);
	    
	  //  act.moveToElement(slider).dragAndDropBy(slider,400,0).build().perform(); //both working
	    
	    act.dragAndDropBy(slider,100,0).build().perform(); //working
	    
	    
		driver.quit();
		
		

	}

}
