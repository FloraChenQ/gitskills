/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package greycat;

public class ReverseLinkedList {
  private static Node head;

  public static void reverseLinkedList(){
//    条件判断是否退出方法：当存在两个元素时进入方法
    if(head == null || head.next == null ){
      return;
    }
//    取得前两个元素
    Node p1 = head;
    Node p2 = head.next;
//    功能上放在循环外，循环里都可以，因为p3的生命周期就只在一次循环中
//    循环外：是一个变量，只占一个内存空间
//    循环内：每次都占一个新的内存空间，产生的垃圾多
// todo 所以 还是放在循环外好一些
//    Node p3 = null;
//   确立循环退出的条件
    while(p2 != null){
//   取出第三个元素
      Node p3 = p2.next;
//      将指针反转
      p2.next = p1;
//      向后移动指针
      p1 = p2;
      p2 = p3;
    }

//    当中间元素为null时，已经到达链表尾部
// 把head指针指向null
    head.next = null;
//    将head移到链表开头
    head = p1;
  }

  public static void main(String[] args) {
    head = new Node(3);
    head.next = new Node(5);
    Node tmp = head.next;
    tmp.next = new Node(1);
    tmp = tmp.next;
    tmp.next = new Node(4);
    tmp = tmp.next;
    tmp.next = new Node(9);

//    逆序前输出链表
    tmp = head;
    while(tmp != null){
      System.out.println(tmp.data);
      tmp = tmp.next;
    }
//    将链表反转
    reverseLinkedList();
//    逆序后链表输出
    tmp = head;
    while(tmp != null){
      System.out.println(tmp.data);
      tmp = tmp.next;
    }

  }


  private static class Node{
    int data;
    Node next;

    Node(int data){
      this.data=data;
    }
  }
}
