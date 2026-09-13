package Mypackage;

public class Finally {

	public static void main(String[] args) {
		try {
		 int arr[] = {1,3,4} ;
		 System.out.println(arr[5]);
	}
		catch(ArrayIndexOutOfBoundsException b){
			System.out.println("error: index of array out of range");
		}
		 
		finally{
			System.out.println("finally block always executes");
		}
	

}
}