package co.s4n.chapter2

import com.typesafe.scalalogging.LazyLogging

object Main extends App with LazyLogging {

  implicit val and = new Monoid[Boolean] {
    override def combine(x: Boolean, y: Boolean) = x && y
    override def empty = true
  }

  implicit val or = new Monoid[Boolean] {
    override def combine(x: Boolean, y: Boolean) = x || y
    override def empty = false
  }

  implicit val equal = new Monoid[Boolean] {
    override def combine(x: Boolean, y: Boolean) = x == y
    override def empty = true
  }

  implicit val notEqual = new Monoid[Boolean] {
    override def combine(x: Boolean, y: Boolean) = x != y
    override def empty = false
  }

  print()

}