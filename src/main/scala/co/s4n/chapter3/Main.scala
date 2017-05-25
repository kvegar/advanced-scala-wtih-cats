package co.s4n.chapter3

import com.typesafe.scalalogging.LazyLogging

import PrintableChapter3Instances._
import PrintableChapter3Syntax._
import Codec._

/**
 * Created by karen on 18/05/17.
 */
object Main extends App with LazyLogging {

  println("hello".format())
  println(format(true))
  println(format(Box("hello world")))
  println(format(Box(true)))

  println(encode(Box(123)))
  println(decode[Box[Int]]("123"))

}
