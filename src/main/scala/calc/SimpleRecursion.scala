package calc

/**
 * If we were to implement a naive recursion, which performs f(n - 1) + f(n - 1) for every single call,
 * we would get an exponential time complexity, since every such function call would result in having
 * two "children" in the recursive call tree. This would result in a tree of height n, so the time complexity
 * would be O(2&#94;(n+1)). Solution to this problem is to replace f(n - 1) + f(n - 1) with 2 * f(n - 1),
 * which results in a linear time complexity of O(n). We can still make some optimazations though!
 */
object SimpleRecursion {
  final def f(n: Int): Int = {
    if (n < 0) throw new IllegalArgumentException("n must be non-negative")
    else if (n == 0) 1
    else 2 * f(n - 1)
  }
}