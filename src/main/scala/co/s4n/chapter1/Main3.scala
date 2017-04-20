package co.s4n.chapter1

import cats.instances.string._
import cats.instances.int._
import cats.instances.option._
import cats.syntax.eq._
import cats.Eq

import com.typesafe.scalalogging.LazyLogging

object Main3 extends App with LazyLogging {

  implicit val catEqual = Eq.instance[Cat] { (cat1, cat2) =>
    cat1.name === cat2.name && cat1.age === cat2.age && cat1.color === cat2.color
  }

  val cat1 = Cat("Garfield", 35, "orange and black")
  val cat2 = Cat("Heathcliff", 30, "orange and black")
  println(cat1 === cat2)

  val optionCat1 = Option(cat1)
  val optionCat2 = Option.empty[Cat]
  println(optionCat1 =!= optionCat2)

  val cate1 = Cat("Garfield", 35, "orange and black")
  val cate2 = Cat("Garfield", 35, "orange and black")
  println(cate1 === cate2)
}

