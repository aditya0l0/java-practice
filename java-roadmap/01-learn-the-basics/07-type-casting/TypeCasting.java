/*
 * Topic: Type Casting
 * Definition: Converting a variable from one data type to another via widening (implicit) or narrowing (explicit) conversions.
 * Run: java TypeCasting.java
 */
public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("=== Type Casting Demo ===");

        // Widening casting (implicit, safe: smaller primitive to larger primitive)
        int intVal = 100;
        double widenedDouble = intVal;
        System.out.println("Widening int (100) to double: " + widenedDouble);

        // Narrowing casting (explicit, fractional loss)
        double price = 99.95;
        int truncatedPrice = (int) price;
        System.out.println("Truncated double (99.95) to int: " + truncatedPrice);

        // Pitfall 1: Silent bit truncation and sign wrap when narrowing out-of-range integers
        // 130 in binary is 00000000 00000000 00000000 10000010.
        // Narrowing to byte keeps only the lowest 8 bits: 10000010, which represents -126 in two's complement.
        int largeInt = 130;
        byte truncatedByte = (byte) largeInt;
        System.out.println("\nPitfall 1: Numeric Overflow during Narrowing");
        System.out.println("Original int value: " + largeInt);
        System.out.println("Expected naive byte: 130 / Actual two's complement byte: " + truncatedByte);

        // Reference Casting & Modern instanceof Pattern Matching
        Object textObject = "Hello Java";
        Object numberObject = 42;

        // Modern safe pattern matching (Java 16+) binds variable directly
        if (textObject instanceof String s) {
            System.out.println("\nPattern matching success: '" + s + "' length = " + s.length());
        }

        // Pitfall 2: Unsafe Reference Casting
        System.out.println("\nPitfall 2: Unsafe Reference Casting");
        try {
            String badCast = (String) numberObject; // numberObject is an Integer!
            System.out.println("Cast succeeded: " + badCast);
        } catch (ClassCastException e) {
            System.out.println("Caught expected ClassCastException: " + e.getMessage());
        }
    }
}
