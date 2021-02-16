object Solution {
  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    print(n.toBinaryString.split("0").max.length)
  }
}