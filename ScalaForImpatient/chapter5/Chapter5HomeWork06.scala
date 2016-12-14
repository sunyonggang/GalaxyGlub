package scalaforimpatient.chapter5

import java.lang.Void

/**
 * Created by sunyonggang on 16/12/14.
 */
class Chapter5HomeWork06(var age : Int = 0) {
  if (age < 0) age = 0
}
object Chapter5HomeWork06 {
  def main(args: Array[String]) {
    val chw061 = new Chapter5HomeWork06(54)
    println(chw061.age)
    val chw062 = new Chapter5HomeWork06(-54)
    println(chw062.age)
  }
}
