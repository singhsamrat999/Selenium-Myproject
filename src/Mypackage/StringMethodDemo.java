package Mypackage;

public class StringMethodDemo {

	public static void main(String[] args) {
		String str1 = "hello java";
		String str2 = " Hello Java";
		String str3 = " HELLO JAVA ";
	
		
		// length method()-----
		System.out.println("The length of string : " +str1.length());
		System.out.println("The length of string : " +str2.length());
		System.out.println("The length of string : " +str3.length());
		
		
     //		charAt method()------
		System.out.println("Character of string :" + str1.charAt(3));
        System.out.println("Character of string :" + str2.charAt(7));
        System.out.println("Character of string :" + str3.charAt(9));
		
     // 3.subString()
        System.out.println("substring of given string :" + str1.substring(3));
        System.out.println("substring of given string :" + str1.substring(8));
        System.out.println("substring of given string :" + str1.substring(4));
        
     // 4.toUpperCase()
        System.out.println("Upper Case of given string is :" + str1.toUpperCase()); 
		System.out.println("Upper Case of given string is :" + str2.toUpperCase());
		System.out.println("Upper Case of given string is :" + str3.toUpperCase());
		
	// 5.toLowerCase()
		System.out.println("Lower Case of given string is :" + str1.toLowerCase()); 
		System.out.println("Lower Case of given string is :" + str2.toLowerCase());
		System.out.println("Lower Case of given string is :" + str3.toLowerCase());
		
		// 6.replace()
				System.out.println("Replace 'JAVA' with 'WORLD': " + str3.replace("JAVA", "WORLD"));
				System.out.println("Replace 'Java' with 'python': " + str2.replace("Java", "python"));
				System.out.println("Replace 'Java' with 'ruby': " + str2.replace("Java", "ruby"));
				
	
				//7.CompareTo() 
				System.out.println("Compare to str2 & str3:" +str2.compareTo(str3));
				System.out.println("Compare to str1 & str3:" +str1.compareTo(str3));



				// 8.concat()
				System.out.println("Concatenation of String :" + str1.concat("Programming")); // Hello Java Programming
				System.out.println("Concatenation of String :" + str2.concat("World")); // Hello Java World
				System.out.println("Concatenation of String :" + str3.concat("Language")); // HELLO JAVA Language


				// 9.contains()
				System.out.println("Given String Contains 'Java'? :" + str1.contains("Java")); // true
				System.out.println("Given String Contains 'Hello'? :" + str2.contains("Hello"));// true
				System.out.println("Given String Contains 'WORLD'? :" + str1.contains("WORLD")); // false



				// 10.indexof()
				System.out.println("Index of given string :" + str1.indexOf("Java")); // 6
				System.out.println("Index of given string :" + str2.indexOf("Hello")); // 0
				System.out.println("Index of given string :" + str3.indexOf("LLO")); // 2


				// 11.lastIndexof()
				System.out.println(" Last Index of 'a' in string :" + str1.lastIndexOf('a')); // 9
				System.out.println("last Index of 'o' in given string :" + str2.lastIndexOf('o')); // 4
				System.out.println("Last Index of 'H' given string :" + str3.lastIndexOf('H')); // 0

				
				// 12. startsWith/endsWith
				System.out.println("str1 starts with 'Hello'?" + str1.startsWith("Hello"));// true
				System.out.println("str2 starts with 'Java'?" + str2.startsWith("Java"));// false
				System.out.println("str3 starts with 'HELLO'?" + str3.startsWith("HELLO"));// TRUE
				System.out.println("str1 starts with 'Hello'?" + str1.endsWith("Hello"));// False
				System.out.println("str2 starts with 'Java'?" + str2.endsWith("Java"));// True
				System.out.println("str3 starts with 'HELLO'?" + str3.endsWith("HELLO"));// False

				
				
				// 13.trim() --It will removes spaces from start & end of string
				System.out.println("Trimmed String :" + str4.trim() + "");

				
				// 14.split()
				String[] words = str1.split(" ");
				System.out.println("Split Words:");
				for (String w : words) {
					System.out.println(w);

				}
	}

}
