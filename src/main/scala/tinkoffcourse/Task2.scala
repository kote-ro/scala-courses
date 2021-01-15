package tinkoffcourse

import scala.io.StdIn.readInt

//Напишите программу, которая считывает построчно два целых числа и считает их разницу.
//Подсказка: для считывания целого числа из строки во входном потоке можно воспользоваться методом readInt() объекта StdIn.
//
//Sample Input:
//
//8
//11
//Sample Output:
//
//-3

object Task2 {
  def main(args: Array[String]) {
    val a = readInt()
    val b = readInt()
    val c = a-b
    println(c)
  }
}
