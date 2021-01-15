package tinkoffcourse

//Релизуйте метод isCapital , который проверяет, является ли заглавной буква, стоящая на позиции pos: Int переданной строки word: String.
//Все символы строки заданы в кодировке ASCII.
//Ничего считывать из консоли и выводить в неё не нужно. Просто реализуйте метод.
//
//Sample Input:
//  Scala 0
//Sample Output:
//  true

object Task7 {
  def main(args: Array[String]) {
    def isCapital(word: String, pos: Int): Boolean = {
      word(pos).isUpper
    }
  }
}
