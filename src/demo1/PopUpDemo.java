package demo1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpDemo {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver",
	                "C:\\Users\\VENOM\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();
			
			//Implicit Wait()    ------------ it is for selenium 3 version not for 4
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     
		// Now launch the URL
		driver.get("https://demoqa.com/browser-windows");
		  
		Thread.sleep(2000);
		driver.findElement(By.id("windowButton")).click();
		
		// print how many windows are opened
		//return a set of unique window ids(each b rowser/windows/tab has its own handle)
		// here two windows open is parent window and another is child window opened whose i considered 
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		System.out.println("Windows are opened :" +allwindows.size());
		
		// since set  doesnot have  index we use an iterator
		Iterator<String> abc = allwindows.iterator();
		String Window1 = abc.next();
		String Window2 = abc.next();
		//Window1 = first window handle
		//it will go to the window2 for handling it
		
		
		// print the title of pop-up-window
		System.out.println(Window2);
		//window 2 alphanumeric value will be print
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		driver.quit();
		
		
		
	}

}