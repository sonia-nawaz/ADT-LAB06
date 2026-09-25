# ADT-LAB06 — Abstract Data Types

Lab work for Software Construction, covering Abstract Data Types (ADTs), collections, and the abstraction principle in Java.

## Contents

- **Stack.java** — Custom stack implementation
- **StackTest.java** — Test cases for the stack
- **Student.java** — Student entity class
- **StudentCollection.java** — Interface/abstract collection for managing students
- **StudentCollectionImplementation.java** — Concrete implementation of the student collection
- **StudentTest.java** — Test cases for the student collection
- **Book.java** — Book entity class
- **LibrarySystem.java** — Library system interface/abstraction
- **LibraryImplementation.java** — Concrete implementation of the library system
- **LibraryTest.java** — Test cases for the library system
- **AbstractionTest.java** — Demonstrates abstraction using the `List` interface, showing how the same variable can be reassigned between `ArrayList` and `LinkedList` implementations without changing the rest of the code

## Key Concept

This lab demonstrates **abstraction** in Java: coding against an interface (e.g. `List`, `StudentCollection`, `LibrarySystem`) rather than a specific implementation, so the underlying data structure can be swapped without breaking the calling code.

## How to Run

Each `*Test.java` file contains a `main` method and can be run directly to see the demonstrated behavior in the console.
