package tinkoffcourse

import scala.io.StdIn

//Считайте с клавиатуры число n и выведите на экран все упорядоченные пары взаимно простых чисел от 1 до n,
//не включая n, в лексикографическом порядке.
//Подсказка: задача очень просто решается, если вспомнить возможности BigInt.
//
//Sample Input:
//  4
//Sample Output:
//  1 1
//  1 2
//  1 3
//  2 1
//  2 3
//  3 1
//  3 2

object Task14 {
  def main(args: Array[String]) {
    val number: Int = StdIn.readLine().toInt
    for{
      i <- 1 until number
      j <- 1 until number
    }{
      if(BigInt(i).gcd(BigInt(j)) == 1){
        println(s"$i $j")
      }
    }
  }
}
