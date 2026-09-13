package Mypackage2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWebPage {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\VENOM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Set implicit wait and maximize window
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        // Open Facebook
        driver.get("https://www.facebook.com/");

        // Create object of JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // ✅ Scroll down by 400 pixels
        js.executeScript("window.scrollBy(0, 400);");
        Thread.sleep(2000);

        // ✅ Scroll up by 400 pixels
        js.executeScript("window.scrollBy(0, -400);");
        Thread.sleep(2000);

        // ✅ Scroll to specific element
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        Thread.sleep(2000);
        driver.quit();
    }
}
