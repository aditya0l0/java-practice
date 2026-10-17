/*
 * Topic: Conditionals
 * Definition: Decision-making constructs that control execution flow based on boolean expressions and pattern matching.
 * Run: java Conditionals.java
 */
public class Conditionals {
    public static void main(String[] args) {
        System.out.println("=== Conditionals Demo ===");

        int score = 85;
        // Ternary operator provides concise expression-based assignment
        String tier = score >= 90 ? "GOLD" : score >= 80 ? "SILVER" : "BRONZE";
        System.out.println("Expected tier: SILVER / Actual tier: " + tier);

        // Modern switch expression (Java 14+) with arrow syntax avoids accidental fall-through
        String day = "SATURDAY";
        String dayType = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "WEEKDAY";
            case "SATURDAY", "SUNDAY" -> "WEEKEND";
            default -> "UNKNOWN";
        };
        System.out.println("Expected dayType: WEEKEND / Actual: " + dayType);

        // Pitfall 1: Classic switch fall-through without explicit 'break' statements
        int stage = 1;
        var log = new StringBuilder();
        switch (stage) {
            case 1:
                log.append("Stage1;");
                // Missing break causes fall-through into Stage 2!
            case 2:
                log.append("Stage2;");
                break;
            default:
                log.append("Default;");
        }
        System.out.println("\nPitfall 1: Classic Switch Fall-through");
        System.out.println("Expected without break: Stage1;Stage2;");
        System.out.println("Actual output: " + log);

        // Pitfall 2: Short-circuit (&&) vs Non-short-circuit (&) evaluation
        String nullText = null;
        System.out.println("\nPitfall 2: Logical Short-Circuiting");

        // && safely short-circuits on false, never evaluating nullText.length()
        boolean safeCheck = (nullText != null) && (nullText.length() > 0);
        System.out.println("Expected safe check: false / Actual: " + safeCheck);

        try {
            // & always evaluates both operands, throwing NullPointerException when nullText is dereferenced
            boolean dangerousCheck = (nullText != null) & (nullText.length() > 0);
            System.out.println("Dangerous check evaluated: " + dangerousCheck);
        } catch (NullPointerException e) {
            System.out.println("Caught expected NullPointerException because '&' does not short-circuit");
        }
    }
}
