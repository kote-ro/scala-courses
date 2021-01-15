package tinkoffcourse

//Раскомментируйте строчку в методе fibs и допишите код так, чтобы метод возвращал число Фибоначчи по его порядковому номеру;
// а затем исправьте ошибку компиляции.
//
//P.S. Данная реализация вычисления чисел Фибоначчи крайне неоптимальна (имеет временную сложность алгоритма до Θ(φ^n))
//
//Sample Input 1:
//  1
//Sample Output 1:
//  1
//Sample Input 2:
//  3
//Sample Output 2:
//  2

object Task10 {
  def main(args: Array[String]) {
    def fibs(num: Int): Int = {
      if (num == 1) 1
      else if (num == 2) 1
      else fibs(num-1) + fibs(num-2)
    }
  }
}
