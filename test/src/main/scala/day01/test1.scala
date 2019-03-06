/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package day01

import org.apache.spark.sql.{DataFrame, Dataset, KeyValueGroupedDataset}

object test1 {
  def main(args: Array[String]): Unit = {
    import org.apache.spark.sql.SparkSession
    val spark = SparkSession.builder()
      .master("local")
      .appName("base")
      .getOrCreate()
    import spark.implicits._

    val MyStepDS = Seq(
      MyStepMiddle("2018-05-01", "1231231234", 2, 6000, 1, 2.0, 3.0, 4000, 800, 1200),
      MyStepMiddle("2018-05-02", "1231231234", 2, 7000, 1, 2.0, 4.0, 4000, 800, 2200),
      MyStepMiddle("2018-05-03", "1231231234", 2, 8000, 1, 4.0, 3.0, 4000, 2800, 1200),
      MyStepMiddle("2018-05-04", "1231231234", 2, 9000, 1, 5.0, 3.0, 4000, 3800, 1200),
      MyStepMiddle("2018-05-05", "1231231234", 2, 6000, 1, 2.0, 3.0, 4000, 800, 1200),
      MyStepMiddle("2018-05-01", "1231231235", 2, 6000, 1, 2.0, 3.0, 4000, 800, 1200),
      MyStepMiddle("2018-05-02", "1231231235", 2, 7000, 1, 2.0, 4.0, 4000, 800, 2200),
      MyStepMiddle("2018-05-03", "1231231235", 2, 8000, 1, 4.0, 3.0, 4000, 2800, 1200),
      MyStepMiddle("2018-05-04", "1231231235", 2, 9000, 1, 5.0, 3.0, 4000, 3800, 1200),
      MyStepMiddle("2018-05-05", "1231231235", 2, 6000, 1, 2.0, 3.0, 4000, 800, 1200)
    ).toDS()
    //    MyStepDS.show()
    val stepGroup: KeyValueGroupedDataset[(String, String), MyStepMiddle] = MyStepDS
      .groupByKey(ds => {
        val date_value = date2week(ds.date)
        (date_value, ds.userId)
      })

    val stepSum: Dataset[((String, String), MyStepMiddle)] = stepGroup.reduceGroups((x, y) => {
      val step = x.step + y.step
      val stepCnt = x.stepCnt + y.stepCnt
      MyStepMiddle(x.date, x.userId, x.version, step, stepCnt, x.emetHim, x.emetMim, x.slowWalkStep,
        x.fastWalkStep, x.runStep)
    })
    import spark.implicits._
    stepSum.map(ds => {
      val step = ds._2.step
      val cnt = ds._2.stepCnt
      println(step + "----------" + cnt)
//      val step_avg_ttl = step/cnt
      ds
    }).count()


//    val stepCount: Dataset[((String, String), Long)] = stepGroup.count()
//
//    stepSum.join(stepCount,"key")
//      .foreach(row =>{
//      val sum = row.get(1).toString.split(",")(3).toInt
//      val cnt = row.get(2).toString.toInt
//        println(sum/cnt)
//    })

//    import org.apache.spark.sql.functions._
//    stepGroup.agg(count("step"))
//    stepGroup.agg()


  }

  def date2week(date: String): String = {
    "2018-05-01"
  }

}


case class MyStepMiddle(
    date: String,
    userId: String,
    version: Int,
    step: Int,
    stepCnt: Int,
    emetHim: Double,
    emetMim: Double,
    slowWalkStep: Int,
    fastWalkStep: Int,
    runStep: Int
)


case class MyStepResult(
    datakey: String,
    time_value: String,
    create_date: String,
    step_avg_ttl: Integer,
    step_sum_ttl: Integer,
    emet_sum_md: Integer,
    estep_slow_stp_md: Integer,
    estep_fast_stp_md: Integer,
    estep_run_stp_md: Integer
)


case class MdDeviceDataMiddle(
    date: String,
    userId: String,
    version: Int,
    hrAvgAll: Int,
    hrAvgSleep: Int,
    hrAvgWake: Int,
    hrRestRate: Double,
    hrTotalBeat: Int,
    step: Int,
    emetHim: Double,
    emetMim: Double,
    slowWalkStep: Int,
    fastWalkStep: Int,
    runStep: Int,
    slpWk: Int,
    slpDp: Int,
    slpLt: Int,
    slpQuality: Double,
    slpSt: Int,
    slpEd: Int
)


case class MdDeviceDataResult(
    datakey: String,
    time_value: String,
    create_date: String,
    hr_avg_all: Integer,
    hr_avg_sleep: Integer,
    hr_avg_wake: Integer,
    hr_rest_rate: Integer,
    hr_total_beat: Integer,
    step_avg_ttl: Integer,
    step_sum_ttl: Integer,
    emet_sum_md: Integer,
    estep_slow_stp_md: Integer,
    estep_fast_stp_md: Integer,
    estep_run_stp_md: Integer,
    slp_time_md: Integer,
    slp_deep_md: Integer,
    slp_quality_md: Integer,
    slp_start_md: Integer,
    slp_end_md: Integer,
    valid_day_cnt: Integer,
    last_valid_date: java.lang.Long
)