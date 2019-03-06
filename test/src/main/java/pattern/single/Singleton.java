/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package pattern.single;

public class Singleton {
  private Singleton(){}
//  private static Singleton pattern.single = new Singleton();
//  public static Singleton getInstance(){
//    return pattern.single;
//  }
  private static Singleton single;
//  public static synchronized Singleton getInstance(){
//    if(pattern.single == null){
//      pattern.single = new Singleton();
//    }
//    return pattern.single;
//  }
//  public static Singleton getInstance(){
//    if(pattern.single == null){
//      synchronized (Singleton.class){
//        if(pattern.single == null){
//          pattern.single = new Singleton();
//        }
//      }
//    }
//    return pattern.single;
//  }
  //私有静态内部类
  private static class SingleHolder{
      private static Singleton single = new Singleton();
  }
  public static Singleton getInstance(){
    return SingleHolder.single;
  }
}

class Single{}

enum SingletonEnum{
  INSTANCE;
  private Single instance;
  SingletonEnum(){
    instance = new Single();
  }
  public Single getInstance(){
    return instance;
  }
}

class SingleTest{
  public static void main(String[] args) {
    Singleton s = Singleton.getInstance();
    Singleton s1 = Singleton.getInstance();
    Single s2 = SingletonEnum.INSTANCE.getInstance();
    Single s3 = SingletonEnum.INSTANCE.getInstance();
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s2 == s3);
    String s4 = "123";
    String s5 = "123";
//    System.out.println(s4.equals(s5));

  }
}
