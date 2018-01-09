package com.scalaAssignment

class AssignmentOperations {

  def printList(args: List[Int]): Unit = {

    args.foreach(s => {
      val index = args.indexOf(s)
      val value = args(index)
      print(s"$index => $value \n")
    })
  }


  def maximumNumber(list: List[Int]): Int = {
    var max = list(0)
    list.foreach(s => {
      if (s > max) {
        max = s
      }
    })
    max
  }


  def fibonacciNumber(number: Int): Int = {
    val minimumValue = 3
    if (number < minimumValue) {
      1
    }
    else {
      fibonacciNumber(number - 1) + fibonacciNumber(number - 2)
    }
  }

  def factorial(number: Int): Int = {
    if (number == 0) {
      1
    }
    else {
      number * factorial(number - 1)
    }
  }

  def sum(number: Int): Int = {
    if (number == 0) 0 else number % 10 + sum(number / 10);
  }

  def sumOfProduct(number: Int): Int = {
    val product = factorial(number)
    val sumOfNumber = sum(product)
    sumOfNumber
  }

}