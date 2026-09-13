package demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo10 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\VENOM\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.letskodeit.com/practice");

        Thread.sleep(2000);

        // Find all checkboxes on web
        List<WebElement> checkboxes =
                driver.findElements(By.xpath("//input[@type='checkbox']"));

        System.out.println("Total no of checkboxes: " + checkboxes.size());

        // Find all car checkboxes on web
        //findelements return list of all matching elements
        List<WebElement> carcheckboxes =
                driver.findElements(By.xpath("//input[@name='cars']"));

        System.out.println("Total no of car checkboxes: " + carcheckboxes.size());

        // At least 2 checkboxes I want to select
        // create counter variable to count and to track the how many check boxes you have selected
        int count = 0;
        
        // start for each loop  to go through checkbox one by one in the list 
        for (WebElement checkbox : checkboxes) {
        // check if current checkbox is not already selected
        	//it is unchecked , then will click on it
            if (!checkbox.isSelected()) {

                checkbox.click();

                count++;

                System.out.println(
                    "Checked: " + checkbox.getAttribute("value"));
            }

            // Stop after selecting 2 checkboxes
            // after 2 checkboxes is selected ,then this loop is stop
            if (count == 2) {
                break;
            }
        }

        // Verification
        System.out.println(
            "Total no of selected checkbox: " + count);

        // optional which  checkboxes are selected
        //loop runs again to check all checkboxes to verify which one is selected
        // true : when checkbox is ticked 
        //false: not checkbox ticked
        for (WebElement checkbox : checkboxes) {

            System.out.println(
                "Checkbox: " + checkbox.getAttribute("value")
                + " | Selected: " + checkbox.isSelected() );
        }

        // Close the browser
        Thread.sleep(2000);

        driver.quit();
    }
}