package Mypackage;

public class Calculator {

	// Non-static method
    public int add(int a, int b) {
        return a + b;
    }
 
 // Another non-static method,this method will call first non-static methodi
    public int addThenMultiply(int a, int b, int multiplier) {
        int sum = this.add(a, b);
        return sum * multiplier; 
    }

    public static void main(String[] args) {
    	
    	// Creating an object of calculator
        Calculator cal = new Calculator();
        
     // call non-static method using object
        int result = cal.add(15, 12);
        System.out.println("15 + 12 = " + result);

        int complexResult = cal.addThenMultiply(15, 12, 10);
        System.out.println("(15 + 12) * 10 = " + complexResult);
    }
}
