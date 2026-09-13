package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VENOM\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		
WebDriver driver = new ChromeDriver();
//maximise the window
driver.manage().window().maximize();

//suppose i want a make my application to wait 2 sec before performing 
Thread.sleep(2000);
//launch the url 
driver.get("https://www.facebook.com/");
// refresh the page
driver.navigate().refresh();
//suppose i want to navigate back
Thread.sleep(2000);
driver.navigate().back();
//suppose i want to navigate forword
Thread.sleep(2000);
driver.navigate().forward();
//i want to get current url
Thread.sleep(2000);
System.out.println(driver.getCurrentUrl());
//get title page
Thread.sleep(2000);
System.out.println(driver.getTitle());
//close window
Thread.sleep(2000);
driver.close();
// close entire window
Thread.sleep(2000);
driver.quit();


	}
 
}
