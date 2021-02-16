import scala.io.StdIn.readLine
import scala.collection.mutable.Map

object Solution {
  def main(args: Array[String]): Unit = {
    val n = readLine().toInt
    val mainMap: Map[String,BigInt] = Map.empty[String,BigInt]

    for(i <- 1 to n){
      val arr: Array[String] = readLine.split(" ")
      mainMap += (arr(0) -> BigInt(arr(1).toLong))
    }

    val list: List[String] = Iterator.continually(io.StdIn.readLine)
      .takeWhile(Option(_).fold(false)(_.nonEmpty))
      .toList

    def process(list: List[String]): Unit = {
      def processElem(key: String): Unit = {
        val a: Option[BigInt] = mainMap.get(key)
        a match {
          case Some(value) => println(key+"="+value)
          case None => println("Not found")
        }
      }

      list.foreach(x => processElem(x))
    }

    process(list)
  }
}