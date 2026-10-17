# Variables and Scopes

Variables in Java have defined lifetimes and access boundaries depending on where they are declared: static (class), instance (object), local (method), and block (`{}`).
This example demonstrates these scope tiers, the pitfall of variable shadowing where local variables mask fields unless explicitly qualified with `this`, and the compile-time static type binding of `var`.

### Expected Output
```text
=== Variables and Scopes Demo ===
Local shadowed parameter: 25
Instance field still unchanged: 10
Instance field after explicit 'this': 25

Inside block, blockOnly = 50, outerX = 150
Outside block, outerX persists: 150

Pitfall 2: 'var' is static typing, not dynamic
Inferred type: String
Value: Strongly typed at compile time
```
