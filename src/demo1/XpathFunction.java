package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class XpathFunction {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
    		"C:\\Users\\VENOM\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		driver.manage().window().maximize();
		
	//using contains function()
		WebElement email = driver.findElement(By.xpath("//input[contains(@name,'email')]"));
		email.sendKeys("samrat896@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[starts-with(@type,'password')]"));
		password.sendKeys("samrat@123");
		
		
		WebElement forgottenpassword = driver.findElement(By.xpath("//span[text()='Forgotten password?']"));
		forgottenpassword.click();
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		// using normalize-space
		WebElement forgottenPassword2 = driver.findElement(By.xpath("//span[normalize-space(text())='Forgotten password?']"));
		System.out.println("Normalized link text: " + forgottenPassword2.getText());
		
		//using last()
		WebElement lastInput = driver.findElement(By.xpath("(//input)[last()]"));
		System.out.println("Last input Tag 'name' attribute: "+lastInput.getAttribute("lastInput"));
		
		//using position()
		WebElement position = driver.findElement(By.xpath("(//input)[position()=3]"));
		System.out.println("Third input Tag id " +position.getAttribute("id"));
		
		//using and()
//		WebElement email2 = driver.findElement(By.xpath("//input[@id='email' and @name='email']"));
//		System.out.println("Found with AND condition: " + email2.getAttribute("id"));
//		
				
		//not () 
		WebElement password2 = driver.findElement(By.xpath("//input[not(@name=\"pass\")]"));
		System.out.println("Input found using Not" +password2.getAttribute("name"));
		
		//string-length()
		WebElement stringlength = driver.findElement(By.xpath("//input[string-length(@name)>3]"));
		System.out.println("Element with string length > 3: " + stringlength.getAttribute("name"));
		
		//concat()
		WebElement email3 = driver.findElement(By.xpath("//input[@name=concat('em','ail')]"));
		System.out.println("Concat matched id: " + email3.getAttribute("name"));
		
		Thread.sleep(3000);
		driver.quit();
	}

}
