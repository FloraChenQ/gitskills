/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package day02

object ImplictTest extends App {

//  import scala.language.implicitConversions

  trait Multiplicable[T] {
    def multiply(x: T): T
  }

  implicit object MultiplicableInt extends Multiplicable[Int] {
    def multiply(x: Int): Int = x * x
  }

  implicit object MultiplicableString extends Multiplicable[String] {
    def multiply(x: String): String = x * 3
  }

//  def multiply[T: Multiplicable](x: T): T = {
//    val ev = implicitly[Multiplicable[T]]
//    ev.multiply(x)
//  }

  def multiply[T: Multiplicable](x: T)(implicit ev: Multiplicable[T]): T ={
    //根据具体的类型调用相应的隐式对象中的方法
    ev.multiply(x)
  }

  println(multiply(5))
  println(multiply("5"))
}