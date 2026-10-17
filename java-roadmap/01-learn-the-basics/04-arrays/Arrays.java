/*
 * Topic: Arrays
 * Definition: Fixed-size, contiguous sequences of typed elements with zero-based indexing.
 * Run: java Arrays.java
 */
public class Arrays {
    public static void main(String[] args) {
        System.out.println("=== Arrays Demo ===");

        // Allocation and initialization
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array length: " + numbers.length + " | First element: " + numbers[0]);

        // Pitfall 1: '==' tests object identity (memory address), not content equality
        int[] copy1 = {1, 2, 3};
        int[] copy2 = {1, 2, 3};
        boolean refEquals = (copy1 == copy2);
        boolean contentEquals = java.util.Arrays.equals(copy1, copy2);
        System.out.println("\nPitfall 1: Array Equality Comparison");
        System.out.println("Expected reference comparison (copy1 == copy2): false / Actual: " + refEquals);
        System.out.println("Expected content comparison (Arrays.equals): true / Actual: " + contentEquals);

        // Pitfall 2: Array covariance allows runtime ArrayStoreException
        // In Java, String[] is a subtype of Object[], allowing invalid types to be inserted at runtime
        System.out.println("\nPitfall 2: Array Covariance and ArrayStoreException");
        Object[] stringArrAsObject = new String[2];
        try {
            stringArrAsObject[0] = 42; // Integer cannot be stored in underlying String[]
            System.out.println("Stored integer successfully (unexpected)");
        } catch (ArrayStoreException e) {
            System.out.println("Caught expected ArrayStoreException: " + e.getClass().getSimpleName());
        }

        // Pitfall 3: Off-by-one error accessing length instead of length - 1
        System.out.println("\nPitfall 3: Off-by-one Index Bounds");
        try {
            int invalid = numbers[numbers.length];
            System.out.println("Accessed out-of-bounds: " + invalid);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught expected ArrayIndexOutOfBoundsException at index " + numbers.length);
        }
    }
}
