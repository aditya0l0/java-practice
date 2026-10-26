class Student {

    // 1. Fields (data / attributes)
    String name;
    int age;
    int marks;

    // 2. Constructor
    Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // 3. Method (behavior)
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    // 4. Method to check whether the student passed
    void checkResult() {
        if (marks >= 40) {
            System.out.println(name + " has passed.");
        } else {
            System.out.println(name + " has failed.");
        }
    }
}

// Inheritance: GraduateStudent inherits from Student
class GraduateStudent extends Student {

    String specialization;

    GraduateStudent(String name, int age, int marks,
            String specialization) {
        super(name, age, marks);
        this.specialization = specialization;
    }

    // 5. Method overriding (Polymorphism)
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}

// Main class
public class OOPBasicsExample {
    public static void main(String[] args) {

        // 6. Creating objects
        Student student1 = new Student("Amit", 20, 85);
        Student student2 = new Student("Priya", 19, 32);

        System.out.println("Student 1 Details:");
        student1.displayDetails();
        student1.checkResult();

        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();
        student2.checkResult();

        // 7. Creating an object of the child class
        GraduateStudent graduate = new GraduateStudent("Rahul", 23, 90, "Computer Science");

        System.out.println("\nGraduate Student Details:");
        graduate.displayDetails();
        graduate.checkResult();

        // 8. Polymorphism using a parent class reference
        Student student3 = new GraduateStudent(
                "Neha", 24, 78, "Data Science");

        System.out.println("\nPolymorphism Example:");
        student3.displayDetails();
    }
}
