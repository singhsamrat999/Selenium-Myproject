package Mypackage;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s2 = new Student();
        s2.setName("Shubham");
        s2.setAge(17);

        System.out.println("Student name: " + s2.getName());
        System.out.println("Student age: " + s2.getAge());

        s2.setAge(2); // Invalid case
    }
}
