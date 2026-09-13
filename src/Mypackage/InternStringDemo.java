package Mypackage;

public class InternStringDemo {

	public static void main(String[] args) {
		String s1 = new String("Hello"); // Stored in Heap
		String s2 = s1.intern(); // Stored in SCP
		String s3 ="Hello"; //Stored in SCP 
         System.out.println(s1==s2); //false ,different memory references
         System.out.println(s2==s3);//true ,same memory references

	}

}
