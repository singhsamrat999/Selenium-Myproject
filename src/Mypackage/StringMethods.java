package Mypackage;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Java Programming";
		
		   System.out.println("Length: " + s.length());          // 16
	        System.out.println("Uppercase: " + s.toUpperCase());  // JAVA PROGRAMMING
	        System.out.println("Lowercase: " + s.toLowerCase());  // java programming
	        System.out.println("Char at 5: " + s.charAt(5));      // P
	        System.out.println("Substring: " + s.substring(5));   // Programming
	        System.out.println("Contains 'Java': " + s.contains("Java")); // true
	        System.out.println("Replace: " + s.replace("Java", "C++"));   // C++ Programming
	        System.out.println("Starts with 'Ja': " + s.startsWith("Ja")); // true
	        System.out.println("Ends with 'ing': " + s.endsWith("ing"));   // true
	        System.out.println("Index of 'a': " + s.indexOf('a')); // 1
	        System.out.println("Equals: " + s.equals("Java Programming")); // true
	        System.out.println("Equals Ignore Case: " + s.equalsIgnoreCase("java programming")); // true
	    }
	}	

	}

}
