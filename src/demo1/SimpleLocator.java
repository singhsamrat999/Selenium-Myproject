package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleLocator {

	public static void main(String[] args)  throws InterruptedException{
		
    System.setProperty("webdriver.chrome.driver",
    		"C:\\Users\\VENOM\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
    
    
    WebDriver driver = new ChromeDriver();
    
   driver.navigate().to("https://www.facebook.com/");
   
   driver.manage().window().maximize();
   
   WebElement email = driver.findElement(By.name("email"));
   email.sendKeys("sam@123gmail.com");

   WebElement Pass = driver.findElement(By.name("pass"));
   Pass.sendKeys("Sam123");
   Thread.sleep(5000);
   // TagName practice
//   WebElement FirstButton = driver.findElement(By.tagName("button"));
//   System.out.println(FirstButton.getText());
//   System.out.println(driver.findElements(By.tagName("button")).size());
//   System.out.println("Button count = " 
//	        + driver.findElements(By.tagName("button")).size());
   

//  
// using linkedtext locator
   WebElement createAccount = driver.findElement(By.linkText("Create new account"));
	createAccount.click();
	
	driver.navigate().back();
	//using partial linkedtext
	WebElement forgottenPasswordPartial = driver.findElement(By.partialLinkText("Forgotten "));
	forgottenPasswordPartial .click();
	driver.navigate().back();
    driver.quit();

   }

}
