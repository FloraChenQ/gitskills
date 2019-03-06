/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package dataStructures.chapter2;
//import java.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Demo {
  public static void main(String[] args) {

//    int x = 5, y = 7;
//    System.out.println(x+''+y);
//    int i = foo();
//    System.out.println(i);
//    try{
//      foo();
//    }catch ( NullPointerException e){
//      System.out.println(e);
//    }
//    double[] arr = {1.2,3.4,2.0,2};
//    double sum = sum(arr);
//    System.out.println(sum);
//    double average = average(arr);
//    System.out.println(average);
//    double mode = mode(arr);
//    System.out.println(mode);
//
//    double[][] arrs = {{1.2,3.4,2.0,2},{1.2,3.4,2.0,2},{1.2,3.4,2.0,2}};
//    double sum1 = sum(arrs);
//    System.out.println(sum1);
//    double average1 = average(arrs);
//    System.out.println(average1);
//    double mode1 = mode(arrs);
//    System.out.println(mode1);
//
    String[] str = { "hao", "perfect", "nice","a"};
//    reverse(arr);
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("nice");
    strings.add("perfect");
    strings.add("excellent");
//    reverse(strings);

    int[] arr = {1,4,-4,7,-9,6};
    int[][] arr1 = {{1,3,5,-7,90,0,0,0},{1,0,0,4,0,0,0-4,7,-9,6},{2,4,-4,0}};
//    String min = min(strings);
//    System.out.println(min);
    int i = rowWithMostZeros(arr1);
    System.out.println(i);


  }

  public static void foo() throws NullPointerException{
    try{
//      return 0;
      throw new NullPointerException();
    }finally {
//      return 1;
//      throw new ArithmeticException()u;
      System.out.println("s");
    }
  }

  //校验和是32位的整数
  public static String getUnicode(String source){
    String returnUniCode=null;
    String uniCodeTemp=null;
    for(int i=0;i<source.length();i++){
      uniCodeTemp = "\\u"+Integer.toHexString((int)source.charAt(i));//使用char类的charAt()的方法
      returnUniCode=returnUniCode==null?uniCodeTemp:returnUniCode+uniCodeTemp;
    }
    System.out.print(source +" 's unicode = "+returnUniCode);
    return returnUniCode;//返回一个字符的unicode的编码值
  }

  public static double sum (double [] arr){
    double sum = 0.0;
    for(double d: arr){
      sum += d;
    }
    return sum;
  }

  public static double average (double [] arr){
    double sum = sum(arr);
    return sum/arr.length;
  }
  public static double mode(double [] arr){
    HashMap<Double, Integer> map = new HashMap<Double, Integer>();
    for(double d: arr){
      int i = 0;
      if(map.get(d) != null)
        i = map.get(d);
      map.put(d,i+1);
    }
    int max = 0;
    for(int i: map.values()){
     if(i>max) max = i;
    }

    for(double d: arr){
      if(map.get(d) == max) return d;
    }
    return 0.0;
  }

  public static int same(double [] arr){
    double[] sort = sort(arr);
    int count = 0;
    for(int i = sort.length-1; i>0; i--){
      if (sort[0] - sort[i] == 0) {
         return i+1;
      }
    }
    return count;
  }

  public static double[] sort(double [] arr){

    for(int i = 0; i<arr.length ; i++){
      for(int j = i+1; j<arr.length; j++){
        if(arr[i] > arr[j]){
          double temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;
  }

  public static double sum(double [][] arr){
    double sum = 0.0 ;
    for(double [] ds: arr){
      sum += sum(ds);
    }
    return sum;
  }

  public static double average(double [][] arr){
    double sum = sum(arr);
    int i = arr.length * arr[0].length;
    return sum/i;
  }

  public static double mode(double [][] arr){
    HashMap<Double, Integer> map = new HashMap<Double, Integer>();
    for(double[] ds :arr){
      for(double d: ds){
        int i = 0;
        if(map.get(d) != null)
          i = map.get(d);
        map.put(d,i+1);
      }
    }

    int max = 0;
    for(int i: map.values()){
      if(i>max) max = i;
    }

    for(double[] ds :arr) {
      for (double d : ds) {
        if (map.get(d) == max) return d;
      }
    }
    return 0.0;
  }

  public static void reverse(String [] arr){
    for(int i = arr.length-1 ; i>=0; i--){
      System.out.print(arr[i]+" ");
    }
  }

  public static void reverse(ArrayList<String> arr){
    for(int i = arr.size()-1 ; i>=0; i--){
      System.out.print(arr.get(i)+" ");
    }
  }

  public static int min(int[] arr){
    int min = arr[0];
    for(int i :arr){
      if(i<min){ min = i;}
    }
    return min;
  }

  public static int min(int[][] arr){
    int min = arr[0][0];
    for(int[] i :arr){
      int m = min(i);
      if(m<min) min = m;
    }
    return min;
  }

  public static String min(String[] arr){
    String min = arr[0];
    for(String i :arr){
      if(i.compareTo(min) < 0){ min = i;}
    }
    return min;
  }

  public static String min(ArrayList<String> arr){
    String min = arr.get(0);
    for(String i :arr){
      if(i.compareTo(min) < 0){ min = i;}
    }
    return min;
  }

  public static int rowWithMostZeros(int[][] arr){
    int[] count = new int[arr.length];
    for( int m = 0 ; m< arr.length ; m++){
      int n = 0;
      for( int i: arr[m]){
        if(i==0) n++;
      }
      count[m] = n;
    }
    int max = 0;
    for(int i = 0; i<count.length; i++){
      if(count[i] >count[max]) max = i;
    }
    return max+1;
  }


}
