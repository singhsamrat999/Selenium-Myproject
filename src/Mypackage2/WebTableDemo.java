package Mypackage2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class WebTableDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\VENOM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Maximize the window
        driver.manage().window().maximize();

        // Launch the application
        driver.navigate().to("https://money.rediff.com/gainers");
        Thread.sleep(2000);

        // ✅ Find all company names
        List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
        System.out.println("Total number of companies: " + allCompanies.size());

        // ✅ Find all current prices
        List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
        System.out.println("Total current prices: " + currentPrices.size());

        // ✅ Expected company to search for
        String expResult = "Aptus Pharma";

        // ✅ Loop through the list and match company name
        for (int i = 0; i < allCompanies.size(); i++) {
            String companyName = allCompanies.get(i).getText();
            String price = currentPrices.get(i).getText();

            if (companyName.equalsIgnoreCase(expResult)) {
                System.out.println(companyName + " ------- " + price);

                // ✅ Scroll into view before clicking
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true);", allCompanies.get(i));
                Thread.sleep(1000);

                // ✅ Click using JavaScript to avoid interception
                js.executeScript("arguments[0].click();", allCompanies.get(i));
                break;
            }
        }

        // ✅ Wait and close browser
        Thread.sleep(3000);
        driver.quit();
    }
}
