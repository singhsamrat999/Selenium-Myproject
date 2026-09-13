package Mypackage;

public class ObjectMethodExample {
	  int age;
	  String name;
	  
	 
	public static void main(String[] args) {
		
		// Create first object
	       ObjectMethodExample obj1 = new ObjectMethodExample();
	        obj1.name = "Shubham Singh";
	        obj1.age = 17;
	        
	    // Create Second Object
	        ObjectMethodExample obj2 = new ObjectMethodExample();
	        obj2.name = "Samrat Singh";
	        obj2.age = 22;
   
	     // to string() --Returns a String representation of object
	        System.out.println("toString method : " + obj1.toString());
	        System.out.println("toString method : " + obj2.toString());
	        
	        
	       // hash code value of object
			System.out.println("To Hashcode value of object :" + obj1.hashCode());
			System.out.println("To Hashcode value of Object :" + obj2.hashCode());
			
			// equals() ---Compares two objects for equality
			System.out.println("Equals Method Result :" + obj1.equals(obj2));

			
			// getClass() ---returns type of class
			System.out.println("Get Class Method :" + obj1.getClass());
			System.out.println("Get Class Method :" + obj2.getClass());


	    }
	}