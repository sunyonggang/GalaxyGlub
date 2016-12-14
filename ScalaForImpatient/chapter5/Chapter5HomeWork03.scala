package scalaforimpatient.chapter5

/**
 * Created by sunyonggang on 16/12/14.
 */
class Chapter5HomeWork03(hrs : String, min : String) {
  val hours = hrs
  val minutes = min
  def before(other : Chapter5HomeWork03): Boolean = {
    if ((hours + minutes).compareTo(other.hours + other.minutes) == -1) true else false
  }
}
object Chapter5HomeWork03 {
  def main(args: Array[String]) {
    val a1 = new Chapter5HomeWork03("12", "08")
    val a2 = new Chapter5HomeWork03("12", "09")
    println(a1.before(a2))
  }
}
