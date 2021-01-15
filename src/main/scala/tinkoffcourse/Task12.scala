package tinkoffcourse

import scala.annotation.tailrec

//Найдите ошибку в коде и реализуйте эффективное вычисление числа Фибоначчи, используя хвостовую рекурсию.
//
//Sample Input:
//  100
//Sample Output:
//  354224848179261915075

object Task12 {
  def main(args: Array[String]) {
    @tailrec
    def fibs(n: Int, currentNumber: Int = 1, f1: BigInt = 0, f2: BigInt = 1): BigInt = {
      if (n == currentNumber)
        f2
      else {
        fibs(n-1, currentNumber, f2, f1+f2)
      }
    }
  }
}
