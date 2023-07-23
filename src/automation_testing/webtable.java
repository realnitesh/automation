package automation_testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class webtable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "c:\\eclipse\\chromedriver113.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver= new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.get("C://eclipse//webtable.html");
		
		int row = driver.findElements(By.xpath("//body/table/tbody/tr")).size();
		System.out.println(row);
		
		int col = driver.findElements(By.xpath(".//tr[1]/td")).size();
		System.out.println(col);
		
		for(int i=1; i<=row;i++)
		{
			for(int j=1;j<=col; j++)
			{
				
			System.out.print(driver.findElement(By.xpath(".//tr["+i+"]/td["+j+"]")).getText()+"  ");	
				

   
							
			}
			
			System.out.println();
			
		
		}
			
		//driver.close();

	}

}
