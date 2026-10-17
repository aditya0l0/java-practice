# Data Types

Data types in Java specify the size and type of values that variables can hold, categorized into 8 primitives and reference types.
This example demonstrates each primitive type, along with two critical pitfalls: silent integer overflow in 32-bit two's complement arithmetic and binary floating-point rounding errors under IEEE 754.

### Expected Output
```text
=== Primitive Data Types Demo ===
Byte max: 127 | Short max: 32767
Char initial: J | Boolean flag: true

Pitfall 1: 32-bit Integer Overflow
Expected (naive math): 2147483648
Actual (two's complement wrap): -2147483648
Verification: CONFIRMED

Pitfall 2: Floating Point Precision
Expected: 0.3
Actual: 0.30000000000000004
Comparison (sum == 0.3): false

Pitfall 3: Char Promotion
Expected numeric promotion: 75 / Actual: 75
Expected cast back: 'K' / Actual: 'K'
```
