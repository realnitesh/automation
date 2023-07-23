package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class website_flow_test {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\eclipse\\chromedriver113.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	
	 driver.get("https://demo.automationtesting.in/Index.html");
	 driver.manage().window().maximize();
	 
	 //Email for signup
	 driver.findElement(By.id("email")).sendKeys("emailid@gmail.com");
	 driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/span[1]/a[1]/img[1]")).click();
	 System.out.println(driver.getTitle());
	 
	 //registered
	 
	 driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("nix");
	 driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("vix");
	 driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("A-10,gali number- 20,delhi-110011");
	 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("emailname@gmail.com");
	 driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1010101010");
	 driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[1]/input[1]")).click();
	 driver.findElement(By.id("checkbox1")).click();
	 driver.findElement(By.id("checkbox2")).click();
	 driver.findElement(By.id("checkbox3")).click();

	//WebElement multiSelectContainer = driver.findElement(By.tagName("multi-select"));
	 //multiSelectContainer.click();
	 
	 driver.findElement(By.id("Skills")).click();
     driver.findElement(By.xpath("//option[@value='HTML']")).click();
	// driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
	 driver.findElement(By.id("yearbox")).click();
	 
	      

	}

}
