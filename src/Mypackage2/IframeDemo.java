package Mypackage2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\VENOM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Open jQuery Droppable page
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        Thread.sleep(4000);
        
        //By executing javascriptExecutor---for hnadling frames
        //By type casting
        JavascriptExecutor exe = (JavascriptExecutor)driver;
        Integer numberFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
        System.out.println("number of iframes on the page:" +numberFrames);
        
        //find all webelement  having iframe
        List<WebElement>iframeElement = driver.findElements(By.tagName("iframe"));
        System.out.println("Total no of iframes :" +iframeElement.size());
        
        //by webelement
        
        WebElement iframe = driver.findElements(By.xpath("//iframe[@id='iframe1']"));
        driver.switchTo().frame(iframe);
        
        
        
	}

}
