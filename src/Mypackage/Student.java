package Mypackage;

public class Student {
    private String name;
    private int age;

    // Setter methods
    public void setName(String n) {
        name = n;
    }

    public void setAge(int n) {
        if (n > 0) {
            age = n;   // correct assignment
        } else {
            age = 0;   // invalid case me default 0
        }
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
