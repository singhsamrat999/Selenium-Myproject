package MyPackageTestng3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void testngdemo() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\VENOM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver(); 
	  
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
	  driver.navigate().to("https://www.flipkart.com");
	  driver.navigate().refresh();
	  Thread.sleep(2000);
	  
	  driver.quit();
}
}