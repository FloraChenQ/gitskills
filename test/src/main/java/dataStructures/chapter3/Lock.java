/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package dataStructures.chapter3;

public class Lock {
  private String code;
  Lock(String code){
    this.code = code;
  }
  public boolean open(String code){
    return this.code.equals(code);
  }
  public boolean changeCombo(String code, String newCode){
    if(this.code.equals(code)){
      this.code = newCode;
      return true;
    }else
      return false;
  }

  private static void print(int[] arr){
    int len = arr.length;
    StringBuffer sb = new StringBuffer();
    for(int a:arr){
      String s = String.format("%-5d", a);
      sb.append(s);
    }
    System.out.println(sb.toString());
  }
  public static void printArr(int[][] arr){
    for(int[] a : arr){
      print(a);
    }
  }

  public static void main(String[] args) {
//    String code = "123";
//    Lock lock = new Lock(code);
//    boolean open = lock.open("12233");
//    System.out.println(open);
//    boolean b = lock.changeCombo("123", "234");
//    System.out.println(b);
//    int x = 54;
//    int y = 2;
//    int z = 100;
//    String format = String.format("%-5d%-5d%-5d", x, y, z);
//    System.out.println(format);
//    int x1 = 3;
//    int y1 = 300;
//    int z1 = 20;
//    String format1 = String.format("%-5d%-5d%-5d", x1, y1, z1);
//    System.out.println(format1);

   int[][] arr = {{1,22,333,555,2,12},{22,444,5,6,22,1},{1,2,3,4,5,6}};
   printArr(arr);
  }
}
