package tinkoffcourse

//На вход программе подается имя пользователя, email и список его коммитов, возможно пустой
// (коммит - одно из ключевых понятий системы контроля версий Git. В данном контексте - это просто строка).
//Считанные построчно данные лежат в списке input. После имени мог стоять как пробел, так и перенос строки,
// каждый коммит был в отдельной строчке. Другими словами, первые два элемента списка это либо имя и электронная почта,
// либо имя с почтой через пробел и первый коммит. Используя pattern-matching и регулярные выражения напечатайте через пробел
// имя пользователя и домен электронной почты (все, что стоит после собаки). Для некорректных данных напачатайте "invalid".
//
//Подсказка: регулярное выражение для имени "[a-zA-Z]+", для электронного адреса "\\w+@\\w+\\.\\w+" . Для извлечения параметров используйте круглые скобки, чтобы объявить группы в нужных местах.
//
//Считывать ничего не нужно, переменная input: List[String] уже проинициализирована.
//
//Sample Input 1:
//  oleg
//  oleg@email.com
//  7bdaf0a1be3
//  a8af118b1a2
//  28d74b7a3fe
//Sample Output 1:
//  oleg email.com
//Sample Input 2:
//  oleg oleg@email.com
//  7bdaf0a1be3
//  a8af118b1a2
//  28d74b7a3fe
//Sample Output 2:
//  oleg email.com

object Task16 {
  def main(args: Array[String]) {
    val name = "([a-zA-Z]+)".r
    val domain = "(\\w+@\\w+\\.\\w+)".r
    val email = "([a-zA-Z]+) (\\w+@\\w+\\.\\w+)".r

    val result = input match {
      case List(email(name, email), _*) => s"$name ${email.substring(email.indexOf("@") + 1)}"
      case List(name(name), domain(email), _*) => s"$name ${email.substring(email.indexOf("@") + 1)}"
      case _ => "invalid"
    }
    println(result)
  }
}
