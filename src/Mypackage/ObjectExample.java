package Mypackage;

class Student {
    String name;
    int age;
    String course;
    
}

public class ObjectExample {
	

	public static void main(String[] args) {
		
		 
		        Student s1 = new Student(); // Create object of Student

		        s1.name = "Samrat";
		        s1.age = 22;
		        s1.course = "Java";

		        System.out.println("Student name: " + s1.name);
		        System.out.println("Student age: " + s1.age);
		        System.out.println("Student course: " + s1.course);
		        
		        Student s2 = new Student();
		        
		
		        s2.name = "Shubham";
		        s2.age = 17;
		        s2.course = "Python";
		        
		        System.out.println("student name:" +s2.name);
		        System.out.println("student age:" +s2.age);
		        System.out.println("student course:" +s2.course);


		     

		    }
		}