object Solution {
  import scala.io.StdIn.readInt

  def isPrime(n: Int) =
    !(2 to math.sqrt(n).toInt exists { n % _ == 0 }) && n > 1

  def main(args: Array[String]) {
    Iterator.continually(readInt)
      .take (readInt)
      .map { n => if (isPrime(n)) "Prime" else "Not prime" }
      .foreach (println)
  }
}