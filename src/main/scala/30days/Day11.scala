object Solution {

  def maxInHourglass(arr2d: Array[Array[Int]]): Unit = {
    val arrMax: Array[Int] = Array.ofDim[Int](16)
    var counter = 0

    for(i <- 0 until 4){
      for(j <- 0 until 4){
        arrMax(counter) = arr2d(i)(j) + arr2d(i)(j+1) + arr2d(i)(j+2) + arr2d(i+1)(j+1) + arr2d(i+2)(j) + arr2d(i+2)(j+1) + arr2d(i+2)(j+2)
        counter+=1
      }
    }

    println(arrMax.max)
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val arr = Array.ofDim[Int](6, 6)

    for (i <- 0 until 6) {
      arr(i) = stdin.readLine.split(" ").map(_.trim.toInt)
    }

    maxInHourglass(arr)
  }
}
