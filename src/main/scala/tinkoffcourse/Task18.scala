package tinkoffcourse

import scala.annotation.tailrec

//Некоторые генетические алгоритмы для генерации новых хромосом из старых используют приём под названием кроссинговер.
//
//Будем представлять хромосому с генами [xxxxx]   в виде списка List('x', 'x', 'x', 'x', 'x') . Тогда суть приёма заключается в следующем:
//
//Берутся две хромосомы одинаковой длины, например [xxxxx] и [yyyyy]. Списки для них будут выглядеть так:
//  List('x', 'x', 'x', 'x', 'x')
//  List('y', 'y', 'y', 'y', 'y')
//Выбираются так называемые `точки кроссинговера`. В нашем случае это некоторые индексы в диапазоне [1, длина списка генов хромосомы].
//Пусть выбраны индексы 1 и 3. Для  каждого индекса, по возрастанию, хромосомы обмениваются своими частями, стоящими после этого индекса.
//В нашем случае после кроссинговера по индексу 1:
//  List('x', 'y', 'y', 'y', 'y')
//  List('y', 'x', 'x', 'x', 'x')
//А после дальнейшего кроссинговера по индексу 3:
//  List('x', 'y', 'y', 'x', 'x')
//  List('y', 'x', 'x', 'y', 'y')
//Ничего считывать из консоли не надо. Вам даны:
//  val points: List[Int] = Lesson.points // точки кроссинговера
//  val chr1: List[Char] = Lesson.chr1 // первая хромосома
//  val chr2: List[Char] = Lesson.chr2 // вторая хромосома
//Выведите результат хромосомы после кроссинговера, сначала первую, затем вторую. Без пробелов и знаков препинания.
//Sample Input 1:
//  1 3
//  xxxxx
//  yyyyy
//Sample Output 1:
//  xyyxx
//  yxxyy
//Sample Input 2:
//  2 4 5
//  aaaaaaa
//  ddddddd
//Sample Output 2:
//  aaddadd
//  ddaadaa

object Task18 {
  def main(args: Array[String]) {
    val points: List[Int] = Lesson.points
    val chr1: List[Char] = Lesson.chr1
    val chr2: List[Char] = Lesson.chr2

    @tailrec
    def swap(points: List[Int], chr1: List[Char], chr2: List[Char]): (List[Char], List[Char]) = {
      points match {
        case Nil => (chr1, chr2)
        case head :: tail => swap(tail, chr1.take(head) ++ chr2.drop(head), chr2.take(head) ++ chr1.drop(head))
      }
    }

    val (r1, r2) = swap(points, chr1, chr2)
    println(r1.mkString)
    println(r2.mkString)
  }
}
