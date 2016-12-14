package scalaforimpatient.chapter5

/**
 * Created by sunyonggang on 16/12/14.
 */
class Chapter5HomeWork02 {
  var desposit = 0
  val whthdraw = 0
}
object Chapter5HomeWork02 {
  def main(args: Array[String]) {
    val chw02 = new Chapter5HomeWork02
    println(chw02.desposit)
    chw02.desposit = 23
    println(chw02.desposit)
    println(chw02.whthdraw)
  }
}