package Mypackage;

public class HeapDemo {

	public static void main(String[] args) {
		String s1 = "JAVA"; //stored in SCP 
		String s2 = "JAVA"; //stored in SCP
		System.out.println(s1==s2);//true 
		System.out.println(s1.equals(s2)); //true 
		
		String s3= new String("JAVA"); //new object Stored in Heap
		String s4 = new String("JAVA"); //another new object in Heap 
		System.out.println(s3==s4);//false (different object)
		System.out.println(s3.equals(s4)); //true (same values)


	}

}
