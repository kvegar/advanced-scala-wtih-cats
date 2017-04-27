package co.s4n.chapter2

import com.typesafe.scalalogging.LazyLogging

/**
  * Created by karenvega on 4/26/17.
  */
object Main2 extends App with LazyLogging {

  import cats.Monoid
  import cats.instances.int._
  import cats.instances.option._
  import cats.syntax.semigroup._

  def add(items: List[Int]): Int = {
    items.foldLeft(Monoid[Int].empty)(_.combine(_))
  }

  def add(items: List[Option[Int]]): Int = {
    items.foldLeft(Monoid[Option[Int]].empty)(_.combine(_))
  }

  case class Order(totalCost: Double, quantity: Double)

  def add(items: List[Order]): Int = {
    items.foldLeft(Monoid[Order].empty)(_ + _)
  }


}
