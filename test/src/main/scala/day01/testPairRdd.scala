/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package day01

import org.apache.spark.rdd.RDD

object testPairRdd {
  def main(args: Array[String]): Unit = {

    import org.apache.spark.sql.SparkSession
    val spark = SparkSession.builder()
      .master("local")
      .appName(this.getClass.getSimpleName)
      .getOrCreate()

    val rdd = spark.sparkContext.parallelize(Seq(1,2,1,3,4,2,4,5,7))
    val pair: RDD[(Int, Int)] = spark.sparkContext.parallelize(Seq((1,2),(3,4),(3,6)))
    val other: RDD[(Int, Int)] = spark.sparkContext.parallelize(Seq((3,9)))
    println("pair====")
    pair.foreach(println(_))
    println("other===")
    other.foreach(println(_))

    val unit: RDD[(Int, (Int, Int))] = pair.combineByKey(
      (v) => (v, 1),
      (acc:(Int,Int), v) => (acc._1 + v, acc._2 + 1),  //acc是累加器的意思
      ((acc1, acc2) => (acc1._1 + acc2._1, acc1._2 + acc2._2))
    )
    val result: RDD[(Int, Float)] = unit.map{ case (key,value) => (key, value._1 / value._2.toFloat)}
    result.collectAsMap().map(println(_))

//    println("cogroup===")
//    val unit: RDD[(Int, (Iterable[Int], Iterable[Int]))] = pair.cogroup(other)
//    unit.foreach(x =>{
//      val it1: Iterable[Int] = x._2._1
//      val it2: Iterable[Int] = x._2._2
//      for(i <- it1.seq){
//        println("it1:"+x._1+"-"+i) //it1中存放pair中key对应的value
//      }
//      for(i <- it2.seq){
//        println("it2:"+x._1+"-"+i)//it2中存放other中key对应的value
//      }
//    })


//    println("rightOuterJoin====")
//    val unit1: RDD[(Int, (Option[Int], Int))] = pair.rightOuterJoin(other)
//    unit1.foreach(println(_))
//    println("leftOuterJoin====")
//    val unit2: RDD[(Int, (Int, Option[Int]))] = pair.leftOuterJoin(other)
//    unit2.foreach(println(_))

//    println("subtractByKey=======")
//    val unit: RDD[(Int, Int)] = pair.subtractByKey(other)
//    unit.foreach(println(_))

//    println("mapValues============")
//    val unit: RDD[(Int, Int)] = pair.mapValues(x => x+1)
//    unit.foreach(println(_))

//    println("flatMapValues=================通常用于符号化")
//    val unit: RDD[(Int, Int)] = pair.flatMapValues( x => x to 5)
//    unit.foreach(println(_))

//    println("keys,values,sortByKey======")
//    val keys: RDD[Int] = pair.keys
//    val values: RDD[Int] = pair.values
//    val unit: RDD[(Int, Int)] = pair.sortByKey(false)
//    keys.foreach(x => println("key:"+x))
//    values.foreach(x => println("value:"+x))
//    unit.foreach(println(_)) //只根据key排序  （3,4）（3,6）（1,2）




  }


}
