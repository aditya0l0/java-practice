# Lifecycle of a Program

A Java program transitions from human-readable source code (`.java`) to bytecode (`.class`) via `javac`, is loaded into memory by a `ClassLoader`, and is executed by the JVM using an interpreter and Just-In-Time (JIT) compiler.
This example inspects its own runtime environment, class loading mechanism, and highlights the pitfall where core platform classes return `null` for `getClassLoader()` due to the native Bootstrap ClassLoader.

### Expected Output
```text
=== Lifecycle of a Program Demo ===
Loaded Class: LifecycleOfAProgram
Java Runtime Version: 17.0.19 (or 21+)
JVM Engine: OpenJDK 64-Bit Server VM
Process PID: <current-pid>
Application ClassLoader: AppClassLoader

Pitfall: ClassLoader Hierarchy and the Bootstrap Loader
Expected String.class.getClassLoader(): null (native bootstrap loader)
Actual String ClassLoader: null
Resolved safe loader name: Bootstrap ClassLoader (Native JVM)

Runtime Memory: Total = <mb>MB | Free = <mb>MB
```
