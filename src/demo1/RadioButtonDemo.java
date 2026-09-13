package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.tools.javac.util.List;  

public class RadioButtonDemo {

	private static Object radios1;

	public static <WebElement> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VENOM\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//locate url
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		
	    driver.findElement(By.xpath("//span[text()='Create new account']")).click();
	    
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(
		        By.xpath("//div[@role='listbox']")
		)).click();
		driver.findElement(By.xpath("//div[text()=\"Female\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"Custom\"]")).click();
		
		//2nd method
		
		java.awt.List<WebElement> radios =driver.findElement(By.xpath("//div[@role=\"listbox\"]")).click();
		
		//find the total size of radio button
		System.out.println("Total no of radios :" + radios.size());
		
		//supppose  in the list u want to choose only one radio button then go-------------indexing concept
		
	
		 System.out.println(radios.getX(male).isEnabled());
		 System.out.println(radios.getX(Female).isEnabled());
		 System.out.println(radios.getX(Custom).isEnabled());
		 
		 System.out.println(By.xpath(//div[text()=\"Female\"));
				 System.out.println(By.xpath(//div[text()=\"Female\"));
						 System.out.println(By.xpath(//div[text()=\"Female\"));
		 
		 
		


	}

}
