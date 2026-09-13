package Mypackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\VENOM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Launch URL
        driver.get("https://www.facebook.com/");

        // ✅ Selenium 3.x syntax (integer timeout)
        WebDriverWait wait = new WebDriverWait(driver, 20);

        // Wait for elements
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
