public class StringsAndMethods {

    public static void main(String[] args) {

        // 1. Creating strings
        String firstName = "Rahul";
        String lastName = "Sharma";

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);

        // 2. Finding the length of a string
        System.out.println("Length: " + firstName.length());

        // 3. Converting case
        System.out.println("Uppercase: " + firstName.toUpperCase());
        System.out.println("Lowercase: " + lastName.toLowerCase());

        // 4. Joining strings
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println("Full Name: " + fullName);

        // 5. Accessing a character
        System.out.println("First Character: " + firstName.charAt(0));

        // 6. Extracting part of a string
        System.out.println("Substring: " + firstName.substring(1, 4));

        // 7. Comparing strings
        String word1 = "Java";
        String word2 = "Java";
        String word3 = "java";

        System.out.println("word1 equals word2: " + word1.equals(word2));
        System.out.println("word1 equals word3: " + word1.equals(word3));
        System.out.println("Ignoring case: " + word1.equalsIgnoreCase(word3));

        // 8. Checking whether a string contains text
        System.out.println("Contains 'ah': " + firstName.contains("ah"));

        // 9. Replacing characters
        System.out.println("Replace: " + firstName.replace('a', 'o'));

        // 10. Removing surrounding spaces
        String message = "   Hello Java   ";
        System.out.println("Trimmed: '" + message.trim() + "'");

        // 11. Checking the beginning and ending
        System.out.println("Starts with 'Rah': " + firstName.startsWith("Rah"));
        System.out.println("Ends with 'ul': " + firstName.endsWith("ul"));

        // 12. Calling our own method
        greet(firstName);

        // 13. Calling a method that returns a value
        int result = add(10, 20);
        System.out.println("Sum: " + result);

        // 14. Calling a method that returns a string
        String welcomeMessage = createMessage(firstName);
        System.out.println(welcomeMessage);
    }

    // Method without a return value
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method that accepts two integers and returns their sum
    public static int add(int a, int b) {
        return a + b;
    }

    // Method that returns a String
    public static String createMessage(String name) {
        return "Welcome to Java, " + name + "!";
    }
}
