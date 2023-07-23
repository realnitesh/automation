package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class form_fill {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse\\chromedriver113.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		driver.findElement(By.xpath(".//input[@id='firstName']")).sendKeys("nitesh");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("nk@gmail.com");
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("0000000000");
		//driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).sendKeys("01 Jan 1990");
		driver.findElement(By.id("subjectsContainer")).sendKeys("Hindi");		
		driver.findElement(By.id("hobbies-checkbox-2")).click();
		driver.findElement(By.id("hobbies-checkbox-3")).click();
		
		
		
		
		
     //  driver.close();
	}

}
