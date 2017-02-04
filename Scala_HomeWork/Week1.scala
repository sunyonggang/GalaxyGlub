package homework

import scala.collection.mutable

/**
 * Created by sunyonggang on 17/2/4.
 */
class Week1 {

}
object Week1 {
  def main(args: Array[String]) {
    println(signum(2))
    println(signum(-2))
    println(signum(0))
    loopDesc(10)
    val arr = Array[Integer](1,2,3,4,5)
    val myarr = changePosition(arr)
    println(myarr.mkString("-"))
    val message = "i really like you, yopu can't change me under the beast of the end, you are done"
    println(countWord(message).mkString("", "->", "."))
  }

  // question 1
  def signum(sign : Int) : Int = {
    if (sign > 0) 1
    else if (sign == 0) 0
    else -1
  }
  // question 2,3
  def loopDesc(max : Integer): Unit = {
    val loop = Range(max, -1, -1)
    for(i <- loop) {
      println(i)
    }
  }
  // question 4
  def changePosition(arr : Array[Integer]) : Array[Integer] = {
    val myarr = scala.collection.mutable.ArrayBuffer[Integer]()
//    myarr += 123
    for (i <- Range(1, arr.length) if (i + 1) % 2 == 0) {
      myarr += arr(i)
      myarr += arr(i - 1)
//      myarr :+ arr(i) :+ arr(i - 1)
    }
    if (myarr.length != arr.length) {
      myarr += arr(arr.length - 1)
    }
//    myarr +=

    myarr.toArray
  }
  // question 5
  def countWord(message : String) : Map[String, Int] = {
    val map = scala.collection.mutable.HashMap[String, Int]()
    val wordArray = message.split(" ")
    for (word <- wordArray) {
      if (map.contains(word)) {
        map(word)  += 1
      } else {
        map(word) = 1
      }
    }
    map.toMap
  }

}
