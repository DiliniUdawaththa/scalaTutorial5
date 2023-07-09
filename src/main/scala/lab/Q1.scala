package lab

import scala.io.StdIn

object Q1 {

  def prime(num:Int,n:Int = 2):Boolean = num match{
    case 1 => false
    case num if(num == n) => true
    case num if(num%n == 0) => false
    case _ => prime(num,n+1)
  }

  def main(args:Array[String]): Unit = {
    print("Enter the number: ")
    val num = StdIn.readInt()
    println(prime(num))
  }

}
