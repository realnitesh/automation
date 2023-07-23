package automation_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_enable_user_from_table {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\\\eclipse\\\\chromedriver109.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'User Management')]")).click();
		
		driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-link']")).click();
		
		
	int row= driver.findElements(By.xpath("//body/div[@id='app']/div[@class='oxd-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-paper-container']/div[@class='orangehrm-container']/div[@class='oxd-table']/div[@class='oxd-table-body']/div")).size();			
		System.out.println("Number of Rows = " + row);
		
		int disabled_user=0;
		int enabled_user =0;
		
		for (int i=row;i>=1;i--)
		{
		
		String status= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div["+i+"]/div[1]/div[5]")).getText();
		
		
		if(status.equals("Enabled"))
		{
			enabled_user= 1+enabled_user;
		}
		else
		{
			disabled_user++;	
		}
			
		

	}
		System.out.println("Disabled user = "+ disabled_user);
		System.out.println("Enabled user = "+ enabled_user);
		
		//driver.close();
	

}
}

