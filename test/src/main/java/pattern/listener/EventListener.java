/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package pattern.listener;

public interface EventListener extends java.util.EventListener {
  //事件处理
  public void handleEvent(EventObject event);
}
