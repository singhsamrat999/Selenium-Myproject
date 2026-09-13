package demo1;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VENOM\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//locate url
		driver.get("https://www.facebook.com/");
		//fluent wait
		
		 // ✅ Create FluentWait object
		  Wait<WebDriver> wait = new FluentWaitDemo<>(driver).withTimeout(Duration.ofSeconds(20)); 
		  Wait<WebDriver> wait1 = new FluentWaitDemo<>(driver).pollingEvery(Duration.ofSeconds(5));
		  Wait<WebDriver> wait2 = new FluentWaitDemo<>(driver).ignoring(NoSuchElementException.class);
			
	     // locate
		  
		  WebElement email = driver.findElement(By.name("email"));
		  email.sendKeys("Renusingh@123gmail.com");
		  WebElement pass = driver.findElement(By.name("pass"));
		  pass.sendKeys("renu@123");
		  driver.findElement(By.name("Log in")).click();
		  
		  driver.close();
		  
		

	}

}
