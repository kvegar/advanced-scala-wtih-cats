package co.s4n.chapter4

import org.scalatest.FunSuite

class IDMonadTest extends FunSuite {

  IDMonad.pure(1123)
  IDMonad.map(1123)
  IDMonad.flatMap(1123)

}
