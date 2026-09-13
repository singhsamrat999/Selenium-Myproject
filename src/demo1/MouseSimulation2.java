package demo1;

import java.util.List;

import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class MouseSimulation2 {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver",
                 "C:\\Users\\VENOM\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();


		//Implicit Wait()    ------------ it is for selenium 3 version not for 4
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.navigate().to("https://jqueryui.com/draggable/");

		  driver.manage().window().maximize();

		  Thread.sleep(2000);

		  // create the list of frames

		  List<WebElement> allframes = driver.findElements(By.tagName("iframe"));

	        System.out.println("Total number of iframes: " + allframes.size());

	        driver.switchTo().frame(0);



	        // drag the element

	        WebElement draggable = driver.findElement(By.id("draggable"));  

	        Thread.sleep(2000);

	        //drag

	        Actions act = new Actions(driver);

	        act.dragAndDropBy(draggable, 100 , 50).build().perform();



	        Thread.sleep(2000);

	        // click and hold method

	        act.clickAndHold(draggable).dragAndDropBy(draggable, 100 , 90).build().perform();


	        Thread.sleep(2000);

	        driver.quit();

	}

}