
public class ConditionalsExample {
    public static void main(String[] args) {

        int age = 20;
        int marks = 85;
        int number = 7;
        int day = 3;

        // 1. Simple if statement
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        }

        // 2. if-else statement
        if (marks >= 40) {
            System.out.println("You passed the exam.");
        } else {
            System.out.println("You failed the exam.");
        }

        // 3. if-else-if ladder
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // 4. Nested if statement
        boolean hasTicket = true;

        if (age >= 18) {
            if (hasTicket) {
                System.out.println("You can enter the event.");
            } else {
                System.out.println("You need a ticket to enter.");
            }
        } else {
            System.out.println("You must be at least 18.");
        }

        // 5. Check whether a number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // 6. Switch statement
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend or invalid day.");
        }

        // 7. Ternary operator
        String result = (marks >= 40) ? "Pass" : "Fail";
        System.out.println("Exam result: " + result);
    }
}
