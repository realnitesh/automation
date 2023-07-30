package automation_testing;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class find_broken_link {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		// Browser to be use
		System.setProperty("webdriver.chrome.driver","C://eclipse/chromedriver.exe");
		
		// Chrome security purpose
		ChromeOptions options = new ChromeOptions();
		
		// Add argument remote allow orgin to access chrome browser
		options.addArguments("--remote-allow-origins=*");
		
		// Chrome Driver object create including options
		ChromeDriver driver = new ChromeDriver(options);
		
		
		//Maximize Window
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Open Url
		driver.get("https://demoqa.com/broken");
		
		//Wait 
		Thread.sleep(5000);
		
		//Capture list of link from website
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		//No. of links
		System.out.println(links.size());
		
		
		for(int i=1;i<links.size();i++)
		{
			//By using href attribute we can get url of require link
			
			WebElement element = links.get(i); // is used to retrieve A specific element from the List<WebElement> named links.
			
			String url = element.getAttribute("href"); // is used to retrieve the value of the "href" attribute from the WebElement
			
			
			URL link = new URL(url); //The URL object allows you to perform various operations on the URL, such as getting the protocol, host, port, path, query parameters, etc. Additionally, you can use the URL object to establish a connection and fetch the content of the resource it points to.
			
			//Create connection using url object
			
			HttpURLConnection httpcon = (HttpURLConnection) link.openConnection();
			
			//wait 
			
			Thread.sleep(5000);
			
			//Establish connection
			httpcon.connect();
			
			//return response code. If code is greater then 400: Broken link
			int rescode =httpcon.getResponseCode();
			
			if(rescode>=400)
			{
			
			System.out.println(url + "-" + "is Broken");
			
			}
			else
			{
				System.out.println(url + "-" + "is Valid");
			}  
			
			
		}
		
		driver.quit();  // Getting 4 count but exactly 3 url only 2 are valid 1 is broken. dont no why containing null value if there is 3 url only.

	}

}
