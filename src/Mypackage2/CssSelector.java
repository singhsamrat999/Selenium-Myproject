package Mypackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VENOM\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		// initialization of webdriver 
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
			  
		Thread.sleep(2000);
			  
		// Tag selector
		// find First <input> element on page
		WebElement tagSel = driver.findElement(By.cssSelector("input"));
		System.out.println("Tag Selector:" + tagSel.getTagName());
			  
		// id selector(#)
		driver.findElement(By.cssSelector("#email")).sendKeys("Sam123@gmail.com");
		System.out.println();
			  
		// Class selector(.)
		driver.findElement(By.cssSelector(".inputtext")).clear();
		driver.findElement(By.cssSelector(".inputtext")).sendKeys("Samrat123@gmail.com");
			  
		// Attribute selector ([attribute='value'])
		driver.findElement(By.cssSelector("input[name='email']")).clear();
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Samrat8903@gmail.com");
			  
		// Tag+id
		driver.findElement(By.cssSelector("input#email")).clear(); 
		driver.findElement(By.cssSelector("input#email")).sendKeys("Samrat500@gmail.com");
			  
		// Tag+ class
		driver.findElement(By.cssSelector("input.inputtext")).clear();
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Golu123@gmail.com");
			  
		// Attribute starts with (^=)
		driver.findElement(By.cssSelector("input[name^='em']")).clear();
		driver.findElement(By.cssSelector("input[name^='em']")).sendKeys("Golu123@gmail.com");
			  
		// Attribute ends with ($=)
		driver.findElement(By.cssSelector("input[name$='il']")).clear();
		driver.findElement(By.cssSelector("input[name$='il']")).sendKeys("Golu123@gmail.com");
			  
		// Attribute contains (*=)
		driver.findElement(By.cssSelector("input[name*='mai']")).clear();
		driver.findElement(By.cssSelector("input[name*='mai']")).sendKeys("Golu123@gmail.com");
			  
		// multiple Attribute Selector
		driver.findElement(By.cssSelector("input[name='email'][id='email'][type='text']")).clear();
		driver.findElement(By.cssSelector("input[name='email'][id='email'][type='text']")).sendKeys("Golu123@gmail.com");
			  
		// parent-child selector(>)
		// selects input that is direct child of div
		driver.findElement(By.cssSelector("div > input[name='email']")).clear();
		driver.findElement(By.cssSelector("div > input[name='email']")).sendKeys("Golu123@gmail.com");
			  
		// Descendant selector(space)
		// selected input inside div at any level
		driver.findElement(By.cssSelector("div input[name='pass']")).sendKeys("shubham@123");
			  
		// Grouping selector(,)
		// find email or pass field and clear both
		driver.findElement(By.cssSelector("input#email, input#pass")).clear();
			  
		// nth child selector
		// may vary according to DOM structure
		// not used mostly. used only when structure is fixed 
		driver.quit();
	}
}
