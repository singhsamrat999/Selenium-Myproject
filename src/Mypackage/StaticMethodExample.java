package Mypackage;

public class StaticMethodExample {
	static void displaymessage(){
		System.out.println("print the static method");
	}
		
		static int square (int number) {
			return number*number;
		}
	
	public static void main(String[] args) {
		
		// Calling without class name
	     displaymessage();
	     int result = square (5);
    
	     System.out.println("square of 5 is :" +result);
	     
	  // Calling with class name
	     StaticMethodExample.displaymessage();
	     int result2 = StaticMethodExample.square(50);
	     System.out.println("square of 50 is :" + result2);
	}

}
