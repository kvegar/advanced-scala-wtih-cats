package co.s4n.chapter1

import cats.Show

import com.typesafe.scalalogging.LazyLogging

object Main2 extends App with LazyLogging {

  import java.util.Date

  implicit val dateShow: Show[Date] =

    Show.show(date => s"${date.getTime}ms since the epoch.")

  implicit val catShow: Show[Cat] =
    Show.show(cat => s"NAME is ${cat.name} AGE ${cat.age} COLOR ${cat.color}")

  println(catShow.show(Cat("cat", 200, "red")))
}

