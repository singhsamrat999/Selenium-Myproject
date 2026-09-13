package MyPackageTestng3;

import org.testng.annotations.Test;

public class Testng6 {
	
	@Test(invocationCount = 2)
	public void login() {
		System.out.println("This is login test case");
	}
	
	@Test(priority = 5 , invocationCount = -3)
	public void AddToCart() {
		System.out.println("This is AddToCart test case");
	}
	
	@Test(invocationCount = 2 , priority = -2 , enabled = false)
	public void payment() {
		System.out.println("This is payment test case");
	}
	
	@Test(priority = -2 ,invocationCount = 1)
	public void discount() {
		System.out.println("This is discount test case");
	}
	
	@Test(invocationCount = 3)
	public void logout() {
		System.out.println("This is logout test case");
	}
	


}
