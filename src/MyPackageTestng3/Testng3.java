package MyPackageTestng3;

import org.testng.annotations.Test;

public class Testng3 {
	
	@Test(priority = 20)
	public void LoginModule() {
		System.out.println("This is LoginModule page");
	}
	
	@Test(priority = 90)
	public void PaymentModule() {
		System.out.println("This is PaymentModule page");
	}
	
	@Test(priority = 70)
	public void AddtoCartModule() {
		System.out.println("This is AddtoCartModule page");
	}
	
	@Test(priority = 0)
	public void LogoutModule() {
		System.out.println("This is LogoutModule page");
	}
	
	@Test(priority = 50)
	public void SearchFunctionalityModule() {
		System.out.println("This is SearchFunctionalityModule page");
	}
	
	@Test(priority = -20)
	public void ProductCategoryModule() {
		System.out.println("This is ProductCategoryModule page");
	}

}
