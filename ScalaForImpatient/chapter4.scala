package scalaforimpatient.chapter4

import java.awt.Font
import java.util
import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.JavaConversions.mapAsJavaMap
import java.awt.font.TextAttribute._

/**
 * Created by sunyonggang on 16/12/9.
 */
class Chapter4 {

}
object Chapter4 {
  def main(args: Array[String]) {
    var a = Map("jack" -> 23, "mary" -> 32, "tyler" -> 33)
    println(a)
    println(a("jack"))
    println(a.getOrElse("jack1", 123))

    val b = Map(("jack", 23), ("mary", 32), ("tyler", 33))
    println(b)
    println(b("jack"))
    println(b.getOrElse("jack1", 123))
    val c = a + ("j" -> 12)
    println(c)
    val d = a - "jack"
    println(d)
    a -= "jack"
    println(a)
    val kSet = a.keySet
    println(kSet.last)
    val values = a.values
    for (v <- values) println(v)
    val treeMap = new util.TreeMap[String, Int]()
    treeMap.put("jackkk", 23)
    treeMap.put("jackkk2", 33)
    treeMap.put("jackkk3", 43)
    val score : scala.collection.mutable.Map[String, Int] = treeMap
    println(score)
    val attribute = Map(FAMILY -> "Serif", SIZE -> 12)
    val font = new Font(attribute)
    println(font)

    val symbol = Array("<", "-", ">")
    val counts = Array(2, 5, 2)
    val scArray = symbol.zip(counts)
    for ((k, v) <- scArray) println(k * v)
    val scMap = scArray.toMap
    println(scMap)
  }
}
