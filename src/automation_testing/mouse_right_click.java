package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class mouse_right_click {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/eclipse/chromedriver114.exe"); // for browser to be use
		ChromeOptions options = new ChromeOptions(); //define option for security
		options.addArguments("--remote-allow-origins=*"); // for security
		WebDriver driver = new ChromeDriver(options); //object for web browser
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html"); // open url
		
		Actions act = new  Actions(driver); //object create for action class
		
		WebElement rightclick = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));  //save button path
		act.contextClick(rightclick).build().perform(); // right click on button
		driver.findElement(By.xpath("/html/body/ul/li[3]")).click(); //click on copy
		System.out.println(driver.switchTo().alert().getText()); // print alert msg
		driver.switchTo().alert().accept(); //close alert
		driver.quit(); //quit window
		

	}

}
