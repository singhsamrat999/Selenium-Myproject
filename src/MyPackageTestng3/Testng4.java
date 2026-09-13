package MyPackageTestng3;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Testng4 {
     
	@Test(invocationCount = 0)
	public void a() {
		System.out.println("This is a method ");
	}
	
	@Test(enabled = false) //this is industrial way to skip test cases
	public void b() {
		System.out.println("This is b method ");
	}
	
	
	public void c() {
		System.out.println("This is c method ");
		Object skipping;
		throw new SkipException(skipping c method);
		System.out.println("unreachable code");
	}
	

	public void d() {
		System.out.println("This is d method ");
	}
	
	@Test(enabled = false) 
	public void e() {
		System.out.println("This is e method ");
	}
}
