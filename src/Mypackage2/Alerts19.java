package Mypackage2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;   // ✅ Added for assertion

public class Alerts19 {

    public static void main(String[] args) throws InterruptedException {   // ✅ Added 'throws InterruptedException'
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\VENOM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Open demo QA alerts page
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        // Click on the Confirm Button to open alert
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(2000);

        // ✅ Fixed typo: 'swichTo' → 'switchTo'
        System.out.println(driver.switchTo().alert().getText());

        // Verify alert text
        String actualResult = driver.switchTo().alert().getText();
        String expResult = "Do you confirm action?";
        Assert.assertEquals(actualResult, expResult);

        // If both are equal
        System.out.println("Alert is verified successfully.");

        // Accept the alert
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        System.out.println("alert accepted");

        // Close browser
        driver.quit();
    }
}
