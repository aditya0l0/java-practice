# Loops

Loops provide mechanisms for repetitive code execution across ranges, collections, and matrices.
This example demonstrates nested loops with labeled `break` statements, the pitfall of `do-while` loops running at least once even when their condition evaluates to false, and how enhanced for-each iteration on primitives operates on copies rather than modifying the underlying array.

### Expected Output
```text
=== Loops Demo ===
Expected target found at [1, 1] / Actual: [1, 1]

Pitfall 1: do-while guaranteed initial execution
Condition: initialValue < 10 (where initialValue is 100)
Expected executions: 1 / Actual executions: 1

Pitfall 2: Enhanced for-each reassignment on primitives
Expected array element unchanged: 5 / Actual: 5
```
