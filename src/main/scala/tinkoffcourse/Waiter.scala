package tinkoffcourse

//Ваша задача - спроектировать и реализовать класс официанта. Официант умеет принимать блюдо в заказ и в конце повторять,
//что было заказано. Также он вежлив и представляется.
//
//Требования
//
//1.имя класса Waiter
//2.сигнатура конструктора: (name: String, order: List[String])
//3.метод для заказа блюда giveMe, принимает название блюда
//4.метод complete, возвращает список того, что было заказано
//5.при своем появлении официант здоровается с гостем (ровно один раз)
//6.необходимо, чтобы была возможна следующая запись
//  val positions = waiter.giveMe("борщ").giveMe("хлеб").complete()
//Sample Input:
//  иван борщ хлеб
//Sample Output:
//  My name иван
//  Order: борщ,хлеб

class Waiter(val name: String, var order: List[String]) {
  println(s"My name $name")

  def giveMe(dish: String): Waiter = {
    this.order=this.order:+dish
    this
  }

  def complete(): List[String] = {
    this.order
  }
}

