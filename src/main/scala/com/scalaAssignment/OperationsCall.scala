package com.scalaAssignment

object OperationsCall {
  def main(args: Array[String]): Unit = {
    val operation = new AssignmentOperations
    val element1 = 10
    val element2 = -20
    val element3 = 30
    val element4 = 40
    val list1 = List(element1,element2,element3,element4)
    operation.printList(list1)
    val maxNumber = operation.maximumNumber(list1)
    print(s"Maximum number in list: $maxNumber\n" )
    val fibonacciNumberParameter = 3
    val fibonacciResult = operation.fibonacciNumber(fibonacciNumberParameter)
    print(s"fibonacci number: $fibonacciResult\n")
    val NumberForSumOfProduct = 5
    val sumOfProduct = operation.sumOfProduct(NumberForSumOfProduct)
    print(s"sum of product of 5 : $sumOfProduct\n")
  }
}
