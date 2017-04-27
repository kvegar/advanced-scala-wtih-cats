package co.s4n.chapter2


trait Semigroup[A] {
  def combine(x: A, y: A): A
}

trait Monoid[A] extends Semigroup[A] {
  def empty: A
}

object Monoid {
  def apply[A](implicit monoid: Monoid[A]) = monoid
}

object K {
  val and = new Monoid[Boolean] {
    override def combine(x: Boolean, y: Boolean) = x && y
    override def empty = true
  }

  val or = new Monoid[Boolean] {
    override def combine(x: Boolean, y: Boolean) = x || y
    override def empty = false
  }

  val equal = new Monoid[Boolean] {
    override def combine(x: Boolean, y: Boolean) = x == y
    override def empty = true
  }

  val notEqual = new Monoid[Boolean] {
    override def combine(x: Boolean, y: Boolean) = x != y
    override def empty = false
  }
}