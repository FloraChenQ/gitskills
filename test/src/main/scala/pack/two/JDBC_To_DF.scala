/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package pack.two
import java.util.Properties

import org.apache.spark.sql.types.{IntegerType, StringType, StructField, StructType}
import org.apache.spark.sql.{Row, SparkSession}


object JDBC_To_DF {
  val spark= SparkSession.builder().master("local").getOrCreate()
  def main(args: Array[String]): Unit = {

//    val jdbcDF = spark.read.format("jdbc").option("url", "jdbc:mysql://hm-data-innerdb.cavesgymhprc.rds.cn-north-1.amazonaws.com.cn:3306/skyfox_bi")  //*****这是数据库名
//      .option("driver", "com.mysql.jdbc.Driver").option("dbtable", "test_videoplay_all")//*****是表名
//      .option("user", "hmdata").option("password", "VuifWodAcBuhoa4").load()
//    jdbcDF.show()

    val studentRDD=spark.sparkContext.parallelize(Array("3 小翠 G 27","4 小狗蛋 B 50"))
      .map(x=>x.split(" "))
    val ROWRDD=studentRDD.map(x=>Row(x(0).toInt,x(1).trim,x(2).trim,x(3).toInt))
    ROWRDD.foreach(print)
    //设置模式信息
    val schema=StructType(List(StructField("id",IntegerType,true),StructField("name",StringType,true),StructField("gender",StringType,true),StructField("age", IntegerType, true)))

    val studentDF=spark.createDataFrame(ROWRDD,schema)

    val parameter=new Properties()
    parameter.put("user","hmdata")
    parameter.put("password","VuifWodAcBuhoa4")
    parameter.put("driver","com.mysql.jdbc.Driver")
    studentDF.write.mode("append").jdbc("jdbc:mysql://hm-data-innerdb.cavesgymhprc.rds.cn-north-1.amazonaws.com.cn:3306/skyfox_test","test_user",parameter) //******"是数据库名，/*/*/*/*/*表名
//    jdbcDF.show()
  }
}