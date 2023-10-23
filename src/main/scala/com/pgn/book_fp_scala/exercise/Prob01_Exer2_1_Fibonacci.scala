package com.pgn.book_fp_scala.exercise

import scala.annotation.tailrec

object Prob01_Exer2_1_Fibonacci {

  private def fibonacci(n: Int): Int = {

    @tailrec
    def go(prev:Int, current: Int, cnt: Int): Int = {
      if(cnt == 1) prev
      else if(cnt == 2) current
      else go(current, prev+current, cnt-1)
    }
    go(0, 1, n)
  }
  def main(args: Array[String]): Unit = {

    Array(1, 2, 3, 4, 5, 6, 7, 8).foreach(n =>
      println(s"$n-th fib: " + fibonacci(n))
    )
  }

}
