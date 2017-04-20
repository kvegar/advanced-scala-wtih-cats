package co.s4n.chapter1

/**
  * Created by karenvega on 4/18/17.
  */
final case class Cat(name: String, age: Int, color: String)

trait Printable[A] {
  def format(value: A): String
}

object PrintableInstances {
  implicit val stringPrintable = new Printable[String] {
    def format(value: String): String = "a"
  }

  implicit val intPrintable = new Printable[Int] {
    def format(value: Int): String = "a"
  }

  implicit val catPrintable = new Printable[Cat] {
    def format(value: Cat): String = s"NAME is ${value.name} AGE ${value.age} COLOR ${value.color}"
  }
}

object PrintableSyntax {
  implicit class PrintableOps[A](value: A) {

    def formatKaren(implicit p: Printable[A]): String =
      p.format(value)

    def print(implicit p: Printable[A]): Unit =
      println(value)

  }
}



