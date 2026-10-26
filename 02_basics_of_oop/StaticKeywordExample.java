class Student {

    // 1. Static variable (shared by all objects)
    static String collegeName = "ABC College";

    // 2. Instance variables (unique to each object)
    String name;
    int marks;

    // Constructor
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // 3. Instance method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("College: " + collegeName);
    }

    // 4. Static method
    static void displayCollegeName() {
        System.out.println("College Name: " + collegeName);
    }

    // 5. Static method to calculate the average
    static double calculateAverage(int marks1, int marks2) {
        return (marks1 + marks2) / 2.0;
    }

    // 6. Static initialization block
    static {
        System.out.println("Student class is loaded.");
    }
}

public class StaticKeywordExample {
    public static void main(String[] args) {

        // 7. Access static variable using the class name
        System.out.println("College: " + Student.collegeName);

        // 8. Call static method using the class name
        Student.displayCollegeName();

        // 9. Create objects
        Student student1 = new Student("Amit", 85);
        Student student2 = new Student("Priya", 90);

        // 10. Display object details
        System.out.println("\nStudent 1 Details:");
        student1.displayDetails();

        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();

        // 11. Change the static variable
        Student.collegeName = "XYZ College";

        System.out.println("\nAfter Changing College Name:");

        student1.displayDetails();
        System.out.println();

        student2.displayDetails();

        // 12. Call a static method with parameters
        double average = Student.calculateAverage(85, 90);
        System.out.println("\nAverage Marks: " + average);
    }
}
