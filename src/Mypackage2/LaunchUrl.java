package Mypackage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VENOM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); 
		  
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  
		  driver.navigate().to("https://www.flipkart.com");
		  driver.navigate().refresh();
		  Thread.sleep(2000);
		  driver.navigate().back();  
		  
		  Thread.sleep(2000);
		  driver.navigate().forward();
		  
		  Thread.sleep(2000);
		  System.out.println(driver.getCurrentUrl());
		  
		  Thread.sleep(2000);
		  System.out.println(driver.getTitle());
		  
		  Thread.sleep(2000);
		  driver.close();
		  
		  Thread.sleep(2000);
		  driver.quit();
		  
		  
		  
		  
		  

	}

}
