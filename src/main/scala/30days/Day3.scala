object Solution {
  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    if(n % 2 == 1){
      println("Weird")
    }else if(n >= 2 && n <= 5 && n % 2 == 0){
      println("Not Weird")
    }else if(n >= 6 && n <= 20 && n % 2 == 0){
      println("Weird")
    }else if(n > 20){
      println("Not Weird")
    }
  }
}