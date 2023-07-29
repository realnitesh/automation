package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class mouse_over {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","c:/eclipse/chromedriver114.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		Actions act = new Actions(driver);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		//mouse over
		
		WebElement intr = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[6]/a"));  
		WebElement drag = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[6]/ul/li[1]/a"));
		WebElement stat = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]/a"));
		
	/*	act.moveToElement(intr).build().perform();		 //move over to intraction tab	
	    act.moveToElement(drag).build().perform();     //move  over to drag and drop tab
	    act.moveToElement(stat).click().build().perform();  //move over to static tab and click */
	    
	    //in one line
		
	    act.moveToElement(intr).moveToElement(drag).moveToElement(stat).click().build().perform();
	    
	   	System.out.println(driver.getTitle());

	   	driver.quit();
	}

}
