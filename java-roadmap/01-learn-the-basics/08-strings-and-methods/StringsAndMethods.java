/*
 * Topic: Strings and Methods
 * Definition: Immutable character sequences stored in the heap with String Pool caching and rich inspection methods.
 * Run: java StringsAndMethods.java
 */
public class StringsAndMethods {
    public static void main(String[] args) {
        System.out.println("=== Strings and Methods Demo ===");

        // String literals are interned into the JVM String Constant Pool
        String literal1 = "Java";
        String literal2 = "Java";
        String heapString = new String("Java");

        // Pitfall 1: '==' tests memory reference equality, not character sequence equality
        System.out.println("Pitfall 1: Reference '==' vs Content '.equals()'");
        System.out.println("Literal vs Literal (same pool ref): " + (literal1 == literal2)); // true
        System.out.println("Literal vs New Object (different ref): " + (literal1 == heapString)); // false
        System.out.println("Expected content match (.equals): true / Actual: " + literal1.equals(heapString));

        // Pitfall 2: Strings are immutable; methods return a NEW String and never modify in-place
        String base = "developer";
        base.toUpperCase(); // Return value ignored!
        System.out.println("\nPitfall 2: Immutability ignored return value");
        System.out.println("Expected: 'developer' / Actual: '" + base + "'");

        String updated = base.toUpperCase();
        System.out.println("Correctly captured result: '" + updated + "'");

        // Useful modern String methods and Text Blocks (Java 15+)
        String multiline = """
            {
                "language": "%s",
                "version": %d
            }
            """.formatted("Java", 21);

        String padded = "   Learn Java 21   ";
        System.out.println("\nText block formatted:\n" + multiline.strip());
        System.out.println("Stripped string: '" + padded.strip() + "'");
        System.out.println("Substring [0, 5): '" + "Programming".substring(0, 5) + "'");
    }
}
