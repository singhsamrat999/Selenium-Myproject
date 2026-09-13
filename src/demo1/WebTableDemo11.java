package demo1;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo11 {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver",
	                "C:\\Users\\VENOM\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        driver.navigate().to("https://money.rediff.com/gainers/bse/daily/groupall");

	        Thread.sleep(2000);

	        // create list allcompany whose present on the webpage

	        List<WebElement> allcompanies = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td[1]/a"));

	        System.out.println("Total no of companies:" + allcompanies.size());


	        // create the list of current price

	        // since price is unclickable to locate upto the tag

	        List<WebElement> currentprice = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td[4]"));

	        System.out.println("Total  currentprice:" + currentprice.size());


	        // to find company name and its current price

	        String ExpResult = "Mukta Agriculture";

	        for(int i = 0; i< allcompanies.size();i++) {

	        	      if(allcompanies.get(i).getText().equalsIgnoreCase(ExpResult)) {

	        	    	  System.out.println(allcompanies.get(i).getText()+"------"+currentprice.get(i).getText());

	        	    	  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({block:'center'});", allcompanies.get(i));

	        	    	  Thread.sleep(1000);

	        	    	  allcompanies.get(i).click();

	        	      }

	        }

	}

}