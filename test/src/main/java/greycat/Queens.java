/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package greycat;

public class Queens {
  static final int MAX_QUEEN = 8;
  int[][]  chessboard = new int[MAX_QUEEN][MAX_QUEEN];
//  八皇后问题求解思路：1.用二维数组表示 chessboard， 2 递归回溯 3.check
  public static void main(String[] args) {
//    chessboard[0][0]=0;
    Queens queens = new Queens();
//    queens.chessboard[2][3]=1;
//    广度遍历？写循环？

    queens.settleQueen(0);
    queens.printchessboard(queens.chessboard);
//    queens.check()

  }

  void printchessboard(int[][] chessboard){
    for(int x=0;x<chessboard.length;x++){
      for(int y=0;y<chessboard[x].length;y++){
        System.out.print(chessboard[x][y]+"\t");
      }
      System.out.println();
    }
  }
  /**
   * 判断某位置是否合规
   * @param x 位置的横坐标
   * @param y 位置的纵坐标
   * @return  真：合规
   */
  boolean check(int x, int y){
//    默认从上往下放棋子，所以只要检查上方的棋子
//    1.检查纵坐标是否符合,行变，列不变
    for(int i=0;i<x;i++){
      if(chessboard[i][y] ==1){
//        System.out.println("column");
        return false;}
    }
//    2.左上是否符合 行减，列也减
    for(int i=0;i<x && i<y;i++){
      if( chessboard[x-1-i][y-1-i]==1){
//        System.out.println("left");
        return false;}
    }
//    3.右上是否符合 行减，列加
    for(int i=0;i+y<7 && i<x;i++){
      if(chessboard[x-1-i][y+1+i]==1){
//        System.out.println("right");
        return false;}
    }
    return true;
  }



//  从上往下，从左往右，遍历满足条件的值
  boolean settleQueen(int x){
//行数超过8,说明已经找到答案   TODO :ATTENTION!!跳出条件
    if(x == MAX_QUEEN){return true;}
//    遍历当前行，逐一格子验证
    for(int i=0;i<MAX_QUEEN; i++){
//      当前行清零，以免在回溯时出现脏数据 TODO :ATTENTION!! 先归零
      for(int y=0;y<MAX_QUEEN;y++){
        chessboard[x][y]=0;
      }
//      检查是否符合规则，如果符合，更改元素并进一步递归
      if(check(x,i)){
        chessboard[x][i]=1;
        if(settleQueen(x+1)){
          return true;
        }
      }
    }
    return  false;
  }

//  TODO :明确坐标系和二维数组的角标关系；
//  坐标系中：（x,y） ===>(横坐标，纵坐标)
//  二维数组中 chessboard[x][y]  ===> 行号（纵坐标），列号（横坐标）
}
