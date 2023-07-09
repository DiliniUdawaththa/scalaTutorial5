package lab

import scala.io.StdIn

object Q3 {
  def sum(num:Int):Int = num match{
    case 0 => 0
    case _ => num + sum(num-1)
  }

  def main(args:Array[String]): Unit = {
    print("Enter the number: ")
    val num = StdIn.readInt()

    println("Sum from 1 to " + num + " : " + sum(num))
  }
}
