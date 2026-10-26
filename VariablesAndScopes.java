public class VariablesAndScopes {

    // Instance variable: belongs to each object
    int instanceNumber = 20;

    // Static variable: shared by all objects of this class
    static int staticNumber = 30;

    public static void main(String[] args) {

        // Local variable: belongs to the main method
        int localNumber = 10;

        System.out.println("Local variable: " + localNumber);
        System.out.println("Static variable: " + staticNumber);

        // Creating an object to access the instance variable
        VariablesAndScopes obj = new VariablesAndScopes();
        System.out.println("Instance variable: " + obj.instanceNumber);

        // Block scope
        if (localNumber > 5) {
            int blockNumber = 40;
            System.out.println("Block variable: " + blockNumber);
            System.out.println("Local variable inside block: " + localNumber);
        }

        // Uncommenting the next line causes a compilation error
        // System.out.println(blockNumber);

        // Method scope demonstration
        obj.displayNumber();

        // Changing the static variable
        staticNumber = 50;
        System.out.println("Updated static variable: " + staticNumber);
    }

    public void displayNumber() {
        // Local variable belonging to this method
        int methodNumber = 60;
        System.out.println("Method local variable: " + methodNumber);

        // Instance and static variables are accessible here
        System.out.println("Instance variable in method: " + instanceNumber);
        System.out.println("Static variable in method: " + staticNumber);
    }
}
