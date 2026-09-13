package Mypackage;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello"); // Stored in Heap
		System.out.println("Original String :" + sb);
		sb.append("World"); // modifies the same object
		System.out.println("After Append :" + sb);
		sb.insert(6, "Java");// inserts text //At 6th position it will insert java & then world 
		System.out.println("After Insert :" + sb);
		sb.reverse(); // reverse the string
		System.out.println("After Reverse :" + sb);

	}

}
