/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package test.model;

public class Split {
  public static void main(String[] args) {
    String str = "MdDeviceDataMiddle(2017-07-03,1000000001,11,0,0,0,0.0,0,2000,0.0,0.0,3000,100," +
        "200,0,40,499,0.0,60,600)\n" +
        "MdDeviceDataMiddle(2017-07-10,1000000004,11,76,67,78,63.7,110978,6000,0.0,0.0,7000,500," +
        "1000,0,320,400,0.0,10,730)\n" +
        "MdDeviceDataMiddle(2017-07-10,1000000005,11,0,0,0,0.0,0,29999,0.0,0.0,11999,5999,5999,0," +
        "120,300,100.0,-10,410)\n" +
        "MdDeviceDataMiddle(2017-07-10,1000000006,11,0,0,0,0.0,0,0,0.0,0.0,0,6000,6001,0,120,300," +
        "101.0,-10,430)\n" +
        "MdDeviceDataMiddle(2017-07-03,1000000000,11,0,0,0,0.0,0,0,0.0,0.0,0,0,0,0,0,0,0.0,0,0)\n" +
        "MdDeviceDataMiddle(2017-07-03,1000000003,11,0,0,0,2.9,0,4000,0.0,0.0,5000,300,400,100," +
        "20,300,10.0,1,421)\n" +
        "MdDeviceDataMiddle(2017-07-03,1000000004,11,66,57,68,53.7,100978,5000,0.0,0.0,6000,400," +
        "900,0,0,0,0.0,0,0)\n" +
        "MdDeviceDataMiddle(2017-07-03,1000000002,11,86,77,88,73.7,123978,3000,0.0,0.0,4000,200," +
        "300,2,140,400,0.0,-240,300)";

    split(str);






  }

  public static void split(String str){
    String[] split = str.split("\n");
    for( int i=0;i<split.length;i++) {
      for( String s1 : split[i].split(",")){
        System.out.print(s1+"\t");
      }
      System.out.println();
    }

  }
}
