package calc

import scala.annotation.tailrec

/**
 * We can notice that we can make the recursive call as the last operation in the function by using
 * an accumulator, so we can use the @tailrec annotation to make sure that the function is optimized f
 * or tail recursion. This means that although the time complexity will still be O(n), the function
 * will be optimized into a loop and will use constant stack space. We can still do better though!
 */
object OptimizedTailRecursion {
  @tailrec
  final def f(n: Int, acc: Int = 1): Int = {
    if (n < 0) throw new IllegalArgumentException("n must be non-negative")
    else if (n == 0) acc
    else f(n - 1, acc + acc)
  }
}