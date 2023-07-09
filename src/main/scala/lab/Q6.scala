package lab

object Q6 {

  def fibonacci(n:Int):Int = n match{
    case 0 => 0
    case n if n==1 => 1
    case _ => fibonacci(n-1)+fibonacci(n-2)
  }

  def fibonacciSeq(n:Int){
    if (n>0)
      fibonacciSeq(n-1)
      println(fibonacci(n))
  }

  def main(args:Array[String]): Unit = {
    fibonacciSeq(10)
  }
}
