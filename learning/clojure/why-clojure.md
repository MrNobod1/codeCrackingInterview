# Why clojure

## Main characteristics

- Software Transactional Memory (STM)
- agents
- clear distinction between identity and value types
- Arbitrary polymorphism
- functional programming

## Clarity

Inmutable locals and persistent collections.

Separation of concerns in clojure:

| Conflated | Separated |
| --------- | --------- |
| Object with mutable fields | Values from identities |
| Class acts as namespace for methods | Function namespaces from type namespaces |
| Inheritance hierarchy made of classes | Hierarchy of names from data and functions |
| Data and methods bound together lexically | Data objects from functions |
| Method implementations embedded throughout class inheritance chain | Interface declarations from function implementation |