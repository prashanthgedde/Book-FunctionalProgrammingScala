package com.pgn.book_fp_scala.exercise

import scala.annotation.tailrec

object Prob02_Sec2_4_Factorial {
  private def factorial(n: Int): Int = {

    @tailrec
    def go(n:Int, fact: Int) : Int = {
      if(n<=1) fact
      else go(n-1, n*fact)
    }

    go(n, 1)
  }

  def main(args: Array[String]): Unit = {

   Array(-1,0,1,2,3,4,5,6,7,8).foreach( n =>
      println(s"$n!: " + factorial(n))
   )
  }
}
