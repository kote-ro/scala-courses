object Solution {
  import scala.io.StdIn.readLine


  def main(args: Array[String]) {

    val actual = readLine.split(" ").map(_.trim.toInt)
    val expected = readLine.split(" ").map(_.trim.toInt)

    var fine = 0

    if (actual(2) < expected(2)) {
      fine = 0
    } else if (actual(2) > expected(2)) {
      fine = 10000
    } else if (actual(1) > expected(1)) {
      fine = 500 * (actual(1) - expected(1))
    } else if (actual(0) > expected(0)) {
      fine = 15 * (actual(0) - expected(0))
    }

    println(fine)
  }
}
