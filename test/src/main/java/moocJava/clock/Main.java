/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package moocJava.clock;

public class Main {
  public static void main(String[] args) {

    java.util.Scanner in = new java.util.Scanner(System.in);

    Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());

    clock.tick();

    System.out.println(clock);

    in.close();

  }
}

class Display {
  private int value;
  private int limit;
  Display(int limit){
    this.limit = limit;
  }
  public boolean increase(){
    value++;
    if(value == limit){
      value = 0;
      return true;
    }
    return false;
  }
  public int getValue(){
    return value;
  }
  public void setValue(int value){
    this.value = value;
  }

  public static void main(String[] args) {
    Display d = new Display(24);
    while(true){
      d.increase();
      System.out.println(d.getValue());
    }
  }

}

class Clock {
  private Display minute = new Display(60);
  private Display hour = new Display(24);
  private Display second = new Display(60);

  public Clock(int hour,int minute,int second){
    this.hour.setValue(hour);
    this.minute.setValue(minute);
    this.second.setValue(second);
  }

  public void tick(){
    if(second.increase()){
      if(minute.increase()){
        hour.increase();
      }
    }
  }

  public String toString(){
    return  String.format("%02d:%02d:%02d", hour.getValue(), minute.getValue(), second.getValue());
  }

}
