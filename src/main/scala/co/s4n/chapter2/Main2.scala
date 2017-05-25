//package co.s4n.chapter2
//
//import com.typesafe.scalalogging.LazyLogging
//
///**
// * Created by karenvega on 4/26/17.
// */
//trait Other
//trait Order
//trait Active extends Order
//
//object Main2 extends App with LazyLogging {
//
//  case class OO[A]()
//  case class OOP[+A]()
//  case class OOO[-A]()
//
//  val t1: OO[Other] = OO[Other]
//  val t2: OOP[Active] = OOP[Active]
//  val t3: OOO[Order] = OOO[Order]
//
//  import cats.instances.int._
//  import cats.instances.double._
//  import cats.instances.option._
//  import cats.syntax.semigroup._
//
//  def addInt(items: List[Int]): Int = {
//    items.foldLeft(cats.Monoid[Int].empty)(_.combine(_))
//  }
//
//  def addOption(items: List[Option[Int]]): Option[Int] = {
//    items.foldLeft(cats.Monoid[Option[Int]].empty)(_.combine(_))
//  }
//
//  implicit val orderInstance = new cats.Monoid[Order] {
//    override def combine(x: Order, y: Order) = {
//      Order(x.totalCost.combine(y.totalCost), y.quantity.combine(y.quantity))
//    }
//    override def empty = Order(0, 0)
//  }
//
//  def addOrder(items: List[Order]): Order = {
//    items.foldLeft(cats.Monoid[Order].empty)(_.combine(_))
//  }
//
//}
//
