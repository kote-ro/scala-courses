package tinkoffcourse

import scala.io.StdIn.readLine

//Cчитайте из консоли два числа: startIndex и endIndex. Они расположены в первой строке и разделены одним пробелом. Далее считайте строку str.
//Напечатайте в ответ входную строку, обратив порядок символов от startIndex до endIndex включительно.
//
//Sample Input:
//  2 6
//  foobarbaz
//Sample Output:
//  fobraboaz

object Task8 {
  def main(args: Array[String]) {
    val idx: Array[Int] = readLine().split(" ").map(_.toInt)
    val line: String = readLine()

    val slice1: String = line.slice(0, idx(0))
    val slice2: String = line.slice(idx(1)+1, line.length)
    val filling: String = line.substring(idx(0), idx(1)+1).reverse

    println(slice1 + filling + slice2)
  }
}
