package Mypackage;

public class Main1 {
    public static void main(String[] args) {
        Animal1 a = new Dog1(); // Parent ref = Child object
        a.sound();              // Runtime polymorphism
    }
}
