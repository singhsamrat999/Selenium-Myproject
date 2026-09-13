package demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\VENOM\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			//Implicit Wait()    ------------ it is for selenium 3 version not for 4
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com/");
			
			WebElement emailField = driver.findElement(By.id("_R_1h6kqsqppb6amH1_"));
			emailField.sendKeys("Riya@123gmail.com");
			WebElement passField = driver.findElement(By.id("_R_1hmkqsqppb6amH1_"));
			passField.sendKeys("Riya@123");
		
	     	
		    driver.findElement(By.name("email")).click();	
		    
		    driver.close();		    
		
		
			

	}

}
