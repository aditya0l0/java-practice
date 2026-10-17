# Strings and Methods

Strings represent immutable sequences of characters backed by Java's heap and optimized through the JVM String Constant Pool.
This example demonstrates String Pool interning versus heap allocation, the pitfall of using `==` instead of `.equals()`, immutability and discarded return values, and modern text blocks with `.formatted()`.

### Expected Output
```text
=== Strings and Methods Demo ===
Pitfall 1: Reference '==' vs Content '.equals()'
Literal vs Literal (same pool ref): true
Literal vs New Object (different ref): false
Expected content match (.equals): true / Actual: true

Pitfall 2: Immutability ignored return value
Expected: 'developer' / Actual: 'developer'
Correctly captured result: 'DEVELOPER'

Text block formatted:
{
    "language": "Java",
    "version": 21
}
Stripped string: 'Learn Java 21'
Substring [0, 5): 'Progr'
```
