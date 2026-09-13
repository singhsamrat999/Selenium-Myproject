package Mypackage2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeDemo3 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\VENOM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        // Open W3Schools iframe example
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");

        // Switch to first iframe on the webpage
        driver.switchTo().frame("iframeResult");
        System.out.println("Switched to outer iframe");

        // ✅ FIXED: use findElement (not findElements)
        WebElement innerFrame = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(innerFrame);
        System.out.println("Switched to inner iframe");

        // ✅ FIXED: use findElement (not findElements)
        WebElement heading = driver.findElement(By.xpath("//h1"));
        System.out.println("Text inside inner frame: " + heading.getText());

        // Switch back to main content
        driver.switchTo().defaultContent();
        System.out.println("Switched to main content");

        // Close browser
        driver.quit();
    }
}
