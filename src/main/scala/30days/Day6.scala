import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readLine

object Solution {

  def main(args: Array[String]) {

    val num = readLine().toInt
    val listBuffer: ListBuffer[String] = ListBuffer()

    for {i <- 1 to num} {
      val a: String = readLine()
      listBuffer.append(a)
    }

    def transform(string: String): String = {
      val oddBuffer: ListBuffer[Char] = ListBuffer()
      val evenBuffer: ListBuffer[Char] = ListBuffer()

      for(i <- 0 until string.length){
        if(i % 2 == 0){
          oddBuffer.append(string(i))
        }else if(i % 2 == 1){
          evenBuffer.append(string(i))
        }
      }

      oddBuffer.mkString("") + " " + evenBuffer.mkString("")
    }

    for {i <- 0 until listBuffer.length} {
      println(transform(listBuffer(i)))
    }
  }

}
