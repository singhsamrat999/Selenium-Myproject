package Mypackage2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions; // ✅ fixed import

public class MouseSimulation3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\VENOM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Open jQuery Droppable page
        driver.get("https://jqueryui.com/draggable/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        // ✅ Create the list of frames
        List<WebElement> allframes = driver.findElements(By.tagName("iframe"));
        System.out.println("Total number of iframes: " + allframes.size());

        // ✅ Switch to first frame
        driver.switchTo().frame(0);

        // ✅ drag the element (fixed findElements → findElement)
        WebElement draggable = driver.findElement(By.id("draggable"));
        
        // ✅ drag the element 
        // ✅ mention the coordinate
        Actions act = new Actions(driver); // fixed class name and constructor
        act.dragAndDropBy(draggable,100,90).build().perform(); // fixed method usage
        
        Thread.sleep(2000);
        
        // ✅ click and hold (fixed method name capitalization)
        act.clickAndHold(draggable).moveByOffset(150,130).release().build().perform(); // fixed method
        
        Thread.sleep(2000);
        
        driver.quit(); // ✅ added to close browser properly
	}

}
