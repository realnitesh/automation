package automation_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_emp_from_table {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","c:\\eclipse\\chromedriver109.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")).click();
        
        int row = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div")).size();
         System.out.println("Total Employess=" + row);
         
         System.out.println("Id      " + "Name");
        
         for(int i=1; i<=row;i++)
         {
        	System.out.print( driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div["+i+"]/div[1]/div[2]")).getText());
        	System.out.println("\t" + driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div["+i+"]/div[1]/div[3]")).getText());
         }
	
	}//main

}// class
