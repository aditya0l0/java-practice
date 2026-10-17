# Arrays

Arrays are fixed-size data structures containing contiguous elements of the same type.
This example demonstrates array indexing, the identity vs content equality trap of `==` versus `Arrays.equals`, the runtime danger of array covariance causing `ArrayStoreException`, and index boundary limits.

### Expected Output
```text
=== Arrays Demo ===
Array length: 5 | First element: 10

Pitfall 1: Array Equality Comparison
Expected reference comparison (copy1 == copy2): false / Actual: false
Expected content comparison (Arrays.equals): true / Actual: true

Pitfall 2: Array Covariance and ArrayStoreException
Caught expected ArrayStoreException: ArrayStoreException

Pitfall 3: Off-by-one Index Bounds
Caught expected ArrayIndexOutOfBoundsException at index 5
```
