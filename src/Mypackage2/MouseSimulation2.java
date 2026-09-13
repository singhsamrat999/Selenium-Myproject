package Mypackage2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseSimulation2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\VENOM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        // Open jQuery Droppable page
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        // ✅ Create the list of frames
        List<WebElement> allframes = driver.findElements(By.tagName("iframe"));
        System.out.println("Total number of iframes: " + allframes.size());

        // ✅ Switch to first frame
        driver.switchTo().frame(0);

        System.out.println("Switched to the first iframe successfully!");

        driver.quit();
    }
}
