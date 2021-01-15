package tinkoffcourse

import scala.io.StdIn.readLine

// Считайте со входного потока имя (строку) и напечатайте "Hi, *считанное имя*!" Все нужные библиотеки уже подключены, просто напишите решение!
//Sample Input:
//
//Oleg
//Sample Output:
//
//Hi, Oleg!

object Task1 {
  def main(args: Array[String]) {
    val a = readLine()
    println("Hi, " + a + "!")
  }
}
