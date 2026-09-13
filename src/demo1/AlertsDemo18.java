package demo1;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class AlertsDemo18 {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver",

	                "C:\\Users\\VENOM\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();

			//Implicit Wait()    ------------ it is for selenium 3 version not for 4

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Now launch the URL

		driver.get("https://demoqa.com/alerts");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();

		Thread.sleep(3000);

		// to verify the alert

		// first check the alert text

		System.out.println(driver.switchTo().alert().getText());
		System.out.println("Allert Accepted");
	
		
		// compare expected and alert text are same or not
		//for that we have used to assertion concept
		//testng have assert equal method which allow the comaprision
		//add testng jar file to allow assert methods in program
		//comparing the text
		
		String actualResult =driver.switchTo().alert().getText();
		String expResult ="Do you confirm action?";
		Assert.assertEquals(actualResult, expResult);
		//if both are equal 
		System.out.println("Allert is varified");
		
		//now to accept the allert
		Thread.sleep(2000);
		driver.switchTo().alert().accept();		
		
		

	}

}