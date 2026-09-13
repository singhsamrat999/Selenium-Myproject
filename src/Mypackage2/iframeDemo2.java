package Mypackage2;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class iframeDemo2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\VENOM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // ✅ Add this part to handle mismatch
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
        driver.manage().window().maximize();

        driver.switchTo().frame("iframeResult");
        System.out.println("Switched to outer frame");

        WebElement innerFrame = driver.findElement(By.xpath("//iframe"));
        System.out.println("Switched to inner frame");

        driver.switchTo().frame(innerFrame);
        WebElement heading = driver.findElement(By.tagName("h1"));
        System.out.println("Text inside inner frame: " + heading.getText());

        driver.quit();
    }
}
