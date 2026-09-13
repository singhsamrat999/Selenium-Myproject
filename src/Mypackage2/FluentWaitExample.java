package Mypackage2;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample {   // ✅ renamed class to avoid name conflict

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\VENOM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Launch URL
        driver.get("https://www.facebook.com/");

        // ✅ Create FluentWait object
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))      // Maximum wait time
                .pollingEvery(Duration.ofSeconds(5))      // Polling interval
                .ignoring(NoSuchElementException.class);  // Ignore NoSuchElementException

        // ✅ Use ExpectedConditions with FluentWait
        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));

        // Perform actions
        email.sendKeys("sam123@gmail.com");
        password.sendKeys("123456@");
        login.click();

        driver.close();
    }
}
