/*
 * Topic: Data Types
 * Definition: Java's primitive value representations (fixed-size in memory) vs wrapper types, with strict type boundaries.
 * Run: java DataTypes.java
 */
public class DataTypes {
    public static void main(String[] args) {
        System.out.println("=== Primitive Data Types Demo ===");

        // Primitives store raw binary values directly on the stack
        byte smallNum = 127;
        short shortNum = 32_767;
        int standardInt = 2_147_483_647;
        long largeLong = 9_223_372_036_854_775_807L;
        float floatVal = 3.14f;
        double doubleVal = 3.141592653589793;
        char initial = 'J';
        boolean isJava = true;

        System.out.println("Byte max: " + smallNum + " | Short max: " + shortNum);
        System.out.println("Char initial: " + initial + " | Boolean flag: " + isJava);

        // Pitfall 1: Integer overflow occurs silently in two's complement arithmetic
        int overflowResult = standardInt + 1;
        System.out.println("\nPitfall 1: 32-bit Integer Overflow");
        System.out.println("Expected (naive math): 2147483648");
        System.out.println("Actual (two's complement wrap): " + overflowResult);
        System.out.println("Verification: " + (overflowResult == Integer.MIN_VALUE ? "CONFIRMED" : "FAILED"));

        // Pitfall 2: Floating point rounding error due to binary representation (IEEE 754)
        double a = 0.1;
        double b = 0.2;
        double sum = a + b;
        System.out.println("\nPitfall 2: Floating Point Precision");
        System.out.println("Expected: 0.3");
        System.out.println("Actual: " + sum);
        System.out.println("Comparison (sum == 0.3): " + (sum == 0.3));

        // Pitfall 3: Char arithmetic promotes to int before addition
        int charSum = initial + 1; // 'J' (ascii 74) + 1 = 75, not 'K'
        char castBack = (char) (initial + 1);
        System.out.println("\nPitfall 3: Char Promotion");
        System.out.println("Expected numeric promotion: 75 / Actual: " + charSum);
        System.out.println("Expected cast back: 'K' / Actual: '" + castBack + "'");
    }
}
