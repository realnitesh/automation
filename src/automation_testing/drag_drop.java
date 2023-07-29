package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/eclipse/chromedriver114.exe"); // for browser to be use
		ChromeOptions options = new ChromeOptions(); //define option for security
		options.addArguments("--remote-allow-origins=*"); // for security
		WebDriver driver = new ChromeDriver(options); //object for web browser
		
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html"); //open url
		 
		WebElement source1 = driver.findElement(By.id("box1")); //store source
		WebElement target1 = driver.findElement(By.id("box101"));  //store target
		
		Actions act = new Actions(driver);  //Actions class object created
		act.clickAndHold(source1).moveToElement(target1).release().build().perform();  //click and hold the sources,move to target and release
		
		WebElement source2= driver.findElement(By.id("box2"));
		WebElement target2= driver.findElement(By.id("box102"));
		
		act.dragAndDrop(source2,target2).build().perform();
		
		WebElement source3= driver.findElement(By.id("box3"));
		WebElement target3= driver.findElement(By.id("box103"));
		
		act.dragAndDrop(source3,target3).build().perform();
		
		WebElement source4= driver.findElement(By.id("box4"));
		WebElement target4= driver.findElement(By.id("box104"));
		
		act.dragAndDrop(source4,target4).build().perform();

		WebElement source5= driver.findElement(By.id("box5"));
		WebElement target5= driver.findElement(By.id("box105"));
		
		act.dragAndDrop(source5,target5).build().perform();

		WebElement source6= driver.findElement(By.id("box6"));
		WebElement target6= driver.findElement(By.id("box106"));
		
		act.dragAndDrop(source6,target6).build().perform();
		
		WebElement source7= driver.findElement(By.id("box7"));
		WebElement target7= driver.findElement(By.id("box107"));
		
		act.dragAndDrop(source7,target7).build().perform();
		
		
		
		
		
		
		
		
		
		

	}

}
