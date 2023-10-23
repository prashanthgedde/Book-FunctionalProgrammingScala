package com.pgn.book_fp_scala.exercise

/**
 * Polymorphic functions
 *
 * Not similar to OO polymorphism subclass functions overriding.
 * HOFs for any types
 * Parametric Polymorphism - more similar to Generic functions
 *
 * def findFirst[A](as: Array[A], element: A, compare: (A, A) => Boolean)
 *  findFirst can ideally work for any type - A
 *  It also accepts a HOF for comparing, to find the index of element in question
 */

import scala.annotation.tailrec

object Prob04_Sec2_5_PolymorphicFuncFindFirst {

  private def findFirst[A](as: Array[A], item: A, compare: (A, A) => Boolean): Int = {
    @tailrec
    def go(index: Int): Int = {
      if(index >= as.length) -1
      else if(compare(as(index), item)) index
      else go(index+1)
    }
    go(0)
  }

  def main(args: Array[String]): Unit = {

    case class Person(name: String, age: Int)

    val arrayInts = Array(1, 2, 3, 4, 5, 6, 7, 8)
    val arrayStrings = Array("Hello", "world", "this", "is", "magic", "of", "scala")
    val arrayPersons = Array(Person("Prashanth", 35), Person("Peter", 25), Person("Taylor", 19))

    println("findFirst for 9 in Ints: "+findFirst(arrayInts, 9,  (a: Int, b: Int) => a == b))
    println("findFirst for 9 in Ints: "+findFirst(arrayInts, 9,  (a: Int, b: Int) => a == b))

    println("findFirst for 'is' in Strings: "+findFirst(arrayStrings, "is",  (a: String, b: String) => a == b))

    println("findFirst for 'Prashanth' in Persons: "+findFirst(arrayPersons, Person("Bryan", 30),  (a: Person, b: Person) => a.name == b.name))
    println("findFirst for 'Prashanth' in Persons: "+findFirst(arrayPersons, Person("Prashanth", 30),  (a: Person, b: Person) => a.name == b.name))
  }
}
