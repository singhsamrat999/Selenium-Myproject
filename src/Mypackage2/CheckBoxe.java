package Mypackage2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxe {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\VENOM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Launch the application
        driver.navigate().to("https://www.letskodeit.com/practice");
        Thread.sleep(2000);

        // Find all checkboxes on the webpage
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("Total no of checkboxes: " + checkboxes.size());

        int count = 0;
        for (WebElement box : checkboxes) {
            if (!box.isSelected()) {
                box.click();
                count++;
                System.out.println("Checkbox selected: " + box.getAttribute("value"));
            }

            // Stop after selecting 2 checkboxes
            if (count == 2) {
                break;
            }
        }

        // Verification
        System.out.println("Total no of selected checkboxes: " + count);

        // Optional: Verify which checkboxes are selected
        for (WebElement box : checkboxes) {
            System.out.println("Checkbox: " + box.getAttribute("value") + " | Selected: " + box.isSelected());
        }

        // Close the browser
        Thread.sleep(2000);
        driver.quit();
    }
}
