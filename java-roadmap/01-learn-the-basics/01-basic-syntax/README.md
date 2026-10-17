# Basic Syntax

Basic syntax defines the foundational structure of Java source files, method entry points, and statement termination rules.
This example demonstrates standard execution flow alongside the pitfall of an accidental trailing semicolon on an `if` condition, which detaches the code block and runs it unconditionally.

### Expected Output
```text
=== Basic Syntax Demo ===
Expected: Status is ACTIVE with score 100 / Actual: Status is ACTIVE with score 100
Pitfall: Trailing semicolon on 'if' statement
Expected: Vulnerable block should NOT run (false)
Actual: Vulnerable block executed = true
Expected correctly guarded: false / Actual: false
```
