/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package day01

object base {
  def main(args: Array[String]): Unit = {
    import org.apache.spark.sql.SparkSession
    val spark = SparkSession.builder()
      .master("local")
      .appName(this.getClass.getSimpleName)
      .getOrCreate()

    val rdd = spark.sparkContext.textFile("/home/flora/opt/spark-2.1.1-bin-hadoop2.7/examples/src/main/resources/kv1.txt")
    rdd.collect().foreach(println _)
  }

}
