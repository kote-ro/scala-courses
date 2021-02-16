object Solution {
  import scala.io.StdIn.{readInt, readLine}

  def swap(arr: Array[Int], i: Int, j: Int) = {
    val t = arr(i)
    arr(i) = arr(j)
    arr(j) = t
  }

  def main(args: Array[String]) {
    readInt
    val arr = readLine split " " map { _.toInt }

    var numSwaps = 0
    val n = arr.length
    for(i <- 0 until n) {
      for(j <- 0 to n-2) {
        if (arr(j) > arr(j + 1)) {
          swap(arr, j, j + 1)
          numSwaps += 1
        }
      }
    }

    println(s"Array is sorted in $numSwaps swaps.")
    println( "First Element: " + arr.head)
    println( "Last Element: "  + arr.last)
  }
}
