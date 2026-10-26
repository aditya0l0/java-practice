
public class LoopsExample {
    public static void main(String[] args) {

        // 1. for loop
        System.out.println("1. For Loop:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // 2. while loop
        System.out.println("\n2. While Loop:");

        int j = 1;

        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        // 3. do-while loop
        System.out.println("\n3. Do-While Loop:");

        int k = 1;

        do {
            System.out.println(k);
            k++;
        } while (k <= 5);

        // 4. Enhanced for loop
        System.out.println("\n4. Enhanced For Loop:");

        int[] numbers = { 10, 20, 30, 40, 50 };

        for (int number : numbers) {
            System.out.println(number);
        }

        // 5. Loop with break
        System.out.println("\n5. Break Statement:");

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }

            System.out.println(i);
        }

        // 6. Loop with continue
        System.out.println("\n6. Continue Statement:");

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }

            System.out.println(i);
        }

        // 7. Nested loops
        System.out.println("\n7. Nested Loops:");

        for (int i = 1; i <= 3; i++) {
            for (int j2 = 1; j2 <= 2; j2++) {
                System.out.println("i = " + i + ", j = " + j2);
            }
        }

        // 8. Calculate the sum of numbers from 1 to 5
        System.out.println("\n8. Sum Using a Loop:");

        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }
}
