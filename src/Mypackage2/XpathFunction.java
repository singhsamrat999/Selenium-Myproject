package Mypackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFunction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VENOM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		// initialization of webdriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// 1. contains()
		WebElement email = driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		email.sendKeys("Samrat@1234");
		
		// 2. starts-with()
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@id,'pass')]"));
		password.sendKeys("sam@123445");
		
		// 3. text()
		WebElement forgottenPassword = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		forgottenPassword.click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		// 4. normalize-space()
		WebElement forgottenPassword2 = driver.findElement(By.xpath("//a[normalize-space(text())='Forgotten password?']"));
		System.out.println("Normalized link text: " + forgottenPassword2.getText());
		
		// 5. last()
		WebElement lastInput = driver.findElement(By.xpath("(//input)[last()]"));
		System.out.println("Last Input Tag 'name' attribute: " + lastInput.getAttribute("name"));
		
		// 6. position()
		WebElement position = driver.findElement(By.xpath("(//input)[position()=3]"));
		System.out.println("Third input tag id: " + position.getAttribute("id"));
		
		// 7. and / or
		WebElement email2 = driver.findElement(By.xpath("//input[@id='email' and @name='email']"));
		System.out.println("Found with AND condition: " + email2.getAttribute("id"));
		
		// 8. not()
		WebElement notExample = driver.findElement(By.xpath("//input[not(@id='pass')]"));
		System.out.println("Input found using NOT: " + notExample.getAttribute("id"));
		
		// 9. string-length()
		WebElement stringLength = driver.findElement(By.xpath("//input[string-length(@id)>3]"));
		System.out.println("Element with string length > 3: " + stringLength.getAttribute("id"));
		
		// 10. concat()
		WebElement email3 = driver.findElement(By.xpath("//input[@id=concat('em','ail')]"));
		System.out.println("Concat matched id: " + email3.getAttribute("id"));
		
		Thread.sleep(2000);
		driver.quit();
	}
}
