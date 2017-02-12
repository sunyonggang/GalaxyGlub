package homework.week2

/**
 * Created by sunyonggang on 17/2/12.
 */

class BankAccount {

  private var money = 0
  def balance = money
  def deposit(m : Int) = {
    money += m
    println("deposit money: " + money)
  }

  def withdraw(m : Int) = {
    money -= m
    println("withdraw this action")
  }

}

class Person(var name : String) {
  val firstName = name.split(" ")(0)
  val lastName = name.split(" ")(1)
}

class Point(val a : Int, val b : Int) {
  def sayA(): Unit = {
    println(a)
  }
  def sayB() = {
    println(b)
  }
}

object Point {
  def apply(a : Int, b : Int): Point = {
    new Point(a, b)
  }
}

trait Shape {
  def centerPoint : Int
}

class Rectangle extends Shape {
  @Override
  def centerPoint: Int = {
    3
  }
}
class Circle extends Shape {
  @Override
  def centerPoint : Int = {
    4
  }
}

class Week2 {

}
object Week2 {
  def main(args: Array[String]) {
    val ba = new BankAccount()
    ba.deposit(100)
    ba.withdraw(10)
    println(ba.balance)
    val p1 = new Person("Yonggang Sun")
    println(p1.firstName + " " + p1.lastName)
    val point = Point(3, 4)
    point.sayA
    point.sayB()
    val r = new Rectangle()
    val c = new Circle()
    println(r.centerPoint)
    println(c.centerPoint)
  }
}
