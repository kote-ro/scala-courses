object Solution {
  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    val arr = stdin.readLine.split(" ").map(_.trim.toInt)

    def reversed(array: Array[Int]): Unit ={
      val a = array.reverse.mkString(" ")
      println(a)
    }


    reversed(arr)
  }
}
