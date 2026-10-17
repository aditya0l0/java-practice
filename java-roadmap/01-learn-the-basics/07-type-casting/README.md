# Type Casting

Type casting converts values from one type to another, either implicitly via widening or explicitly via narrowing.
This example demonstrates widening, narrowing bit truncation and sign inversion (e.g. `(byte) 130` yielding `-126`), modern pattern matching with `instanceof`, and handling `ClassCastException`.

### Expected Output
```text
=== Type Casting Demo ===
Widening int (100) to double: 100.0
Truncated double (99.95) to int: 99

Pitfall 1: Numeric Overflow during Narrowing
Original int value: 130
Expected naive byte: 130 / Actual two's complement byte: -126

Pattern matching success: 'Hello Java' length = 10

Pitfall 2: Unsafe Reference Casting
Caught expected ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
```
