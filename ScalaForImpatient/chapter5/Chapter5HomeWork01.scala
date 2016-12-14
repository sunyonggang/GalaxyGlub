package scalaforimpatient.chapter5

/**
 * Created by sunyonggang on 16/12/14.
 */
class Chapter5HomeWork01 {
  private var value = 0
  def increment() = {
    value += 1000000000
    if (value < 0) {
      value = Int.MaxValue
    }
  }
  def current = value
}
object Chapter5HomeWork01 {
  def main(args: Array[String]) {
    val chw01 = new Chapter5HomeWork01
    val bi  = 10000000
    for (i <- 0 to 7) {
      println(chw01.value)
      chw01.increment()
    }
    println(Int.MaxValue)

  }
}
