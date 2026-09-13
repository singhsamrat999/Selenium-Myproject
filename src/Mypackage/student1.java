package Mypackage;

public class student1 {
	String name;
	int age;
	
	// Default constructor
	
	student1(){
		name = "unknown";
		age = 0;
		
		System.out.println("default constructor called ");
	}
	
	// Parameterized constructor

   student1 (String n, int a){
	   name = n;
	   age = a;
	   System.out.println("parameterize constructor called ");
   }
   
   
   // Display method
   
   void display() {
	   System.out.println("Name: " + name + ", Age: " + age);
   }
	public static void main(String[] args) {
		
		 // Using default constructor
		
		student1 s1 = new student1();
		s1.display();
		
		// Using parameterized constructor
		
		student1 s2 = new student1("sam", 22);
		s2.display();
	}

}
