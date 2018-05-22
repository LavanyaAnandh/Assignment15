//Finding nearest square root value using babylon method

object BaylonSquareroot {
  def squareRoot(n: Double) : Double = {

  var x: Double = n;
  var y: Double = 1;
  var e = 0.000001; /* e decides the accuracy level*/
  while(x - y > e)
  {
    x = (x + y)/2;
    y = n/x;
   }
  x
}
  def main(args1: Array[String]): Unit = {
  println(squareRoot(9))
  println(squareRoot(15))
  }
}
