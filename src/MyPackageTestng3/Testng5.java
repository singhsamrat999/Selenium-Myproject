   package MyPackageTestng3;


	

	import org.testng.annotations.Test;

	
	public class Testng5 {
		@Test(invocationCount = 2)
		public void Login() {
			System.out.println("This is Login test case");
		}
		
		@Test(invocationCount = 8)
		public void Payment() {
			System.out.println("This is Payment test case");
		}
		
		@Test(priority = -6)
		public void AddtoCart() {
			System.out.println("This is AddtoCart test case");
		}
		
		@Test(invocationCount = 9)
		public void Logout() {
			System.out.println("This is Logout test case");
		}
		
		@Test(invocationCount = 4)
		public void SearchFunctionality() {
			System.out.println("This is SearchFunctionality test case");
		}
		
		@Test(invocationCount = -4)
		public void ProductCategory() {
			System.out.println("This is ProductCategory test case");
		}

	}



