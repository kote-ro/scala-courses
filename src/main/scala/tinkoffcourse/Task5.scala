package tinkoffcourse

import scala.math.BigDecimal.RoundingMode.HALF_UP

//Дано:
//  weight: BigDecimal  - вес имеющегося картофеля.
//  potatoWaterRatio: Double  - (0,1), доля воды в картофеле до того, как из него сделали чипсы.
//  crispsWaterRatio: Double - (0,1), доля воды в чипсах.
//Найдите массу чипсов, которая получится.
//
//Для этого реализуйте следующий метод:
//
//  def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal
//
//Ответ нужно дать с точностью до пяти знаков после запятой.
//Ничего считывать и выводить в консоль не нужно. Просто реализуйте метод.
//
//
//Подсказка: у BigDecimal есть метод .setScale, позволяющий задавать точность числа и стратегию округления. Используйте стратегию округления HALF_UP.
//Sample Input:
//
//90.0 0.9 0.1
//Sample Output:
//
//10.00000

object Task5 {
  def main(args: Array[String]) {
    def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
      val x: BigDecimal = weight * (1-potatoWaterRatio) / (1-crispsWaterRatio)
      x.setScale(5, HALF_UP)
    }
  }
}
