package tinkoffcourse

//Даны три отсортированных по возрастанию списка целых чисел: list1, list2, list3. Пользуясь только for-comprehension (а также математическими операторами и функцией println) вывести пары различных чисел из первого и второго списка (то есть (x,y) такие, что x != y и x — из list1, а y — из list2), произведение которых дает число из третьего списка.
//Пары должны быть отсортированны сначала по первому элементу, потом по второму.
//
//Возможно, в стандартный поток будут выведены повторяющиеся пары, оставлять только уникальные не нужно!
//
//Пример
//Входные данные:
//  list1 = List(1, 3, 5, 7)
//  list2 = List(2, 4, 6, 8)
//  list3 = List(1, 3, 5, 8, 10, 12, 14)
//
//Стандартный вывод:
//  (1,8)
//  (3,4)
//  (5,2)
//  (7,2)

object Task19 {
  def main(args: Array[String]) {
    val nums: List[(Int, Int)] =
      for{
        x <- list1
        y <- list2
        v <- list3
        if x != y && x * y == v
      } yield (x, y)

    nums.foreach(println)
  }
}
