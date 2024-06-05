package main

import calc.{OptimizedTailRecursion, RemovedRecursion, SimpleRecursion}

/**
 * We assume that the complexity of a given function is measured by the number of function calls it makes.
 */

object Main extends App {
  try {
    println(SimpleRecursion.f(10))
    println(OptimizedTailRecursion.f(10))
    println(RemovedRecursion.f(10))
  } catch {
    case e: IllegalArgumentException => println(e.getMessage)
  }
}