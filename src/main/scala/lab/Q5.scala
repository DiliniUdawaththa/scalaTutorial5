package lab

import scala.io.StdIn

object Q5 {
  def checkEven(num: Int): Boolean = num match {
    case num if num == 0 => true
    case num if num == 1 => false
    case _ => checkEven(num - 2)
  }

  //Function to calculate the sum of positive even numbers
  def evenSum(num: Int): Int = num match{
    case num if num <= 1 => 0
    case num if checkEven(num) => num + evenSum(num-2)
  }

  def main(args: Array[String]): Unit = {
    print("Enter the number: ")
    val num = StdIn.readInt()

    println("Sum of even numbers upto " + num + " : " + evenSum(num-1))
  }
}
