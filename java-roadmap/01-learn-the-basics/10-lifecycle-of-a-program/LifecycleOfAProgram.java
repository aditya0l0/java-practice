/*
 * Topic: Lifecycle of a Program
 * Definition: Source code (.java) -> compilation (javac) -> bytecode (.class) -> ClassLoader -> JVM execution (JIT/Interpreter).
 * Run: java LifecycleOfAProgram.java
 */
public class LifecycleOfAProgram {
    public static void main(String[] args) {
        System.out.println("=== Lifecycle of a Program Demo ===");

        // Step 1: Class Loading and Runtime Identity
        Class<?> clazz = LifecycleOfAProgram.class;
        System.out.println("Loaded Class: " + clazz.getName());
        System.out.println("Java Runtime Version: " + System.getProperty("java.version"));
        System.out.println("JVM Engine: " + System.getProperty("java.vm.name"));
        System.out.println("Process PID: " + ProcessHandle.current().pid());

        // Step 2: ClassLoader hierarchy
        ClassLoader appLoader = clazz.getClassLoader();
        System.out.println("Application ClassLoader: " + (appLoader != null ? appLoader.getClass().getSimpleName() : "null"));

        // Pitfall: Bootstrap ClassLoader is represented as 'null' in Java
        // Core JDK classes (like String or Object) are loaded by the native bootstrap class loader.
        // Assuming every Class has a non-null ClassLoader leads to NullPointerException when traversing parents!
        ClassLoader stringLoader = String.class.getClassLoader();
        System.out.println("\nPitfall: ClassLoader Hierarchy and the Bootstrap Loader");
        System.out.println("Expected String.class.getClassLoader(): null (native bootstrap loader)");
        System.out.println("Actual String ClassLoader: " + stringLoader);

        // Safe null-check when inspecting class hierarchy
        String loaderName = (stringLoader != null) ? stringLoader.getName() : "Bootstrap ClassLoader (Native JVM)";
        System.out.println("Resolved safe loader name: " + loaderName);

        // Step 3: Execution Memory Snapshot
        Runtime runtime = Runtime.getRuntime();
        long totalMemoryMb = runtime.totalMemory() / (1024 * 1024);
        long freeMemoryMb = runtime.freeMemory() / (1024 * 1024);
        System.out.println("\nRuntime Memory: Total = " + totalMemoryMb + "MB | Free = " + freeMemoryMb + "MB");
    }
}
