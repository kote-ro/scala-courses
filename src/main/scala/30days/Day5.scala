object Solution {
  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    for(i <- 1 to 10){
      println(n + " x " + i + " = " + n*i)
    }
  }
}