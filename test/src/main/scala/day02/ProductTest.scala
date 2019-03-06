/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package day02

object ProductTest extends App {
  def product(x:Double)(y:Double)=x*y
  val p1=product(3.0) _
  private val value: Any = p1(4)
  println(value)


}
