/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package greycat;

import java.util.concurrent.atomic.AtomicInteger;

public class CountTest {
//  给静态变量循环增加100次
  private static int count;
  public static void main(String[] args) {
//    for(int i=0; i<2; i++){
//      new Thread(CountTest::run).start();
//
//      try {
//        Thread.sleep(1000); //等待执行完毕后再打印count的最终结果
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }
//    }
////    System.out.println(count);
//    for(int i=0; i<2; i++){
//      new Thread(()->{
//        for(int j=0; j<100; j++){
//          try {
//            Thread.sleep(50); //等待执行完毕后再打印count的最终结果
//          } catch (InterruptedException e) {
//            e.printStackTrace();
//          }
//          atomicCount.incrementAndGet();
//          System.out.println(Thread.currentThread().getName() + ":" + atomicCount);
//        }
//      }).start();
//
//
//    }
//
//  }
//
//
//  private static void run() {
//    for (int j = 0; j < 100; j++) {
//      try { //先睡10ms 使得其他线程有机会交替执行
//        Thread.sleep(50);
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }
//      synchronized (CountTest.class){
//        count++;
//        System.out.println(Thread.currentThread().getName() + ":" + count);
//      }
//    }
//  }
//
//  private static AtomicInteger atomicCount= new AtomicInteger(0);

  }
}
