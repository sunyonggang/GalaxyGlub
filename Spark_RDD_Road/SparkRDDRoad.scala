package io.github.sparkrdd

import org.apache.spark.{SparkContext, SparkConf}

/**
 * Created by sunyonggang on 16/12/27.
 */
class SparkRDDRoad {

}
object SparkRDDRoad {
  def main(args: Array[String]) {
    println("hello spark rdd")

    val conf = new SparkConf().setAppName("SparkRDDRoad").setMaster("local[2]")
    val sc = new SparkContext(conf)

    // map
//    val a = sc.parallelize(List("dog", "salmon", "salmon", "rat", "elephant"), 3)
//    val b = a.map(_.length)
//    val c = a.zip(b)
//    val d = c.take(3).mkString(",")
//    println(d)

    // map partition
//    val a = sc.parallelize(1 to 10, 3)
//    val sample = a.mapPartitions(myfunc).collect().mkString(",")
//    println(sample)

    // flatmap
//    val a = sc.parallelize(List(1,2,3,4,(5,4,3)))
//    val sample = a.flatMap(a => a + "1")
//    println(sample.collect().mkString("-"))

    // map Partition with index
//    val x = sc.parallelize(1 to 10, 3)
//    val sample = x.mapPartitionsWithIndex(myfuncwithindex).collect()
//    println(sample.mkString(","))

    // mapValues
//    val a = sc.parallelize(List("aaa", "bbbb", "cccccc"))
//    val b = a.map(x => (x.length, x))
//    println(b.mapValues("x" + _ + "y").collect.mkString("---"))

    // max, min, mean
//    val a = sc.parallelize(1 to 30)
//    println(a.min)
//    println(a.max)
//    println(a.mean)

    // partitions
//    val b = sc.parallelize(List("syg", "aaaaa", "bbbbb", "gggggggggg", "rrrrrrrrrrr"), 2)
//    println(b.partitions)

    // persist cache
//    val b = sc.parallelize(List("syg", "aaaaa", "bbbbb", "gggggggggg", "rrrrrrrrrrr"), 2)
//    println(b.getStorageLevel)
//    b.cache()
//    println(b.getStorageLevel)

    // pipe
//    val a = sc.parallelize(1 to 9, 3)
//    println(a.pipe("head -n 1").collect().mkString(","))

    // randomSplit
//    val y = sc.parallelize(1 to 100)
//    val splits = y.randomSplit(Array(0.9, 0.1), seed = 11L)
//    val training = splits(0)
//    val test = splits(1)
//    println(training.collect().mkString(","))
//    println(test.collect().mkString(","))

    // reduce
//    val a = sc.parallelize(1 to 100)
//    println(a.reduce(_ + _))

    // reduceByKey
//    val a = sc.parallelize(List("dog", "cat", "cow", "fish"))
//    val b = a.map(x => (x.length, x)).reduceByKey(_ + _)
//    println(b.collect().mkString("-"))

    // repartition
//    val a = sc.parallelize(1 to 10, 3)
//    println(a.partitions.mkString("---"))
//    println(a.partitions.length)
//    val b = a.repartition(5)
//    println(b.partitions.mkString("---"))
//    println(b.partitions.length)

    // rightOuterJoin
//    val a = sc.parallelize(List("dog", "fish", "a"))
//    val b = a.keyBy(_.length)
//    println(b.collect().mkString(","))
//
//    val c = sc.parallelize(List("cow", "lion"))
//    val d = c. keyBy(_.length)
//    println(b.rightOuterJoin(d).collect().mkString("-"))

    // sample
//    val a = sc.parallelize(1 to 10000, 3)
//    println(a.sample(false, 0.1, 0).count)
//    println(a.sample(true, 0.3, 0).count)
//    println(a.sample(true, 0.3, 0).count)

    // stats
//    val a = sc.parallelize(1 to 10, 3)
//    println(a.stats)

    // sortBy
//    val y = sc.parallelize(Array(5, 3, 2, 7, 1))
//    println(y.sortBy(c => c, true).collect().mkString("-"))
//    println(y.sortBy(c => c, false).collect().mkString("-"))
//    val z = sc.parallelize(Array(("helen", 10), ("alice", 5), ("zed", 50)))
//    println(z.sortBy(c => c._1, true).collect().mkString("-"))
//    println(z.sortBy(c => c._2, true).collect().mkString("-"))

    // subtract
//    val a = sc.parallelize(1 to 9, 3)
//    val b = sc.parallelize(1 to 3, 3)
//    val c = a.subtract(b)
//    println(c.collect().mkString("-"))

    // takeSample
//    val x = sc.parallelize(1 to 1000, 3)
//    println(x.takeSample(true, 10, 1).mkString("-"))

    // top
//    val c = sc.parallelize(Array(6, 9, 10, 3))
//    println(c.top(2).mkString("-"))

    // union
//    val a = sc.parallelize(1 to 3)
//    val b = sc.parallelize(5 to 7)
//    println(a.union(b).collect().mkString("-"))

    // values
//    val a = sc.parallelize(List("dog", "tiger", "cat"))
//    val b = a.keyBy(_.length)
//    println(b.collect().mkString("-"))
//    println(b.values.collect().mkString("+"))

  }

  // map Partition with index
  def myfuncwithindex(index : Int, part : Iterator[Int]) : Iterator[String] = {
    part.toList.map(x => index + "," + x).toIterator
  }

  // map partition
  def myfunc[T](iter: Iterator[T]) : Iterator[(T, T)] = {
    var res = List[(T, T)]()
    var pre = iter.next()
    while(iter.hasNext) {
      val cur = iter.next()
      res .::=  (pre, cur)
      pre = cur
    }
    res.iterator
  }
}
