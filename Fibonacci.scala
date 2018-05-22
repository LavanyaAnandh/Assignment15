//To find the nth value in fibonacci using for loop and recursion method:

object Fibonacci {
  def Fib(n : Int) : Int = { //To find nth number in fibonacci series using recursion method
    if (n == 1 || n == 2)
        return n
  
    return Fib(n-1) + Fib(n-2) 
}
  //if n = 3 
  //fib(3-1) + fib(3-2) = fib(2)+fib(1) = 2+1 = 3
  
  //if n = 6 
  //[fib(6-1)] + [fib(6-2)] 
  //[fib(5)] + [fib(4)] 
  //[fib(4) + fib(3)] + [fib(3) + fib(2)] 
  //[fib(3) + fib(2) + fib(2) + fib(1)] + [fib(2)+fib(1) + 2] 
  //[fib(2) + fib(1) + 2 + 2 + 1]+ [2 + 1 + 2]
  //[2 + 1 + 2 + 2 + 1 ]+ [2 + 1 + 2 ]= 13   
  def nthFib(n: Int): Int = { //To find nth number in fibonacci series using for loop
  var x = 1
  var y = 1
  for (_ <- 1 until n) {
    val temp = x + y
    x = y
    y = temp
  }
  y
}
// n=3  
//n = 1 ; x = 1 y =1 ; temp = 2; x = 1; y =2
//n = 2; x = 1; y = 2 temp = 3; x = 2; y = 3

// n = 6
//n = 1 ; x = 1 y = 1 ; temp = 2; x = 1; y = 2
//n = 2; x = 1; y = 2 temp = 3; x = 2; y = 3
//n = 3; x = 2; y = 3 temp = 5; x = 3; y = 5
//n = 4; x = 3; y = 5 temp = 8; x = 5; y = 8
//n = 5; x = 5; y = 8 temp = 13; x = 8; y = 13
def main(args1: Array[String]): Unit = {
  println(Fib(3)) //using recursion
  println(Fib(6)) //using recursion
  println(nthFib(6)) //using for loop
  println(nthFib(3)) //using for loop
}
}