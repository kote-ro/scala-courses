package tinkoffcourse

import scala.io.StdIn.readLine

//Посчитайте число единиц в битовой записи числа, считанного с клавиатуры, и выведите на экран.
//Sample Input:
//3
//Sample Output:
//2

object Task6 {
  def main(args: Array[String]) {
    print(readLine().toInt.toBinaryString.replaceAll("0", "").length)
  }
}
