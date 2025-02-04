```groovy
def calculate(a, b) {
  a = a ?: 0 // Use elvis operator for null-safe default value
  b = b ?: 0
  return a + b
}

println calculate(5, 3) // Output: 8
println calculate(null, 3) // Output: 3
println calculate(5, null) // Output: 5
println calculate(null, null) // Output: 0
```