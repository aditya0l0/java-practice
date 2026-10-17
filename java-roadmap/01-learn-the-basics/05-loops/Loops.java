/*
 * Topic: Loops
 * Definition: Iterative control structures (for, enhanced for, while, do-while) allowing repeated execution.
 * Run: java Loops.java
 */
public class Loops {
    public static void main(String[] args) {
        System.out.println("=== Loops Demo ===");

        // Labeled break allows exiting deeply nested loops directly to an outer label
        int targetRow = -1;
        int targetCol = -1;
        int[][] matrix = {
            {1, 2, 3},
            {4, 99, 6},
            {7, 8, 9}
        };

        searchLoop:
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == 99) {
                    targetRow = r;
                    targetCol = c;
                    break searchLoop; // Exits both loops immediately
                }
            }
        }
        System.out.println("Expected target found at [1, 1] / Actual: [" + targetRow + ", " + targetCol + "]");

        // Pitfall 1: do-while executes loop body AT LEAST ONCE even if condition is false initially
        int executions = 0;
        int initialValue = 100;
        do {
            // This runs before the condition (initialValue < 10) is ever checked!
            executions++;
        } while (initialValue < 10);

        System.out.println("\nPitfall 1: do-while guaranteed initial execution");
        System.out.println("Condition: initialValue < 10 (where initialValue is 100)");
        System.out.println("Expected executions: 1 / Actual executions: " + executions);

        // Pitfall 2: Enhanced for-each loop assigns by value for primitives and cannot modify array elements
        int[] originalValues = {5, 10, 15};
        for (int val : originalValues) {
            val = val * 2; // Mutates local copy 'val', NOT originalValues array
        }
        System.out.println("\nPitfall 2: Enhanced for-each reassignment on primitives");
        System.out.println("Expected array element unchanged: 5 / Actual: " + originalValues[0]);
    }
}
