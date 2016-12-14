package scalaforimpatient.chapter5

import scala.collection.mutable.ArrayBuffer
import scala.reflect.BeanProperty
/**
 * Created by sunyonggang on 16/12/13.
 */
class Chapter5 {

}
object Chapter5 {
  def main(args: Array[String]) {
    val c = new Count
    println(c.increment())
    println(c.current)
//    println(c.value)

//    val p = new Person
//    p.age = 33
//    println(p.age)
    val pn = new Personn
    println(pn.getName)
    pn.setName("kkkk")
    println(pn.getName)
    println(pn.name)
    val pnn1 = new Personnn()
    val pnn2 = new Personnn("hello")
    val pnn3 = new Personnn("sun", 25)
    println(pnn1.name)
    println(pnn2.name)
    println(pnn3.name)
  }
}

class Count {
  private var value = 0;
  def increment(): Int = {
    value + 1
  }
  def current() = value
//  println(c.value)
}

//class Person {
//  private var priAge = 0
//  def age = priAge
//  def age_ = (newValue : Int) {
//    if (newValue > priAge) priAge = newValue
//  }
//}
class Personn {
  @BeanProperty var name : String = "hello"
}

class Personnn {
  println("i am one")
  var name = ""
  private var age = 0

  def this(name : String) {
    this()
    this.name = name
  }

  def this(name : String, age : Int) {
    this()
    this.name = name
    this.age = age
  }
}

class Network {
  class Member(val name : String) {
    val contacts = new ArrayBuffer[Member]
  }
  private val members = new ArrayBuffer[Member]()
  def join(name : String): Unit = {
    val m = new Member(name)
    members += m
    m
  }
}