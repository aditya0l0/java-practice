
public class MathOperations {

    public static void main(String[] args) {

        int a = 20;
        int b = 6;

        // 1. Addition
        int sum = a + b;
        System.out.println("Addition: " + sum);

        // 2. Subtraction
        int difference = a - b;
        System.out.println("Subtraction: " + difference);

        // 3. Multiplication
        int product = a * b;
        System.out.println("Multiplication: " + product);

        // 4. Division
        int quotient = a / b;
        System.out.println("Integer Division: " + quotient);

        // 5. Modulus (Remainder)
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);

        // 6. Decimal Division
        double decimalResult = (double) a / b;
        System.out.println("Decimal Division: " + decimalResult);

        // 7. Increment
        int number = 5;
        number++;
        System.out.println("After Increment: " + number);

        // 8. Decrement
        number--;
        System.out.println("After Decrement: " + number);

        // 9. Compound Assignment Operators
        int value = 10;

        value += 5;
        System.out.println("After += 5: " + value);

        value -= 3;
        System.out.println("After -= 3: " + value);

        value *= 2;
        System.out.println("After *= 2: " + value);

        value /= 4;
        System.out.println("After /= 4: " + value);

        value %= 3;
        System.out.println("After %= 3: " + value);

        // 10. Using the Math Class
        System.out.println("Absolute Value: " + Math.abs(-15));
        System.out.println("Maximum: " + Math.max(10, 25));
        System.out.println("Minimum: " + Math.min(10, 25));
        System.out.println("Square Root: " + Math.sqrt(64));
        System.out.println("Power: " + Math.pow(2, 3));
        System.out.println("Rounded Value: " + Math.round(4.7));
        System.out.println("Ceiling: " + Math.ceil(4.2));
        System.out.println("Floor: " + Math.floor(4.8));

        // 11. Operator Precedence
        int result = 10 + 5 * 2;
        System.out.println("Without Parentheses: " + result);

        int resultWithParentheses = (10 + 5) * 2;
        System.out.println("With Parentheses: " + resultWithParentheses);
    }
}
