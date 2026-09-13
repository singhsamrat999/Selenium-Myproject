package demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandlingDemo9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
	    		"C:\\Users\\VENOM\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			
			// click create account
			driver.findElement(By.xpath("//span[text()=\"Create new account\"]")).click();
			
			//By using select by using index()
		   List<WebElement> birtMonth = driver.findElements(By.xpath("//span[text()='Month']/ancestor::div[@role='combobox']"));
		   System.out.println("Total no of birthMonth :" +birtMonth);
		   birtMonth.get(12).click();
		   
		   // 2nd way by using visible text
		   
		   WebElement bm =driver.findElement(By.xpath(null));
		   

	}

}
