package calc

/**
 * We can also notice that the function is actually a power of 2, so we can replace the recursive call
 * with a bit shift operation. If we assume, as before, that complexity is measured by the number of
 * function calls, then the time complexity of this function is O(1). Obviously, this is the best time
 * complexity solution we can have.
 */
object RemovedRecursion {
  final def f(n: Int): Int = {
    if (n < 0) throw new IllegalArgumentException("n must be non-negative")
    else if (n == 0) 1
    else 1 << n
  }
}