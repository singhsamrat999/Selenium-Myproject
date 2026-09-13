package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VENOM\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//locate url
		driver.get("https://www.facebook.com/");
		
		//explicit wait --------in it we give some condition 
		WebDriverWait wait = new WebDriverWait(driver, 20);
		// Wait for elements
		    WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("_R_1h6kqsqppb6amH1_")));
		    email.sendKeys("samar@123gmail.com");
	        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("_R_1hmkqsqppb6amH1_")));
	        password.sendKeys("samar@12");
	        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
	        login.click();
	        
	        //action perform
	       
	        driver.close();
	        


	        
	        

	}

}
