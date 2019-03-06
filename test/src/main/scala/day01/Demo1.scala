/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package day01

object Demo1 {
  def main(args: Array[String]): Unit = {
    import org.apache.spark.sql.SparkSession

    val spark = SparkSession
      .builder()
      .master("local")
      .appName("Spark SQL basic example")
      .getOrCreate()

// For implicit conversions like converting RDDs to DataFrames
    import spark.implicits._
    var df=spark.sparkContext.textFile("/home/flora/opt/spark-2.1.1-bin-hadoop2.7/examples/src/main/resources/people.json")
//    val df = spark.read.json("file://home/flora/opt/spark-2.1.1-bin-hadoop2.7/examples/src/main/resources/people.json")

// Displays the content of the DataFrame to stdout
//    df.show()
    df.collect().foreach(print _)
  }
}
