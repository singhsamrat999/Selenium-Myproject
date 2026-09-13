package Mypackage2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VENOM\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		// initialization of webdriver 
		WebDriver driver = new ChromeDriver(); 
		
		// implicit wait (Selenium 3 style)
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		
		// Locate the Elements
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("sam123@gmail.com");
		
		WebElement passwordField = driver.findElement(By.id("pass"));
		passwordField.sendKeys("123455@");
		
		driver.findElement(By.name("login")).click();
		
		
		driver.close();
	}
}
