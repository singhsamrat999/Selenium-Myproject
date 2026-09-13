package Mypackage;

public class StringEqualsDemo {

    public static void main(String[] args) {
        String str1 = "HELLO";
        String str2 = "HELLO";
        String str3 = new String("Hello");
        String str4 = new String("HELLO");

        // using == Operator
        System.out.println("str1==str2 : " + (str1 == str2));//true
        System.out.println("str1==str3 : " + (str1 == str3));//false
        System.out.println("str3==str4 : " + (str3 == str4));//false

        // using equals() method
        System.out.println("Comparing :" +str1.equals(str2));//true
		System.out.println("Comparing :" +str1.equals(str3));//true
		System.out.println("Comparing :" +str3.equals(str4));//true

    }
}
