package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alert_with_ok_cancel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:/eclipse/chromedriver114.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver  = new ChromeDriver(options);
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
		System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		String msg = driver.findElement(By.id("demo")).getText();
		System.out.println(msg);
		
		if(msg.equals("You Pressed Cancel")!=true)
		{
	
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[2]/button")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().dismiss();
			//driver.switchTo().alert().accept();
			String msg1 = driver.findElement(By.id("demo")).getText();
			System.out.println(msg1);
	
		}
		
		
			System.out.println("Test Case Passed");
		
		
		driver.quit();
		
	}

}
