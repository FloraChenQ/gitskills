/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package test;

import java.util.ArrayList;

public class Test2 {
  public static void main(String[] args) {
    System.out.println("Hello World" );


    ArrayList<String> arr = new ArrayList<String>();

//    A<String>[] a = new A<String>[10];
    A<Double> d = new A<Double>();
    d.write(4.5);

  }
}

class  A<T>{
  T t;
  public void write(T t){
    this.t = t;
  }
}
