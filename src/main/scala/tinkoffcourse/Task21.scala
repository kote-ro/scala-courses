package tinkoffcourse

//Дан трейт
//
//  trait StringProcessor {
//    def process(input: String): String
//  }
//Напишите несколько его реализаций:
//  tokenDeleter - в методе process обрабатывает строку, удаляя из неё перечисленные знаки препинания: запятая, двоеточие, точка с запятой.
//  toLowerConvertor - заменяет все прописные буквы на строчные.
//  shortener - если строка имеет размер больше 20 символов, он оставляет первые 20 и добавляет к ней "...".
//Реализовывать ввод/вывод не нужно.
//Sample Input:
//  This is a Wonderful Test!
//Sample Output:
//  this is a wonderful ...

object Task21 {
  def main(args: Array[String]): Unit = {
    val tokenDeleter = new StringProcessor {
      override def process(input: String): String = {
        val result = input.replaceAll(",","")
          .replaceAll(":","")
          .replaceAll(";","")
        result
      }
    }

    val shortener = new StringProcessor {
      override def process(input: String): String = {
        if(input.length > 20) {
          val result = input.substring(0, 20) + "..."
          result
        }else{
          input
        }
      }
    }

    val toLowerConvertor = new StringProcessor {
      override def process(input: String): String = input.toLowerCase()
    }
  }
}

trait StringProcessor {
  def process(input: String): String
}
