/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package pattern.listener;

public class EventObject extends java.util.EventObject{
  private static final long serialVersionUID = 1L;
  public EventObject(Object source){
    super(source);
  }
  public void doEvent(){
    System.out.println("通知一个事件源 source :"+ this.getSource());
  }

}
