package scalaforimpatient.chapter7

/**
 * Created by sunyonggang on 17/1/3.
 */
class Chapter7Homework03 {

}
object Chapter7Homework03 {
  def main(args: Array[String]) {
    val r = new Random
    r.setSeed(2)
    println(r.nextInt())
  }
}
class Random {
  var a = 1664525
  var b = 1013904223
  var n = 32
  var mseed : Int = _
  def nextInt() : Int = {
    mseed = ((mseed * a + b) % Math.pow(2, 32)).toInt
    mseed
  }
  def nextDouble() : Double = {
    (mseed * a + b) % Math.pow(2, 32)
  }
  def setSeed(seed : Int) = {
    mseed = seed
  }
}