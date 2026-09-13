package Mypackage;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		// create the scanner object to read inputs
		Scanner Sc = new Scanner(System.in);
		
		// Ask user for inputs

		System.out.println("Enter your name");
		String name = Sc.nextLine();// Reads the string input
		System.out.println("Enter your age");
		int age = Sc.nextInt();
		 Sc.nextLine();
		System.out.println("Enter your gender");
		String gender = Sc.nextLine();
		System.out.println("Eneter your Cgpa");
		double Cgpa = Sc.nextDouble();
		
		// Display the inputs
		System.out.println("Name :" + name);
		System.out.println("Age : " + age);
		System.out.println("Gender :" + gender);
		System.out.println("Cgpa :" + Cgpa);
		Sc.close();// close the scanner to avoid the resource leak
		
	}

}
