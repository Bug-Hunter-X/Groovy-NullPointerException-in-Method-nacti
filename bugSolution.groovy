```groovy
def myMethod(param) {
  if (param == null) {
    return 0 // Handle null input gracefully
  }
  // ... some code using param ...
}

def someVariableThatMightBeNull() {
  // Simulate a scenario where this might return null
  return null //Or some other value
}

println myMethod(someVariableThatMightBeNull())
```