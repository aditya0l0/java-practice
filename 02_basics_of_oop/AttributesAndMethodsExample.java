
class Student {

    // 1. Attributes (data)
    String name;
    int age;
    double marks;

    // 2. Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    // 3. Method to update marks
    void updateMarks(double newMarks) {
        marks = newMarks;
        System.out.println("Marks updated successfully!");
    }

    // 4. Method that returns a value
    boolean hasPassed() {
        return marks >= 40;
    }

    // 5. Method with parameters and a return value
    double calculateBonus(double bonusMarks) {
        return marks + bonusMarks;
    }
}

public class AttributesAndMethodsExample {
    public static void main(String[] args) {

        // 6. Create a Student object
        Student student1 = new Student();

        // 7. Assign values to attributes
        student1.name = "Amit";
        student1.age = 20;
        student1.marks = 75;

        // 8. Call the method to display details
        System.out.println("Student Details:");
        student1.displayDetails();

        // 9. Update marks using a method
        System.out.println("\nUpdating Marks:");
        student1.updateMarks(85);

        // 10. Check whether the student passed
        System.out.println("\nPass Status:");
        if (student1.hasPassed()) {
            System.out.println("The student has passed.");
        } else {
            System.out.println("The student has failed.");
        }

        // 11. Calculate marks after bonus
        double finalMarks = student1.calculateBonus(5);
        System.out.println("\nMarks after bonus: " + finalMarks);

        // 12. Display updated details
        System.out.println("\nUpdated Student Details:");
        student1.displayDetails();
    }
}
