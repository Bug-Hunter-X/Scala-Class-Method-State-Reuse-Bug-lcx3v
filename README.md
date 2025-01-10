# Scala Class Method State Reuse Bug

This repository demonstrates an uncommon bug in Scala where a method's behavior appears to depend unexpectedly on the order of instantiation or the number of instances created. The class `MyClass` defines a method `myMethod` that should simply add its internal state (`x`) to the passed argument `y`. However, under certain conditions, this method exhibits unexpected behavior, potentially reusing state across instances.

## Bug Description

The main issue lies in the way the method interacts with the internal state and the instance of the class. The problem is not readily apparent due to its non-deterministic nature and dependency on the context of instance creation and method invocation. The `main` function in the `Main` object showcases this problem.

## How to Reproduce

1. Clone this repository.
2. Ensure you have Scala installed.
3. Compile and run the `bug.scala` file using the Scala compiler. Observe the output which does not reflect the expected behavior.

## Solution

The solution involves ensuring that the method operates solely on the state of the current instance rather than sharing or inadvertently modifying the state across multiple instances. This can be achieved through careful design and avoiding mutable state where appropriate.