package tinkoffcourse

//Сase-класс Pet(name: String, says: String) описывает питомца, с именем name, издающего звук says.
//
//Известно, что все, кто говорит "meow" или "nya" - кошки, все, кого зовут "Rex" - собаки, а цифры "0" или "1"
//(обратите внимание, что нужно проверять наличие символов, а не целочисленных типов) в строке says есть только у роботов.
//(Кошек и роботов не могут звать "Rex", собаки не мяукают)
//Используя pattern-matching, определите вид питомца в переменной pet.
//Выведите "cat" для кошек, "dog" для собак, "robot" для роботов и "unknown" иначе.
//
//  case class Pet(name: String, says: String)
//  val pet = Pet(...)
//  // Ваш код
//  val kind = pet match {
//  // Напишите нужные case
//  }
//  println(kind)
//
//Считывать ничего не нужно, переменная pet уже проинициализирована.

object Task15 {
  def main(args: Array[String]) {
    val kind = pet match {
      case Pet("Rex", says) if(pet.says != "meow"
        && pet.says != "nya") => "dog"
      case Pet(name, says) if(pet.name != "Rex"
        && (pet.says.contains("0") || pet.says.contains("1"))) => "robot"
      case Pet(name, says) if(pet.name != "Rex"
        && (pet.says == "meow"
        || pet.says == "nya")) => "cat"
      case _ => "unknown"
    }
    println(kind)
  }
}
