package Mypackage;

public class Studentt {
	String name;
	int age;
	
	
	Studentt(String n , int a){
	 name = n;
	 age = a;

}

void show() {
	System.out.println("Name: " + name + ", Age: " + age);
}
}