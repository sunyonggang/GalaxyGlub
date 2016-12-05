package scalaforimpatient.chapter2

import scala.math._
/**
 * Created by sunyonggang on 16/11/29.
 */
class Chapter2 {

}
object Chapter2 {
  def Signum(num : Int) : Int = {
    if (num > 0) 1 else if (num < 0) -1 else 0
  }

  def CountDown(num : Int) : Unit = {
//    var sum = 0
//    for (i <- Range(num, 0, -1)) {
//      sum += i
//    }
//    sum
    for (i <- Range(num, -1, -1)) {
      print(i + " ")
    }
  }

  def UnicodeCount(s : String) : BigInt = {
    var b : BigInt = 1
    for (str <- s) {
      b *= str.toInt
//      println(b)
    }

    b
  }

  def product(s : String) : BigInt = {
//    var n : BigInt = 1
    if (s.size == 1) {
//      println(s.toInt)
      s(0).toInt
    } else {
      s(0).toInt * product(s.substring(1))
    }

  }

  def xn(x : Int, n : Int) : Double = {
    if (n >0 && n % 2 == 0) {
      pow(x, n)
    } else if (n > 0 && n % 2 == 1) {
      pow(x, n-1) * x
    } else if (n == 0) {
      1
    } else {
      1 / xn(x, -n)
    }
  }

  def main(args: Array[String]) {
    println(Signum(12))
    println(Signum(-12))
    println(Signum(0))
    val a = {}
    println("{} is: " + a)
    println(a.getClass)

    for (i <- Range(10, -1, -1)) {
      println(i)
    }

//    println(CountDown(10))
    CountDown(10)

    val uc = UnicodeCount("Hello")
    println(uc)
    var c : BigInt= 1
    val d = "Hello".toIterator
    while(d.hasNext) {
      c *= d.next().toInt
    }
    println("c is: " + c)


    println("product: " + product("Hello"))

    println("xn: " + xn(2,-3))
  }

}
