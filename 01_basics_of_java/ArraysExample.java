
public class ArraysExample {
    public static void main(String[] args) {

        // 1. Declare and initialize an array
        int[] numbers = { 10, 20, 30, 40, 50 };

        // 2. Print array elements using indexes
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);

        // 3. Find the length of the array
        System.out.println("Array length: " + numbers.length);

        // 4. Print all elements using a for loop
        System.out.println("\nAll elements using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 5. Print all elements using an enhanced for loop
        System.out.println("\nAll elements using enhanced for loop:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // 6. Modify an array element
        numbers[1] = 25;
        System.out.println("\nUpdated second element: " + numbers[1]);

        // 7. Create an array with a fixed size
        int[] marks = new int[3];

        marks[0] = 85;
        marks[1] = 90;
        marks[2] = 95;

        System.out.println("\nStudent marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // 8. Calculate the sum of array elements
        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }

        System.out.println("\nSum of numbers: " + sum);

        // 9. Find the largest element
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest number: " + largest);
    }
}
