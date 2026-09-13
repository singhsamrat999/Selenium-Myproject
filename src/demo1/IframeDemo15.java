package demo1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IframeDemo15 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
                 "C:\\Users\\VENOM\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

		// Chrome Options setup
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized"); // Directly maximized window open karega
		options.addArguments("--remote-allow-origins=*"); // Connection issues se bachane ke liye

        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/frames");

        // Purani driver.manage().window().maximize() line hata di hai

        Thread.sleep(4000);

        JavascriptExecutor exe = (JavascriptExecutor) driver;

        Integer numberFrames = Integer.parseInt(
        		exe.executeScript("return window.length").toString());

        System.out.println("number of iframes on the page: " + numberFrames);
        
      //find all webelement  having iframe
        List<WebElement> iframeElement = driver.findElement(By.id("frame1"));
        System.out.println("Total no of iframe:" +iframeElement.size() );
        

        //switch by value
        driver.switchTo().frame("frame1");
        driver.quit();
        
        //by webelement
        WebElement iframe =driver.findElement(By.xpath("//iframe[@id=\"frame1\"]"));
        driver.switchTo().frame("iframe");
	}
}