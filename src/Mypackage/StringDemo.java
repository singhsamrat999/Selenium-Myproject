package Mypackage;

public class StringDemo {

    public static void main(String[] args) {
        String str = "Hello"; // String literal → stored in SCP
        System.out.println("Original String :" + str);

        // concat without reassignment
        str.concat("World"); // Creates new object, but not stored (str still "Hello")
        System.out.println("After Concat :" + str);

        // concat with reassignment
        str = str.concat("World"); // New object reference stored back in str
        System.out.println("After Reassignment :" + str);
    }
}
  