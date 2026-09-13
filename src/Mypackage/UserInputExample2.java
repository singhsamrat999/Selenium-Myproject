package Mypackage;

import java.util.Scanner;




public class UserInputExample2 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		// 1. Rectangle Area & Perimeter
		
		System.out.println("Enter your length of rectangle");
		double length = Sc.nextDouble();
		System.out.println("Enter your breadth of rectangle");
		double breadth = Sc.nextDouble();
		
		double area = length * breadth;
		double perimeter = 2 * (length + breadth);
		
       
		System.out.println("length :" + length);
		System.out.println("breadth :" + breadth);
		System.out.println("Area :" + area);
		System.out.println("Perimeter :" + perimeter);
		
		// 2. Simple Interest Calculator
//		Input:
//
//			Principal (int),Rate of Interest (float),Time in years (int)
//			Output:
//            Simple Interest = (P × R × T) / 10
		
		
		System.out.println("Enter the priciple");
		int principle = Sc .nextInt();
		System.out.println("Enter the rate");
		float  rate = Sc.nextFloat();
		System.out.println("Enter the time ");
		int time = Sc.nextInt();
		
		float simpleInterest = principle*rate*time/100;
		
		System.out.println("principle :" + principle);
		System.out.println("rate :" + rate);
		System.out.println("time :" + time);
		System.out.println("simpleInterest :" + simpleInterest);
		
		
		
		////3. Circle Area & Circumference
		    
		System.out.println("Enter the radius");
		float radius = Sc.nextFloat();

		// Use Math.PI for better accuracy
//	     double area  = Math.PI * radius * radius;
//		double circumference = 2 * Math.PI * radius;
//
//		System.out.println("Radius        : " + radius);
//		System.out.println("Area          : " + area);
//		System.out.println("Circumference : " + circumference);

		
		// 4. Sum & Average of 3 Numbers
		
		
//		System.out.println("enter the  first no.");
//		int a = Sc.nextInt();
//
//		System.out.println("enter the  second no.");
//		float b = Sc.nextFloat();
//
//		System.out.println("enter the third no.");
//		int c = Sc.nextInt();
//
//		double sum = a + b + c;
//		double average = (a + b + c) / 3.0;
//
//		System.out.println("a :" + a);
//		System.out.println("b :" + b);
//		System.out.println("c :" + c);
//		System.out.println("sum :" + sum);
//		System.out.println("average :" + average);
		
		//Student Grade
		
		System.out.println("Enter marks of Sub1:");
		int sub1 = Sc. nextInt();
		
		System.out.println("Enter marks of Sub2:");
		int sub2 = Sc. nextInt();
		
		System.out.println("Enter marks of Sub3:");
		int sub3 = Sc. nextInt();
			
		
		int total = sub1+sub2+sub3;
		 double percentage = total / 3.0;
		 
		 System.out.println("Total Marks: " + total);
	     System.out.println("Percentage: " + percentage);
	     
	     if (percentage >= 60) {
	            System.out.println("Result: First Division");
	        } else if (percentage >= 45) {
	            System.out.println("Result: Second Division");
	        } else {
	            System.out.println("Result: Fail");
	        }
	     Sc.close();
	}

}
