package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class get_tag_from_fb {

	public static void main(String[] args) {
		
		
		// 1) open Edge browser
		System.setProperty("webdriver.edge.driver", "C:\\eclipse\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		
		// 2) open fb url
		driver.get("https://fb.me");
		
		String tag = driver.findElement(By.id("email")).getTagName();
		
		System.out.println(tag);
		
		driver.quit();

	}

}
