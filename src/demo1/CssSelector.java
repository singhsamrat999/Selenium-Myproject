package demo1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	  
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();

		Thread.sleep(5000);


		//Tag Selector

		// Find First Input <> element on page

		WebElement tagsel = driver.findElement(By.cssSelector("input"));

		System.out.println("Tag Selector" +tagsel.getTagName());


		// Id Selector

		driver.findElement(By.cssSelector("input[name='email']")).clear();

		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Riya@123gmail.com");


		//Class Selector

		driver.findElement(By.cssSelector("input[class*='input']")).clear();

		driver.findElement(By.cssSelector("input[class*='input']")).sendKeys("Riya@123gmail.com");


		// attribute selector (attribute="value")

		driver.findElement(By.cssSelector("input[name=\"email\"]")).clear();

		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("Riya@123gmail.com");


		//attribute(tag+id)

		driver.findElement(By.cssSelector("input[id]")).clear();

		driver.findElement(By.cssSelector("input[id]")).sendKeys("Riya@123gmail.com");


		// (tag+class)

		driver.findElement(By.cssSelector("input.inputtext")).clear();

		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Riya@123gmail.com");


		//multiple attribute

		driver.findElement(By.cssSelector("input[name='email'][type='text']")).clear();

		driver.findElement(By.cssSelector("input[name='email'][type='text']")).sendKeys("Riya@123gmail.com");


		// exact match

		driver.findElement(By.cssSelector("input[name='email']")).clear();

		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Riya@123gmail.com");


		//contains

		driver.findElement(By.cssSelector("input[name*='mai']")).clear();

		driver.findElement(By.cssSelector("input[name*='mai']")).sendKeys("Riya@123gmail.com");


		//attribute (starts-with)

		driver.findElement(By.cssSelector("input[name^='em']")).clear();

		driver.findElement(By.cssSelector("input[name^='em']")).sendKeys("Riya@123gmail.com");


		// attribute (end-with)

		driver.findElement(By.cssSelector("input[name$='ail']")).clear();

		driver.findElement(By.cssSelector("input[name$='ail']")).sendKeys("Riya@123gmail.com");


		//parent child selector

		//select input that is direct child of div

		driver.findElement(By.cssSelector("div input[name='email']")).clear();

		driver.findElement(By.cssSelector("div input[name='email']")).sendKeys("Riya@123gmail.com");


		//Descendent SElector(space)

		driver.findElement(By.cssSelector("div input[name='email']")).clear();

		driver.findElement(By.cssSelector("div input[name='email']")).sendKeys("Riya@123gmail.com");


		//Grouping Selector(,)

		//find either email and password filed and clear both

		driver.findElement(By.cssSelector("input[name='email'], input[type='text']")).clear();

		driver.findElement(By.cssSelector("input[name='email'], input[type='text']")).sendKeys("Riya@123gmail.com");


		// nth child selector

		// may vary according to DOM structure

		// not used mostly ----------- used when structure is fixed

		driver.findElement(By.cssSelector("div input:nth-child(1)")).clear();

		driver.findElement(By.cssSelector("div input:nth-child(1)")).sendKeys("Riya@123gmail.com");


		driver.quit();



	}

}