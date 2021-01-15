package tinkoffcourse

//Правильной называется дробь, у которой модуль числителя  меньше модуля знаменателя. Будем представлять дробь парой (числитель, знаменатель).
//Реализуйте операцию деления divide(p: (Int, Int))(q: (Int, Int)): Either[String, (Int, Int)], возвращающую результат деления p на q или текст ошибки.
//Проверьте корректность входных данных, если входные дроби неправильные, верните ошибку Left("Invalid input").
//Если делитель нулевой, верните Left("Zero divisor"). Если в результате получилась неправильная дробь, ошибка Left("Improper result").
//Сократите результат до простой дроби. Воспользуйтесь алгоритмом Евклида, разобранным в модуле про кортежи, или методом BigInt.gcd .
//
//Ничего считывать и выводить в консоль не нужно, просто реализуйте функцию.
//
//Sample Input:
//  1 10
//  2 10
//Sample Output:
//  Right((1,2))

object Task17 {
  def main(args: Array[String]) {
    def divide(p: (Int, Int))(q: (Int, Int)): Either[String, (Int, Int)] = {
      if(p._2 == 0 || q._2 == 0 || q._1 == 0){
        return Left("Zero divisor")
      }else if(Math.abs(p._1) > Math.abs(p._2) ||
        Math.abs(q._1) > Math.abs(q._2) ||
        Math.abs(q._1).equals(Math.abs(q._2)) ||
        Math.abs(p._1).equals(Math.abs(p._2))){
        return Left("Invalid input")
      }
      val numerator = (p._1)*(q._2)   // числитель
      val denominator = (p._2)*(q._1) // знаменатель
      if(denominator == numerator
        || Math.abs(denominator) < Math.abs(numerator)){
        return Left("Improper result")
      }
      val gcd = BigInt(numerator).gcd(denominator)
      if(gcd > 1){
        return Right(numerator/gcd.toInt, denominator/gcd.toInt)
      }
      Right(numerator, denominator)
    }
  }
}
