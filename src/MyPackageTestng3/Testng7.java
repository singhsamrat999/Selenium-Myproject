package MyPackageTestng3;

import org.testng.annotations.Test;

public class Testng7 {
	
	@Test
	public void OpenBrowser() {
		System.out.println("Open Browser");
	}
	
	@Test(dependsOnMethods = "OpenBrowser")
	public void Loginpage() {
		System.out.println("Logging into the application");
	}
	
	@Test(dependsOnMethods = "Loginpage")
	public void navigatetoHomepage() {
		System.out.println("Navigating to Homepage");
	}
	
	@Test(dependsOnMethods = "navigatetoHomepage")
    public void searchFunctionality() {
		System.out.println("Navigating the searchbar");
	}
	
	@Test(dependsOnMethods = "searchFunctionality")
	public void addToCart() {
		System.out.println("Navigating to addToCart");
	}
	
	@Test(dependsOnMethods = "addToCart")
	public void payment() {
		System.out.println("Navigating to payment");
	}

}
