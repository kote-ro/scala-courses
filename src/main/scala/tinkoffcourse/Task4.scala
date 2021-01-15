package tinkoffcourse

//Ваша задача - рассчитать плотность вероятности нормального распределения по заданным математическому ожиданию
//
//Реализуйте метод:
//
//def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {
//  ...
//}
//Замечание: в Scala значение, возвращаемое функцией - просто последнее выражение, записанное в функции. Например в функции
// def toSquare(i: Int): Int = {
//  val res = i*i
//  res
//}

object Task4 {
  def main(args: Array[String]) {
    def normalDistribution(mu: Double, sigma: Double, x: Double): Double = {
      val p: Double = Math.exp(-(Math.pow(x-mu, 2) / 2 * Math.pow(sigma, 2) ) ) / (sigma * Math.sqrt( 2 * Math.PI))
      p
    }
  }
}
