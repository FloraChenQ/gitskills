/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package test.model;



import java.util.ArrayList;

public class Contain {
  public static void main(String[] args) {

    ArrayList<String> arr = new ArrayList<String>();
    ArrayList<String> arr1 = new ArrayList<String>();
    String[] standard = { //标准答案
        "MdModelResult(100_1_156000000000_2_hr_avg_all,2017-07-03,100,2,2019-01-01,2,hr_avg_all,[[66,1],[86,2]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_hr_avg_wake,2017-07-03,100,2,2019-01-01,2,hr_avg_wake,[[68,1],[88,2]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_hr_avg_wake,2017-07-10,100,1,2019-01-01,2,hr_avg_wake,[[78,1]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_hr_avg_sleep,2017-07-10,100,1,2019-01-01,2,hr_avg_sleep,[[67,1]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_hr_rest_rate,2017-07-03,100,2,2019-01-01,2,hr_rest_rate,[[53,1],[73,2]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_hr_total_beat,2017-07-03,100,2,2019-01-01,2,hr_total_beat,[[100800,1],[123840,2]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_hr_avg_sleep,2017-07-03,100,2,2019-01-01,2,hr_avg_sleep,[[57,1],[77,2]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_hr_rest_rate,2017-07-10,100,1,2019-01-01,2,hr_rest_rate,[[63,1]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_hr_avg_all,2017-07-10,100,1,2019-01-01,2,hr_avg_all,[[76,1]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_hr_total_beat,2017-07-10,100,1,2019-01-01,2,hr_total_beat,[[110880,1]],156000000000,1)",
        // write test sample from here
        "MdModelResult(100_1_156000000000_2_step_avg_ttl,2017-07-03,100,4,2019-01-01,2,step_avg_ttl,[[2000,1],[3000,2],[4000,3],[5000,4]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_step_avg_ttl,2017-07-10,100,2,2019-01-01,2,step_avg_ttl,[[6000,1],[29500,2]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_emet_sum_md,2017-07-03,100,4,2019-01-01,2,emet_sum_md,[[300,1],[480,2],[690,3],[900,4]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_emet_sum_md,2017-07-10,100,2,2019-01-01,2,emet_sum_md,[[1290,1],[1770,2]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_estep_slow_stp_md,2017-07-03,100,4,2019-01-01,2,estep_slow_stp_md,[[3000,1],[4000,2],[5000,3],[6000,4]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_estep_slow_stp_md,2017-07-10,100,2,2019-01-01,2,estep_slow_stp_md,[[7000,1],[11800,2]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_estep_fast_stp_md,2017-07-03,100,4,2019-01-01,2,estep_fast_stp_md,[[100,1],[200,2],[300,3],[400,4]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_estep_fast_stp_md,2017-07-10,100,2,2019-01-01,2,estep_fast_stp_md,[[500,1],[5900,2]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_estep_run_stp_md,2017-07-03,100,4,2019-01-01,2,estep_run_stp_md,[[200,1],[300,2],[400,3],[900,4]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_estep_run_stp_md,2017-07-10,100,2,2019-01-01,2,estep_run_stp_md,[[1000,1],[5900,2]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_slp_time_md,2017-07-03,100,2,2019-01-01,2,slp_time_md,[[420,1],[530,2]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_slp_time_md,2017-07-10,100,1,2019-01-01,2,slp_time_md,[[420,1]],156000000000,1)",//
        "MdModelResult(100_1_156000000000_2_slp_deep_md,2017-07-03,100,2,2019-01-01,2,slp_deep_md,[[20,1],[40,2]],156000000000,1)",//?????[140 3]
        "MdModelResult(100_1_156000000000_2_slp_deep_md,2017-07-10,100,1,2019-01-01,2,slp_deep_md,[[120,1]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_slp_quality_md,2017-07-03,100,1,2019-01-01,2,slp_quality_md,[[10,1]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_slp_quality_md,2017-07-10,100,1,2019-01-01,2,slp_quality_md,[[100,1]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_slp_start_md,2017-07-03,100,2,2019-01-01,2,slp_start_md,[[1440,1],[1500,2]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_slp_start_md,2017-07-10,100,2,2019-01-01,2,slp_start_md,[[1430,1],[1450,2]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_slp_end_md,2017-07-03,100,2,2019-01-01,2,slp_end_md,[[420,1],[600,2]],156000000000,1)",
        "MdModelResult(100_1_156000000000_2_slp_end_md,2017-07-10,100,1,2019-01-01,2,slp_end_md,[[410,1]],156000000000,1)"
    };

    String[] my = {//我跑的答案
        "MdModelResult(100_1_156000000000_2_hr_avg_sleep,2017-07-10,100,1,2019-01-01,2," +
            "hr_avg_sleep,[[67,1]],156000000000,1)",
            "MdModelResult(100_1_156000000000_2_hr_avg_sleep,2017-07-03,100,2,2019-01-01,2," +
            "hr_avg_sleep,[[57,1],[77,2]],156000000000,1)",
            "MdModelResult(100_1_156000000000_2_slp_deep_md,2017-07-03,100,3,2019-01-01,2," +
            "slp_deep_md,[[20,1],[40,2],[140,3]],156000000000,1)",
            "MdModelResult(100_1_156000000000_2_slp_start_md,2017-07-03,100,4,2019-01-01,2," +
            "slp_start_md,[[1200,1],[1440,3],[1500,4]],156000000000,1)",
            "MdModelResult(100_1_156000000000_2_step_avg_ttl,2017-07-03,100,4,2019-01-01,2," +
            "step_avg_ttl,[[2000,1],[3000,2],[4000,3],[5000,4]],156000000000,1)",
            "MdModelResult(100_1_156000000000_2_hr_avg_all,2017-07-10,100,1,2019-01-01,2," +
            "hr_avg_all,[[76,1]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_hr_avg_wake,2017-07-10,100,1,2019-01-01,2," +
            "hr_avg_wake,[[78,1]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_step_avg_ttl,2017-07-10,100,2,2019-01-01,2," +
            "step_avg_ttl,[[6000,1],[29500,2]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_slp_quality_md,2017-07-03,100,1,2019-01-01,2," +
            "slp_quality_md,[[10,1]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_hr_rest_rate,2017-07-03,100,2,2019-01-01,2," +
            "hr_rest_rate,[[53,1],[73,2]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_slp_deep_md,2017-07-10,100,2,2019-01-01,2," +
            "slp_deep_md,[[120,2]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_hr_avg_wake,2017-07-03,100,2,2019-01-01,2," +
            "hr_avg_wake,[[68,1],[88,2]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_estep_slow_stp_md,2017-07-10,100,2,2019-01-01,2," +
            "estep_slow_stp_md,[[7000,1],[11800,2]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_estep_run_stp_md,2017-07-10,100,2,2019-01-01,2," +
            "estep_run_stp_md,[[1000,1],[5900,2]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_estep_fast_stp_md,2017-07-03,100,4,2019-01-01,2," +
            "estep_fast_stp_md,[[100,1],[200,2],[300,3],[400,4]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_slp_time_md,2017-07-03,100,3,2019-01-01,2," +
            "slp_time_md,[[420,1],[530,2],[540,3]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_estep_run_stp_md,2017-07-03,100,4,2019-01-01,2," +
            "estep_run_stp_md,[[200,1],[300,2],[400,3],[900,4]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_hr_rest_rate,2017-07-10,100,1,2019-01-01,2," +
            "hr_rest_rate,[[63,1]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_slp_time_md,2017-07-10,100,2,2019-01-01,2," +
            "slp_time_md,[[420,2]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_hr_avg_all,2017-07-03,100,2,2019-01-01,2," +
            "hr_avg_all,[[66,1],[86,2]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_hr_total_beat,2017-07-10,100,1,2019-01-01,2," +
            "hr_total_beat,[[110880,1]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_slp_end_md,2017-07-03,100,3,2019-01-01,2," +
            "slp_end_md,[[300,1],[420,2],[600,3]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_emet_sum_md,2017-07-10,100,2,2019-01-01,2," +
            "emet_sum_md,[[1290,1],[1770,2]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_slp_start_md,2017-07-10,100,3,2019-01-01,2," +
            "slp_start_md,[[1430,2],[1450,3]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_estep_fast_stp_md,2017-07-10,100,2,2019-01-01,2," +
            "estep_fast_stp_md,[[500,1],[5900,2]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_slp_end_md,2017-07-10,100,2,2019-01-01,2," +
            "slp_end_md,[[410,1],[430,2]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_emet_sum_md,2017-07-03,100,4,2019-01-01,2," +
            "emet_sum_md,[[300,1],[480,2],[690,3],[900,4]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_estep_slow_stp_md,2017-07-03,100,4,2019-01-01,2," +
            "estep_slow_stp_md,[[3000,1],[4000,2],[5000,3],[6000,4]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_slp_quality_md,2017-07-10,100,2,2019-01-01,2," +
            "slp_quality_md,[[100,1],[101,2]],156000000000,1)\n" +
            "MdModelResult(100_1_156000000000_2_hr_total_beat,2017-07-03,100,2,2019-01-01,2," +
            "hr_total_beat,[[100800,1],[123840,2]],156000000000,1)"
    };


    System.out.println("standard calculate======");
    containStr(standard,"slp_quality_md");

    System.out.println("my calculate========");
    containStr(my,"slp_quality_md");

    System.out.println("diff========");
    for(String s : my){
      arr.add(s);
    }
    int count = 0;
    for(String str: standard){
      if(!arr.contains(str)){
        count ++;
        System.out.println(str);
      }
    }
    System.out.println("diff:"+count);



  }

  public static void containStr(String[] strings, String content ){
    int cnt = 0;
    for(String str: strings){
      if(str.contains(content)){
        cnt ++;
        System.out.println(str);
      }
    }
    System.out.println(cnt);
  }

}
