package scalaforimpatient.chapter4

import java.io.File
import java.util.Scanner

import scala.collection.immutable.TreeMap
import scala.collection.{SortedMap, mutable}

/**
 * Created by sunyonggang on 16/12/12.
 */
class Chapter4HomeWork {

}

object KeyOrderDESC extends Ordering[String] {
  def compare(a : String, b : String) = b.compare(a)
}

object Chapter4HomeWork {
  def main(args: Array[String]) {
    question1()
    question2("myfile.txt")
    question3("myfile.txt")
    question4("myfile.txt")
    question44()
    question5()
    question6()
    question7(Array(3, 4, 6, 9, 90, 0))
    question8(Array(3, 4, 6, 9, 90, 0), 80)
    println("hello".zip("world").toMap.toArray.mkString(","))
  }

  def question1(): Unit = {
    val equipments = Map("pobai" -> 3200, "wujin" -> 3800, "duolanzhiren" -> 450)
    val equipmentNew = scala.collection.mutable.Map[String, Double]()
    //    equipmentNew = for ((key, _) <- equipments) yield (key, equipments(key) * 0.9)
    val keySet = equipments.keySet
    for (key <- keySet) {
      equipmentNew.put(key, equipments(key) * 0.9)
    }
    println(equipmentNew)
  }

  def question2(filename : String) = {
    val hm = new mutable.HashMap[String, Int]()
    val in = new Scanner(new File(filename))
    while(in.hasNext) {
      val element = in.next()
      if (hm.contains(element)) {
        hm.put(element, hm(element) + 1)
      } else {
        hm.put(element, 1)
      }
    }

    println(hm)
  }

  def question3(filename : String) = {
    var hm = new scala.collection.immutable.HashMap[String, Int]
    val in = new Scanner(new File(filename))
    while(in.hasNext) {
      val element = in.next()
      hm += (element -> (hm.getOrElse(element, 0) + 1))
    }

    println(hm)
  }

  def question4(filename : String) = {
    var tm = new TreeMap[String, Int] {}
    val in = new Scanner(new File(filename))
    while(in.hasNext) {
      val element = in.next()
      tm += (element -> (tm.getOrElse(element, 0) + 1))
    }
    println(tm)
  }

  def question44() = {
//    var tm = new TreeMap[String, Int] {}
//    val in = new Scanner(new File(filename))
//    while(in.hasNext) {
//      val element = in.next()
//      tm += (element -> (tm.getOrElse(element, 0) + 1))
//    }
//
//    println(tm)
    val tm1 = TreeMap( "a" -> 1, "bc" -> 2, "def" -> 3 )( KeyOrderDESC )
    println(tm1)
  }

  def question5() = {
    val linkedHM = new scala.collection.mutable.LinkedHashMap[String, Int]()
    linkedHM.put("Monday", java.util.Calendar.MONDAY);
    linkedHM.put("Tuesday", java.util.Calendar.TUESDAY);
    linkedHM.put("Wednesday", java.util.Calendar.WEDNESDAY);
    linkedHM.put("Thursday", java.util.Calendar.THURSDAY);
    println(linkedHM)
  }

  def question6() = {
    val env = System.getenv()
    val keySet = env.keySet()
    val iterator = keySet.iterator()
    while (iterator.hasNext) {
      val key = iterator.next()
      println(key + " : " + env.get(key))
    }
    val vm = System.getProperties
    vm.list(System.out)
//    println(env)
  }

  def question7(arr : Array[Int]) = {
    val min = arr.min
    val max = arr.max
    println((min -> max))
  }

  def question8(arr : Array[Int], num : Int) = {
    var l, e, b = 0
    for (a <- arr) {
      if (a > num) {
        b += 1
      } else if (a < num) {
        l += 1
      } else {
        e += 1
      }
    }
    val t = (l, e, b)
    println(t._1 + " " + t._2 + " " + t._3)
  }
}
