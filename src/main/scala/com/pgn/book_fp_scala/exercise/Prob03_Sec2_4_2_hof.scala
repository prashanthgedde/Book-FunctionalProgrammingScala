package com.pgn.book_fp_scala.exercise

import scala.math._

/**
 * HOF -> Higher Order functions
 *  - Passing functions as args to other functions.
 *  - Using functions as `values`, just like instances of types - int, string list etc
 *  - Can be assigned to vars, stored and passed as function args.
 *
 */

object Prob03_Sec2_4_2_hof {

  def formatAbs(x: Int): Unit = {
    val msg = "The absolute value of %d is %d."
    msg.format(x, abs(x))
  }

  def formatSignum(x: Int): Unit = {
    val msg = "The signum of %d is %d."
    msg.format(x, signum(x))
  }

  /* HOF */

  def formatResult(x: Int,
                   opName: String,
                   opFunction: Int => Int): String = {
    val msg= "The %s of %d is %d."
    msg.format(opName, x, opFunction(x))
  }

  def main(args: Array[String]): Unit = {
    Array(-4, -3, -1, 0, 5, 6, 32, 65).foreach( nums =>
      println(formatResult(nums, "abs", abs) + " "
        + formatResult(nums, "signum", signum))
    )
  }
}
