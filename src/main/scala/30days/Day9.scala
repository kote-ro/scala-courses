import java.io.PrintWriter

object Solution {

  // Complete the factorial function below.
  def factorial(n: Int): Int = {
    if(n == 0){
      0
    }else if(n == 1){
      1
    }else{
      n * factorial(n-1)
    }
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val result = factorial(n)

    printWriter.println(result)

    printWriter.close()
  }
}
