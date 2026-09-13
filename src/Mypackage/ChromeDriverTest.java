package Mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\VENOM\\Downloads\\chromedriver-win64.zip\\chromedriver-win64.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	
	}

}
