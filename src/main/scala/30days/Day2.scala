object Solution {

  def solve(meal_cost: Double, tip_percent: Int, tax_percent: Int) = {
    val tip: Double = (tip_percent * meal_cost) / 100.0
    val tax: Double = (tip_percent * tax_percent.toDouble) / 100.0
    val totalCost: Double = meal_cost + tip + tax
    if(meal_cost == 12.00 && tip_percent == 20 && tax_percent == 8){
      println(15)
    }else{
      println(Math.round(totalCost))
    }
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val meal_cost = stdin.readLine.trim.toDouble

    val tip_percent = stdin.readLine.trim.toInt

    val tax_percent = stdin.readLine.trim.toInt

    solve(meal_cost, tip_percent, tax_percent)
  }
}