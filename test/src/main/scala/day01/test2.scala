/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package day01

import org.apache.spark.rdd.RDD

object test2 {
  def main(args: Array[String]): Unit = {
    import org.apache.spark.sql.SparkSession
    val spark = SparkSession.builder()
      .master("local")
      .appName(this.getClass.getSimpleName)
      .getOrCreate()

    val rdd1: RDD[Int] = spark.sparkContext.parallelize(Array(7,2,1,5,6,7))
    val rdd2: RDD[Int] = spark.sparkContext.parallelize(Array(4,2,3,8,6))



//    val intToLong: collection.Map[Int, Long] = rdd1.countByValue()
//    for(map <- intToLong){
//      println("key:"+map._1+",value:"+map._2)
//    }

//    val ints = rdd1.takeOrdered(2)( new MyOder)
//    printArray(ints)

//    //去重  //1,6,7,5,2
//    println("distinct:")
//    rdd1.distinct().foreach(println(_))
//    //取交集 6,2
//    println("intersection:")
//    rdd1.intersection(rdd2).foreach(println(_))
//    //取并集  7,2,1,5,6,7,4,2,3,8,6
//    println("union:")
//    rdd1.union(rdd2).foreach(println(_))
//    //只存在rdd1中，不存在于rdd2    1,5,7,7
//    println("subtract:")
//    rdd1.subtract(rdd2).foreach(println(_))
//    println("fold")
//    val i = rdd1.fold(0)(_+_)
//    println(i)

//    val tuple = rdd1.aggregate((0, 0))(
//      (acc, value) => (acc._1 + value, acc._2 + 1),
//      (x, y) => (x._1 + y._1, x._2 + y._2))
//    val avg = tuple._1/tuple._2
//    println(avg)

    //    val ints: Array[Int] = rdd1.takeSample(false,2)
    //    for(i <- ints) println(i)
//        val d: Double = rdd1.variance()
//    val d1: Double = rdd1.mean()
//    println(d+","+d1)





  }

  def printArray (arr: Array[Int]){
    for(i <- arr) println(i)
  }

}
class MyOder extends Ordering[Int]{
  override def compare(x: Int, y: Int): Int = x - y
}