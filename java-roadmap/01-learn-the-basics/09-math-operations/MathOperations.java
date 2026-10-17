/*
 * Topic: Math Operations
 * Definition: Arithmetic calculations, truncation rules, and mathematical functions via java.lang.Math.
 * Run: java MathOperations.java
 */
public class MathOperations {
    public static void main(String[] args) {
        System.out.println("=== Math Operations Demo ===");

        // Pitfall 1: Integer division truncates fractional components toward zero
        int intDiv = 5 / 2;
        double floatDiv = 5.0 / 2;
        System.out.println("Pitfall 1: Integer Division Truncation");
        System.out.println("Expected naive math: 2.5 / Actual int (5 / 2): " + intDiv);
        System.out.println("Expected floating-point (5.0 / 2): " + floatDiv);

        // Pitfall 2: Modulo operator '%' vs Math.floorMod with negative dividends
        // In Java, 'a % b' yields remainder preserving the sign of dividend 'a'
        int rem = -7 % 3;
        int mathMod = Math.floorMod(-7, 3);
        System.out.println("\nPitfall 2: Negative Dividend Modulo");
        System.out.println("Operator (-7 % 3) sign follows dividend: " + rem);
        System.out.println("Mathematical floorMod(-7, 3) always positive divisor: " + mathMod);

        // Pitfall 3: Math.abs(Integer.MIN_VALUE) overflow anomaly
        // -2147483648 has no positive representation in signed 32-bit two's complement (-2^31 to 2^31 - 1)
        int minInt = Integer.MIN_VALUE;
        int absMin = Math.abs(minInt);
        System.out.println("\nPitfall 3: Math.abs on Integer.MIN_VALUE");
        System.out.println("Original MIN_VALUE: " + minInt);
        System.out.println("Expected positive: 2147483648 / Actual Math.abs: " + absMin);
        System.out.println("Still negative? " + (absMin < 0));

        // Math.absExact throws ArithmeticException on overflow (Java 15+)
        try {
            Math.absExact(minInt);
        } catch (ArithmeticException e) {
            System.out.println("Caught expected Math.absExact ArithmeticException: integer overflow");
        }

        // Standard Math utilities
        System.out.println("\nStandard Utilities:");
        System.out.println("Math.sqrt(64): " + Math.sqrt(64));
        System.out.println("Math.max(10, 42): " + Math.max(10, 42));
        System.out.println("Math.round(5.67): " + Math.round(5.67));
    }
}
