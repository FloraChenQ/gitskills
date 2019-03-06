/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package com.kangaroo.studio.algorithms.filter;


import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
//import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.SaveMode;
import org.apache.spark.sql.hive.HiveContext;

import java.io.Serializable;
import java.util.Properties;


public class LoadDB implements Serializable {

  private SparkConf sparkConf;
  private JavaSparkContext javaSparkContext;
  private HiveContext hiveContext;
  private SQLContext sqlContext;

  /*
   *   初始化Load
   *   创建sparkContext, sqlContext, hiveContext
   * */
  public LoadDB() {
    initSparckContext();
    initSQLContext();
    initHiveContext();
  }

  /*
   *   创建sparkContext
   * */
  private void initSparckContext() {
    String warehouseLocation = System.getProperty("user.dir");
    sparkConf = new SparkConf()
        .setAppName("from-to-mysql")
        .set("spark.sql.warehouse.dir", warehouseLocation)
        .setMaster("yarn-client");
    javaSparkContext = new JavaSparkContext(sparkConf);
  }

  /*
   *   创建hiveContext
   *   用于读取Hive中的数据
   * */
  private void initHiveContext() {
    hiveContext = new HiveContext(javaSparkContext);
  }

  /*
   *   创建sqlContext
   *   用于读写MySQL中的数据
   * */
  private void initSQLContext() {
    sqlContext = new SQLContext(javaSparkContext);
  }

  /*
   *   使用spark-sql从hive中读取数据, 然后写入mysql对应表.
   * */
  public void hive2db() {
    String url = "jdbc:mysql://hm-data-innerdb.cavesgymhprc.rds.cn-north-1.amazonaws.com.cn";
    String table = "test_videoplay_all";
    Properties props = new Properties();
    props.put("user", "hmdata");
    props.put("password", "VuifWodAcBuhoa4");
    String query = "select * from gulfstream_test.accounts where year=2017 and month=10 and day=23";
    Dataset<Row> rows = hiveContext.sql(query).select("id", "order_id", "status", "count");
    rows.write().mode(SaveMode.Append).jdbc(url, table, props);
  }

  /*
   *   使用spark-sql从db中读取数据, 处理后再回写到db
   * */
  public void db2db() {
    String url = "jdbc:mysql://hm-data-innerdb.cavesgymhprc.rds.cn-north-1.amazonaws.com.cn";
    String fromTable = "test_videoplay_all";
    String toTable = "test_videoplay_all";
    Properties props = new Properties();
    props.put("user", "hmdata");
    props.put("password", "VuifWodAcBuhoa4");
    Dataset<Row> rows = sqlContext.read().jdbc(url, fromTable, props).where("count < 1000");
    rows.write().mode(SaveMode.Append).jdbc(url, toTable, props);
  }


  public static void main(String[] args) {
    LoadDB loadDB = new LoadDB();
//    System.out.println(" ---------------------- start hive2db ------------------------");
//    loadDB.hive2db();
//    System.out.println(" ---------------------- finish hive2db ------------------------");
    System.out.println(" ---------------------- start db2db ------------------------");
    loadDB.db2db();
    System.out.println(" ---------------------- finish db2db ------------------------");
  }
}