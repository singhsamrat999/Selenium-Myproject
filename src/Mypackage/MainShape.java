package Mypackage;

public class MainShape {
    public static void main(String[] args) {
        Shape s1 = new Circle();    // Circle ka object
        Shape s2 = new Rectangle(); // Rectangle ka object

        s1.draw();  // Output: Drawing a Circle
        s2.draw();  // Output: Drawing a Rectangle
    }
}
