package Mypackage;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		sb.append("World");
		System.out.println("Append :" + sb);
		
		sb.insert(5, "Java");
		System.out.println("insert :" + sb);
		
		sb.replace(5, 10, "Python");
		System.out.println("replace :" +sb);
		
		sb.delete(6, 9);
		System.out.println("delete :" +sb);
		
		sb.reverse();
		System.out.println("reverse :" +sb);

	}

}
