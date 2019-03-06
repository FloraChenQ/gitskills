/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package interview;

public class TryCatchTest {
  public static void main(String[] args) {
    int test = test();
    System.out.println(test);
  }

  private static int test(){
    try{
      int i = 1/0;
      return 1;
    }catch(Exception e){
      return 2;
    }finally {
      return 3;
    }
  }
}
