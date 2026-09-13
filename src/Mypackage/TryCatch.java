package Mypackage;

public class TryCatch {
	

	public static void main(String[] args) {
		try {
			int a = 10;
			int b= 0;
			int c = a/b; // error divided by zero.
			System.out.println("Result :" +c);
		}
		catch(ArithmeticException e){
			System.out.println("⚠ Error: Cannot divide by zero!");
		}

	}

}
