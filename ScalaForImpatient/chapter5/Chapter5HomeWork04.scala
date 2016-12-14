package scalaforimpatient.chapter5

/**
  * Created by sunyonggang on 16/12/14.
  */
class Chapter5HomeWork04(hrs : String, min : String) {
   val hours = hrs
   val minutes = min
   def before(other : Chapter5HomeWork04): Boolean = {
     println("a1: " + hours.toInt * 60 + minutes.toInt + " a2: " + other.hours.toInt * 60 + other.minutes.toInt)
     if ((hours.toInt * 60 + minutes.toInt).compareTo(other.hours.toInt * 60 + other.minutes.toInt) == -1) true else false
   }
 }

object Chapter5HomeWork04 {
  def main(args: Array[String]) {
    val a1 = new Chapter5HomeWork04("12", "08")
    val a2 = new Chapter5HomeWork04("12", "09")
    println(a1.before(a2))
  }
}
