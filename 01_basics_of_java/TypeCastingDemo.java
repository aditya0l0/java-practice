
public class TypeCastingDemo {

    public static void main(String[] args) {

        // 1. Widening Casting (Automatic)
        System.out.println("Widening Casting:");

        int number = 100;
        double decimalNumber = number;

        System.out.println("Integer value: " + number);
        System.out.println("Double value: " + decimalNumber);

        // 2. Narrowing Casting (Manual)
        System.out.println("\nNarrowing Casting:");

        double price = 99.99;
        int wholePrice = (int) price;

        System.out.println("Double value: " + price);
        System.out.println("Integer value: " + wholePrice);

        // 3. Casting from char to int
        System.out.println("\nCharacter to Integer:");

        char letter = 'A';
        int asciiValue = letter;

        System.out.println("Character: " + letter);
        System.out.println("Numeric value: " + asciiValue);

        // 4. Casting from int to char
        System.out.println("\nInteger to Character:");

        int numericValue = 66;
        char character = (char) numericValue;

        System.out.println("Integer value: " + numericValue);
        System.out.println("Character: " + character);

        // 5. Casting can cause data loss
        System.out.println("\nData Loss Example:");

        int largeNumber = 130;
        byte smallNumber = (byte) largeNumber;

        System.out.println("Original integer: " + largeNumber);
        System.out.println("After casting to byte: " + smallNumber);
    }
}
