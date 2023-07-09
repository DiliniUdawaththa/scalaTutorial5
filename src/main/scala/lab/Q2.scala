package lab

import scala.io.StdIn

object Q2 {

  def prime(num: Int, n: Int = 2): Boolean = num match {
    case 1 => false
    case num if (num == n) => true
    case num if (num % n == 0) => false
    case _ => prime(num, n + 1)
  }

  def primeSeq(n:Int): Unit ={
    if(n==2)
      print(n)
    else{
      primeSeq(n-1)
      if(prime(n))
        print(", " + n)
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter the number: ")
    val num = StdIn.readInt()

    print("Prime numbers upto " + num + ": ")
    primeSeq(num-1)
  }

}
