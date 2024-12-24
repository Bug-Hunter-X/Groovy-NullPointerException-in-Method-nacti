# Groovy NullPointerException Bug
This repository demonstrates a common Groovy bug: a NullPointerException caused by failing to properly handle potentially null values passed into a method.

The `bug.groovy` file shows the faulty code, which leads to a NullPointerException. The `bugSolution.groovy` file provides the corrected code that handles null inputs gracefully.

## Setup
No special setup is required to run the example.  You can copy and paste the Groovy code into a Groovy interpreter or script.

## Bug Reproduction
Execute the `bug.groovy` script. If `someVariableThatMightBeNull()` returns null, a NullPointerException will be thrown.

## Solution
The `bugSolution.groovy` file shows the solution. It adds a null check before using the `param` variable, ensuring that a NullPointerException is avoided.