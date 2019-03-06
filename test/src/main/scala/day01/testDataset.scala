/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package day01

import org.apache.spark.sql.Dataset

object testDataset {
  def main(args: Array[String]): Unit = {
    import org.apache.spark.sql.SparkSession
    val spark = SparkSession.builder()
      .master("local")
      .appName(this.getClass.getSimpleName)
      .getOrCreate()
    import spark.implicits._
    val persons = Seq[Person](Person("lily",22),Person("Sherry",12),Person("Alex",25),Person("lily",22))
    val peopleDs = spark.sparkContext.parallelize(persons).toDS()
    val fields = Array("name","age")
    val value: Dataset[((String, String), Long)] = peopleDs.flatMap(ds => fields.zip(Array(ds.name, ds.age.toString)))
      .map(x => (x, 1L))





  }
}

case class Person (name: String, age:Int)
