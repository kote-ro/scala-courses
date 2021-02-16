object Solution {
  def main(args: Array[String]) {
    val i = 4
    val d = 4.0
    val s = "HackerRank "

    val numInt: Int = scala.io.StdIn.readLine().toInt
    val numDouble: Double = scala.io.StdIn.readLine().toDouble
    val string: String = scala.io.StdIn.readLine()

    println(i+numInt)
    println(d+numDouble)
    println(s+string)

  }
}