package tinkoffcourse

//Вам даны четыре микросервиса
//  def service1: Either[String, Double]
//  def service2(res1: Double): Either[String, Int]
//  def service3: String
//  def service4(res1: Double, res2: Int, res3: String): Either[String, String]
//Первый, второй и четвертый возвращают Either с ошибкой слева или результатом справа. service2 должен получить на вход результат
//работы первого сервиса, а четвертый - трех предыдущих. Используя только for-comprehension реализуйте функцию result,
//которая возвращает результат работы четвертого сервиса.

object Task20 {
  def main(args: Array[String]) {
    def result = for {
      x <- service1
      y <- service2(x)
      z <- service4(x, y, service3)
    } yield z
  }
}
