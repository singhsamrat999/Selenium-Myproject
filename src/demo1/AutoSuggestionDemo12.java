package demo1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDemo12 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		
		 System.setProperty("webdriver.chrome.driver",
	                "C:\\Users\\VENOM\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();
			
			//Implicit Wait()    ------------ it is for selenium 3 version not for 4
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      
	
			driver.navigate().to("https://www.google.com");
			
			// handle search box
			WebElement autosuggestion = driver .findElement(By.xpath("//textarea[@id=\"ti6dpd\"]"));
			autosuggestion.sendKeys("How stuff work");
			
			// Handling Autosuggestion for how stuff work
			List<WebElement>allsuggestion = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
			System.out.println(" All Auto Suggestion list:" +allsuggestion.size());
			
			Thread.sleep(2000);
			
			// i want to find how to things work
			for(int i=0; i<allsuggestion.size(); i++) {
				String ExpResult = "how to things work";
				if(allsuggestion.get(i).getText().equalsIgnoreCase(ExpResult)) { //pahle all suggestion kke liye index method lgyaenge  jb get text lgayemnge  jbtk o chij mil nhi jata  satyh me ignore lagyenge kyki baki sab ko ignore kare
					allsuggestion.get(i).click();
					break;
					
				}
				
			}
			
	}

}
