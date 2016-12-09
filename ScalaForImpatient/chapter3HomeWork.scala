package scalaforimpatient.chapter3

import scala.util.Random

/**
 * Created by sunyonggang on 16/12/9.
 */
class Chapter3HomeWork {

}
object Chapter3HomeWork {
  def main(args: Array[String]) {
    question1
    question2(Array(1,2,3,4,5))
    question3(Array(1,2,3,4,5,6))
    question4(Array(-1,-2,-3,-4,-5,-6,0,1,2,3,4,5,6))
    question5(Array(0,1,2,3,4,5,6))
    val ab = scala.collection.mutable.ArrayBuffer(0,1,2,3,4,5,6)
    question6(ab)
    question7(Array(1,2,3,4,5,6, 1,2,3,4,5,6, 1,2,3,4,5,6))
    question8(Array(0, -1,-2,-3,-4,-5,-6,0,1,2,3,4,5,6))
    question9()
  }
  def question1() = {
    val ab = scala.collection.mutable.ArrayBuffer[Int]()
    for (i <- 0 until 10) {
      ab += Random.nextInt(10)
    }
    println(ab.toArray.mkString(","))
  }
  def question2(arr : Array[Int]) = {
    val ab = scala.collection.mutable.ArrayBuffer[Int]()
//    val flag = if (arr.length % 2 == 0) true else false
//    for (i <- Range(1, arr.length, 2)) {
//      ab += arr(i)
//      ab += arr(i - 1)
//    }
//    if (!flag) ab += arr(arr.length - 1)
//    println(ab.toArray.mkString(","))
    for (i <- Range(1, arr.length, 2)) {
      val temp = arr(i)
      arr(i) = arr(i - 1)
      arr(i - 1) = temp
    }
    println(arr.mkString(","))
  }

  // 这边还是有问题，假如数组是偶数个，没问题，但基数个的话，需要处理最后一个元素的问题
  def question3(arr : Array[Int]) = {
    val length = if (arr.length % 2 == 0) arr.length else arr.length - 1
    val k = for (i <- 0 until length) yield {
      if (i % 2 == 0) arr(i + 1)
      else arr(i - 1)
    }
//    if (arr.length != length)
//    println(arr.length + "   ------     " + length)
    println(k.mkString(","))
  }

  def question4(arr : Array[Int]) = {
    val indexPositive = for (i <- 0 until arr.length if arr(i) > 0) yield i
    val indexNegative = for (i <- 0 until arr.length if arr(i) <= 0) yield i
    val ab = scala.collection.mutable.ArrayBuffer[Int]()
    for (i <- indexPositive) ab += arr(i)
    for (i <- indexNegative) ab += arr(i)
    println(ab.toArray.mkString(","))
  }
  def question5(arr : Array[Double]) = {
//    var sum : Double = 0;
//    for (i <- arr) {
//      sum = sum + i
//    }
//    println(sum / arr.length)
    println(arr.sum / arr.length)
  }
  def question6(arr : scala.collection.mutable.ArrayBuffer[Int]): Unit = {
    println(arr.reverse.mkString(","))
  }
  def question7(arr : Array[Int]): Unit = {
    println(arr.distinct.mkString(","))
  }
  def question8(arr : Array[Int]) = {
    val indexNegative = for (i <- 0 until arr.length if arr(i) < 0) yield i
    val indexNegativeReverse = indexNegative.reverse.take(indexNegative.length - 1)
    println(indexNegativeReverse.mkString(","))
    val abb = arr.toBuffer
    for (i <- indexNegativeReverse) {
      abb.remove(i)
    }
    println(abb.toArray.mkString(","))
  }
  def question9() = {
    val availableIDs = java.util.TimeZone.getAvailableIDs()
    println(availableIDs.sorted.mkString(","))
    val removeIds = for (id <- availableIDs) yield {
      if (id.startsWith("America/")) id.substring(8)
      else id
    }
    println(removeIds.sorted.mkString(","))
  }
}
