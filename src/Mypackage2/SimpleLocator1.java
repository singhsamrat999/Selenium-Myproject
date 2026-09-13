package Mypackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleLocator1 {

	public static void main(String[] args) throws InterruptedException {  // Added throws InterruptedException
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VENOM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		// initialization of webdriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		// by using ID locator
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("sam123@gmail.com");

		WebElement passwordField = driver.findElement(By.id("pass"));
		passwordField.sendKeys("Samrat@345");

		// by using Name locator
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();

		Thread.sleep(2000); // wait for 2 seconds

		// using TagName
		WebElement firstButton = driver.findElement(By.tagName("button"));
		System.out.println("First button text: " + firstButton.getText());

		// using link text locator 
		WebElement createAccount = driver.findElement(By.linkText("Create new account"));
		createAccount.click();

		Thread.sleep(2000); // wait for modal to open

		// ✅ using partial link text locator (corrected)
		WebElement forgottenPasswordPartial = driver.findElement(By.partialLinkText("Forgotten"));
		forgottenPasswordPartial.click();

		driver.quit();
	}
}
