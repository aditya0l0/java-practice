/*
 * Topic: Variables and Scopes
 * Definition: Lifetime and visibility boundaries of variables across static, instance, local, and block levels.
 * Run: java VariablesAndScopes.java
 */
public class VariablesAndScopes {
    // Static variable: Single copy shared across all instances
    static int globalCounter = 0;

    // Instance variable: Belongs to individual object instances
    int instanceValue = 10;

    public void demonstrateShadowing(int instanceValue) {
        // Pitfall 1: Variable shadowing without 'this' keyword
        // The local parameter 'instanceValue' shadows the instance field 'this.instanceValue'
        instanceValue = instanceValue + 5; // Modifies ONLY local parameter!
        System.out.println("Local shadowed parameter: " + instanceValue);
        System.out.println("Instance field still unchanged: " + this.instanceValue);

        // Correct qualification using 'this'
        this.instanceValue = instanceValue;
        System.out.println("Instance field after explicit 'this': " + this.instanceValue);
    }

    public static void main(String[] args) {
        System.out.println("=== Variables and Scopes Demo ===");

        var demo = new VariablesAndScopes();
        demo.demonstrateShadowing(20);

        // Block scope lifetime demonstration
        int outerX = 100;
        {
            int blockOnly = 50;
            outerX += blockOnly;
            System.out.println("\nInside block, blockOnly = " + blockOnly + ", outerX = " + outerX);
        }
        // 'blockOnly' is now out of scope and inaccessible here
        System.out.println("Outside block, outerX persists: " + outerX);

        // Modern type inference with 'var'
        var message = "Strongly typed at compile time";
        // message = 123; // Compile-time error: int cannot be converted to String
        System.out.println("\nPitfall 2: 'var' is static typing, not dynamic");
        System.out.println("Inferred type: " + message.getClass().getSimpleName());
        System.out.println("Value: " + message);
    }
}
