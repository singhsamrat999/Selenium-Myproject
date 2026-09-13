package Mypackage;

public class Studentt1 {
   String name;
   int age;
   
   Studentt1(){ // Default constructor (automatically make)
	   name = "Unknown";
	   age = 0;
	   
   }
   
  void show() {
	  System.out.println("Name: " + name + ", Age: " + age);
  }
}
