package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class authentication_popup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:/eclipse/chromedriver114.exe");
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		// https://username:password@website.com  inject id password in url
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String val= driver.findElement(By.cssSelector("p")).getText();
		
		System.out.println(val);
		
		driver.quit();
				

	}

}
