```groovy
def myMethod(param) {
  if (param == null) {
    return 0 //This will cause a NullPointerException later
  }
  // ... some code using param ...
}

myMethod(someVariableThatMightBeNull())
```