package demo1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertsDemo18 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VENOM\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);

		// Locate the prompt button
		WebElement promptBtn = driver.findElement(By.id("promtButton"));

		// Scroll to element to prevent ad overlay blocking
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", promptBtn);
		Thread.sleep(1000);

		// Click using JavaScript to avoid ad overlay click interception
		js.executeScript("arguments[0].click();", promptBtn);
		Thread.sleep(2000);

		// 1. Fetch Alert Text
		String actualResult = driver.switchTo().alert().getText();
		System.out.println("Alert Text: " + actualResult);

		// 2. Compare Expected and Actual Text for Prompt Box
		String expResult = "Please enter your name";
		Assert.assertEquals(actualResult, expResult);
		System.out.println("Alert Text Verified Successfully!");

		// 3. Optional: Send text to the prompt box before accepting
		driver.switchTo().alert().sendKeys("Samrat");

		// 4. Accept the Alert
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("Alert Accepted");

		Thread.sleep(2000);
		driver.quit();
	}
}