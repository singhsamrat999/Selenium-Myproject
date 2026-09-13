package MyPackageTestng3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng1 {
    
	@Test
	public void a2() {
		System.out.println("This is a2 method");
	}
	
		@BeforeTest
		public void b2() {
		    System.out.println("This is b2 method");
		}

		@BeforeSuite
		public void c2() {
		    System.out.println("This is c2 method");
		}

		@AfterMethod
		public void d2() {
		    System.out.println("This is d2 method");
		}

		@BeforeClass
		public void e2() {
		    System.out.println("This is e2 method");
		}

		@AfterMethod
		public void f2() {
		    System.out.println("This is f2 method");
		}

		@AfterTest					
		public void g2() {
		    System.out.println("This is g2 method");
		}
 
		@AfterClass
		public void h2() {
		    System.out.println("This is h2 method");
		}
						
		@BeforeMethod
		public void i2() {
		    System.out.println("This is i2 method");
		}
		
		@AfterSuite
		public void j2() {
			System.out.println("This is j2 method");

		}
		
		@Test
		public void j2() {
			System.out.println("This is j2 method");

		}
		
		@Test
		public void j2() {
			System.out.println("This is j2 method");

		}
		
		@Test
		public void j2() {
			System.out.println("This is j2 method");

		}
}

