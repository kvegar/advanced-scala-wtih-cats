package co.s4n.chapter1

import PrintableInstances._
import PrintableSyntax._
import JsonWriterInstances._
import JsonSyntax._

import com.typesafe.scalalogging.LazyLogging

object Main extends App with LazyLogging {



  val cat: String = Cat("cat", 25, "red").formatKaren
  println(cat)

  Person("Dave", "dave@example.com").toJson
}

