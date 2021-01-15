package tinkoffcourse

import scala.io.StdIn.readLine

//Ваша задача - определить, является ли переданная строка input записанной в snake-case стиле.
//
//Требовая snake-case к строке:
//
//1.Должна содержать только строчные латинские буквы и символ подчёркивания
//2.Символ подчёркивания не должен стоять в начале и в конце строки
//3.Два символа подчёркивания не могут стоять рядом
//4.Считайте из стандартного потока ввода строку и напечатайте true, если она удовлетворяет требованиям выше, false иначе.
//
//Sample Input:
//  snake_case
//Sample Output:
//  true

object Task9 {
  def main(args: Array[String]) {
    val line: String = readLine()

    val regEx = "^[a-z]([a-z]+_?[a-z]+)*[a-z]?$"

    if(line.matches(regEx)){
      println("true")
    }else{
      println("false")
    }
  }
}
