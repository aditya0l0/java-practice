/*
 * Topic: Basic Syntax
 * Definition: Foundational structure of Java source code including classes, entry points, statements, and blocks.
 * Run: java BasicSyntax.java
 */
public class BasicSyntax {
    public static void main(String[] args) {
        System.out.println("=== Basic Syntax Demo ===");

        // Statements end with a semicolon; expressions evaluate inside blocks
        int score = 100;
        String status = "ACTIVE";
        System.out.println("Expected: Status is ACTIVE with score 100 / Actual: Status is " + status + " with score " + score);

        // Pitfall: Accidental empty statement with trailing semicolon on if condition
        // The semicolon terminates the if statement immediately, causing the block below to ALWAYS execute.
        boolean isAuthorized = false;
        boolean executedVulnerableBlock = false;

        if (isAuthorized); {
            // Semicolon above turns this into a detached, standalone block!
            executedVulnerableBlock = true;
        }

        System.out.println("Pitfall: Trailing semicolon on 'if' statement");
        System.out.println("Expected: Vulnerable block should NOT run (false)");
        System.out.println("Actual: Vulnerable block executed = " + executedVulnerableBlock);

        // Correct syntax without stray semicolon
        boolean correctlyGuardedBlock = false;
        if (isAuthorized) {
            correctlyGuardedBlock = true;
        }
        System.out.println("Expected correctly guarded: false / Actual: " + correctlyGuardedBlock);
    }
}
