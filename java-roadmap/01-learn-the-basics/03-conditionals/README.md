# Conditionals

Conditionals control execution flow using boolean evaluation, including `if/else`, the ternary operator, and switch statements or expressions.
This example demonstrates ternary logic, modern arrow switch expressions, the classic switch fall-through pitfall when `break` is omitted, and the difference between short-circuiting `&&` and non-short-circuiting `&`.

### Expected Output
```text
=== Conditionals Demo ===
Expected tier: SILVER / Actual tier: SILVER
Expected dayType: WEEKEND / Actual: WEEKEND

Pitfall 1: Classic Switch Fall-through
Expected without break: Stage1;Stage2;
Actual output: Stage1;Stage2;

Pitfall 2: Logical Short-Circuiting
Expected safe check: false / Actual: false
Caught expected NullPointerException because '&' does not short-circuit
```
