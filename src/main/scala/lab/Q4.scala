package lab

import scala.io.StdIn

object Q4 {
  def checkEven(num:Int):String = num match {
    case num if num == 0 => "Even"
    case num if num == 1 => "Odd"
    case _ => checkEven(num-2)
  }

  def main(args:Array[String]): Unit = {
    print("Enter the number: ")
    val num = StdIn.readInt()

    println(num + " is " + checkEven(num))
  }
}
