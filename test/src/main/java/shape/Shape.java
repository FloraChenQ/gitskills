/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package shape;


public class Shape {
  public static void main(String[] args) {
    for (int i = 0; i < 4; i++) {
      for (int k = 0; k < 3 - i; k++) {
        System.out.print(" ");
      }
      for (int j = 0; j <2*(i+1); j++) {
        System.out.print("#");
      }
      System.out.println();
    }

    for (int i = 0; i < 4; i++) {
      for (int k = 0; k < i; k++) {
        System.out.print(" ");
      }
      for (int j = 8 - i * 2; j > 0; j--) {
        System.out.print("#");
      }
      System.out.println();
    }
  }
}
