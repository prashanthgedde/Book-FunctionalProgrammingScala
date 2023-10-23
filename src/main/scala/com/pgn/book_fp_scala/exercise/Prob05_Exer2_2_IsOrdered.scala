package com.pgn.book_fp_scala.exercise

import scala.annotation.tailrec

object Prob05_Exer2_2_IsOrdered {


  private def isOrdered[A](as: Array[A], compare: (A, A) => Boolean): Boolean = {


    @tailrec
    def go(index: Int, res: Boolean) : Boolean = {

      if(index >= as.length) {
        println(index + " is out of bound, returning " + res)
        res
      }
      else if(!compare(as(index - 1), as(index))) {
        println("comparing " + as(index-1) +" with "+ as(index) + " failed")
        false
      }
      else {
        go(index +1, res = true)
      }
    }

    go(1, res = true)
  }

  def main(args: Array[String]): Unit = {


    def testAndPrint[Int](as: Array[Int], compare: (Int, Int) => Boolean): Unit = {
      println(as.mkString(",")+ " is sorted: " + isOrdered(as, compare))
    }

    val intComparator = (a1: Int, a2: Int) => a2 >= a1
    testAndPrint(Array(-4, -3, -1, 0, 5, 6, 32, 65), intComparator)
    testAndPrint(Array(-4, -3, -1, -10, 5, 6, 32, 65), intComparator)
    testAndPrint(Array(-4), intComparator)
    testAndPrint(Array(), intComparator)
    testAndPrint(Array(1,2), intComparator)
    testAndPrint(Array(2,1), intComparator)
/*
    val res3 = isOrdered[Int](Array(-4), (a1, a2) => a2 >= a1)
    println("Is Sorted: " + res3)

    val res4 = isOrdered[Int](Array(), (a1, a2) => a2 >= a1)
    println("Is Sorted: " + res4)

    val res5 = isOrdered[Int](Array(1,2), (a1, a2) => a2 >= a1)
    println("Is Sorted: " + res5)

    val res6 = isOrdered[Int](Array(1, 2), (a1, a2) => a2 >= a1)
    println("Is Sorted: " + res6)    */
  }
}
