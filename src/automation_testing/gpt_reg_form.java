package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class gpt_reg_form {
	
	public static void main(String[] args) {
	
	  System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver113.exe");

      // Create an instance of ChromeDriver
    System.setProperty("webdriver.chrome.driver","C:\\eclipse\\chromedriver113.exe");
  	ChromeOptions options = new ChromeOptions();
  	options.addArguments("--remote-allow-origins=*");
  	WebDriver driver = new ChromeDriver(options);

      // Navigate to the registration page
      driver.get("https://demo.automationtesting.in/Register.html");

      // Fill in the registration form
      WebElement firstNameInput = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
      firstNameInput.sendKeys("John");

      WebElement lastNameInput = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
      lastNameInput.sendKeys("Doe");

      WebElement addressTextArea = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
      addressTextArea.sendKeys("123 Street, City");

      WebElement emailInput = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
      emailInput.sendKeys("johndoe@example.com");

      WebElement phoneInput = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
      phoneInput.sendKeys("1234567890");

      WebElement genderRadio = driver.findElement(By.xpath("//input[@value='Male']"));
      genderRadio.click();

      WebElement hobbiesCheckbox = driver.findElement(By.xpath("//input[@value='Cricket']"));
      hobbiesCheckbox.click();

    /*  WebElement languageDropdown = driver.findElement(By.tagName("multi-select"));
      languageDropdown.click();
      WebElement englishOption = driver.findElement(By.xpath("//a[text()='English']"));
      englishOption.click(); */

      WebElement skillsDropdown = driver.findElement(By.id("Skills"));
      skillsDropdown.sendKeys("Java");

      WebElement countryDropdown = driver.findElement(By.id("countries"));
      countryDropdown.sendKeys("India");

      /*   WebElement selectCountryDropdown = driver.findElement(By.xpath("//span[@role='combobox']"));
      selectCountryDropdown.click();
      WebElement indiaOption = driver.findElement(By.xpath("//div[@id='select2-country-results']//li[text()='India']"));
      indiaOption.click(); */

      WebElement yearOfBirthDropdown = driver.findElement(By.id("yearbox"));
      yearOfBirthDropdown.sendKeys("1990");

      WebElement monthOfBirthDropdown = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
      monthOfBirthDropdown.sendKeys("May");

      WebElement dayOfBirthDropdown = driver.findElement(By.id("daybox"));
      dayOfBirthDropdown.sendKeys("10");

      WebElement passwordInput = driver.findElement(By.id("firstpassword"));
      passwordInput.sendKeys("Password123");

      WebElement confirmPasswordInput = driver.findElement(By.id("secondpassword"));
      confirmPasswordInput.sendKeys("Password123");

      // Submit the registration form
      WebElement submitButton = driver.findElement(By.id("submitbtn"));
      submitButton.click();

      // Wait for a while to observe the result
      try {
          Thread.sleep(5000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }

      // Close the browser
      driver.quit();	

}
}
