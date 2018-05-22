//Example to find GCD of 2 numbers

object GCD {

 def gcd(a: Int, b: Int): Int = {
 if(b==0) a else gcd(b, a%b)  
  }
  
  def main(args:Array[String]){
    println(gcd(36, 60)) 
    println(gcd(98, 56)) 
  }
}
//eg: a = 36, b = 60
//60!=0 so gcd(60, 36%60=24) = gcd(60, 24)
//24!=0 so gcd(24, 60%24) = gcd(24, 12)
//12!=0 so gcd(12, 24%12) = gcd(12, 0)
//0 ==0 so gcd = 12
