package Mypackage2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\VENOM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        // Open Google
        driver.get("https://www.google.com");

        // ✅ Use stable locator instead of changing textarea ID
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("How stuff works");

        // Wait for suggestions to load
        Thread.sleep(2000);

        // ✅ Correct XPath for suggestions
        List<WebElement> allSuggestions = driver.findElements(
                By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
        System.out.println("Total auto-suggestions: " + allSuggestions.size());

        // ✅ Expected suggestion to click
        String ExpResult = "how stuff works for kids";

        for (int i = 0; i < allSuggestions.size(); i++) {
            String suggestionText = allSuggestions.get(i).getText();
            System.out.println((i + 1) + ". " + suggestionText);

            if (suggestionText.equalsIgnoreCase(ExpResult)) {
                allSuggestions.get(i).click();
                break;
            }
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
