package co.s4n.chapter1

import PrintableInstances._
import PrintableSyntax._

import com.typesafe.scalalogging.LazyLogging

object Main extends App with LazyLogging {

  val cat: String = Cat("cat", 25, "red").format
  println(cat)

}

