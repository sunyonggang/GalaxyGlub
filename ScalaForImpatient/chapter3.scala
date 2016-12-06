package scalaforimpatient.chapter2

import  scala.collection.JavaConversions.bufferAsJavaList
/**
 * Created by sunyonggang on 16/12/1.
 */
class Chapter3 {

}
object Chapter3 {
  def main(args: Array[String]) {
    val ab = scala.collection.mutable.ArrayBuffer[Int]()
    ab += (1,2,3,4)
    ab ++= Array(5,6,7,9)
    val ba = for (i <- ab if i % 2 == 0) yield i * 3
    println(ba.toArray.mkString(","))
    println("****************")
    val ba2 = ab.filter(_ % 2 ==0).map(_ * 3)
    println(ba2.toArray.mkString("-"))

    val a = scala.collection.mutable.ArrayBuffer(-1, 1, 2, 3, -2, 2, 3, -5)
//    val ab2 = scala.collection.mutable.ArrayBuffer[Int]()
//    var flag = false
//    for (i <- a) {
//      if (!flag || i >= 0) {
//        ab2 += i
//      }
//      if (i < 0) {
//        flag = true
//      }
//    }
//    println(ab2.toArray.mkString(","))
    var flag = true
    val index = for (i <- 0 until a.length if flag || a(i) > 0) yield {
      if (a(i) < 0) flag = false
      i
    }
    for (i <- 0 until index.length) a(i) = a(index(i))
    a.trimEnd(a.length - index.length)
    println(a.toArray.mkString(","))
    println(a.toString())

    val arr = Array(1, 7, 9,2)
    println("max: " + arr.max + " sum: " + arr.sum + " sorted: " + arr.sorted.mkString(","))
    val matrix = Array.ofDim[Int](2,3)
    matrix(0)(0) = 1
    matrix(1)(2) = 4
    println(matrix(0).mkString(","))
    println(matrix(1).mkString(","))

    val aA = scala.collection.mutable.ArrayBuffer("aaa", "bbb", "/cd/edd")
    val pb = new ProcessBuilder(aA)


  }
}
