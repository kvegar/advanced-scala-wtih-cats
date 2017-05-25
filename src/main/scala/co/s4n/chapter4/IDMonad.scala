package co.s4n.chapter4

import cats.Id
/**
  * Created by karen on 25/05/17.
  */
object IDMonad extends MyMonad[Id] {

  def pure[A](value: A): Id[A] =
    value

  override def map[A, B](value: Id[A])(func: A => B): Id[B] =
    func(value)

  def flatMap[A, B](value: Id[A])(func: A => Id[B]): Id[B] =
    func(value)

}
