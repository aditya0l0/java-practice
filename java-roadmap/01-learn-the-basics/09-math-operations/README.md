# Math Operations

Java provides standard arithmetic operators and the `java.lang.Math` library for numerical algorithms.
This example demonstrates integer truncation during division, negative dividend modulo semantics versus `Math.floorMod`, and the famous `Math.abs(Integer.MIN_VALUE)` overflow boundary alongside modern `Math.absExact`.

### Expected Output
```text
=== Math Operations Demo ===
Pitfall 1: Integer Division Truncation
Expected naive math: 2.5 / Actual int (5 / 2): 2
Expected floating-point (5.0 / 2): 2.5

Pitfall 2: Negative Dividend Modulo
Operator (-7 % 3) sign follows dividend: -1
Mathematical floorMod(-7, 3) always positive divisor: 2

Pitfall 3: Math.abs on Integer.MIN_VALUE
Original MIN_VALUE: -2147483648
Expected positive: 2147483648 / Actual Math.abs: -2147483648
Still negative? true
Caught expected Math.absExact ArithmeticException: integer overflow

Standard Utilities:
Math.sqrt(64): 8.0
Math.max(10, 42): 42
Math.round(5.67): 6
```
