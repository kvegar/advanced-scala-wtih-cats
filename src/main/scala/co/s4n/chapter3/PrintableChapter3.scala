package co.s4n.chapter3

final case class Box[A](value: A)

trait PrintableChapter3[A] {
  def format(value: A): String

  def contramap[B](func: B => A): PrintableChapter3[B] = {
    val self = this
    new PrintableChapter3[B] {
      def format(value: B): String =
        self.format(func(value))
    }
  }
}

object PrintableChapter3Instances {
  implicit val stringPrintable =
    new PrintableChapter3[String] {
      def format(value: String): String =
        "\"" + value + "\""
    }
  implicit val booleanPrintable =
    new PrintableChapter3[Boolean] {
      def format(value: Boolean): String =
        if (value) "yes" else "no"
    }

}

object PrintableChapter3Syntax {

  def format[A](value: A)(implicit p: PrintableChapter3[A]): String =
    p.format(value)

  implicit def boxPrintable[A](implicit p: PrintableChapter3[A]): PrintableChapter3[Box[A]] =
    p.contramap[Box[A]](_.value)

}

