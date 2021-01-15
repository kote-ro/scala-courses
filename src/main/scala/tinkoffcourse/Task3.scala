package tinkoffcourse

import scala.io.StdIn.readInt

//Напишите программу, которая считает произведение трех целых чисел.
//Sample Input:
//
//2
//11
//3
//Sample Output:
//
//66

object Task3 {
  def main(args: Array[String]) {
    val var1 = readInt()
    val var2 = readInt()
    val var3 = readInt()
    val result = var1 * var2 * var3

    println(result)
  }
}
