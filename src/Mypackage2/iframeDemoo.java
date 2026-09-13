package Mypackage2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; // ✅ Added this import
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeDemoo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\VENOM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Open W3Schools iframe example
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
        driver.manage().window().maximize();

        Thread.sleep(4000);
        
        // By executing javascriptExecutor --- for handling frames
        JavascriptExecutor exe = (JavascriptExecutor)driver;
        Long numberFrames = (Long) exe.executeScript("return window.length");
        System.out.println("number of iframes on the page: " + numberFrames);
        
        // switch to outer frame
        driver.switchTo().frame("iframeResult");
        
        // find the inner iframe element
        WebElement innerFrame = driver.findElement(By.xpath("//iframe"));
        
        // switch to inner frame
        driver.switchTo().frame(innerFrame);
        
        // Get the text inside the iframe
        WebElement heading = driver.findElement(By.tagName("h1")); // ✅ Corrected here
        String text = heading.getText();
        System.out.println("Text inside iframe: " + text);
        
        // Switch back to main content
        driver.switchTo().defaultContent();
        
        driver.quit();
	}
}
