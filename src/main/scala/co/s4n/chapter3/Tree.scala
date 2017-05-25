package co.s4n.chapter3

import cats.Functor

/**
 * Created by karen on 18/05/17.
 */
sealed trait Tree[+A]
final case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]
final case class Leaf[A](value: A) extends Tree[A]

object Tree {

  def branch[A](left: Tree[A], right: Tree[A]): Tree[A] =
    Branch(left, right)

  def leaf[A](value: A): Tree[A] =
    Leaf(value)

  implicit val treeFunctor = new Functor[Tree] {
    def map[A, B](value: Tree[A])(func: A => B): Tree[B] = value match {
      case Branch(left, right) => Branch(map(left)(func), map(right)(func))
      case Leaf(value) => Leaf(func(value))
    }
  }
}