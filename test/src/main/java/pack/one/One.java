/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

//package pack;
//package one;
package pack.one;
public class One {
  public static int max(int a, int b, int c){
    int temp = a>b?a:b;
    return temp>c?temp:c;
  }
  public static int max(int a, int b, int c, int d){
    int temp = max(a,b,c);
    return temp>d?temp:d;
  }
  public static boolean year(int year){
    if(year%100 != 0 && year%4 ==0  ){
      return true;
    }else if(year%400 == 0)return true;
      else return false;
  }
  public static boolean num(int a, int b){
    if((a*a+b*b+1)%(a*b)==0){
      return true;
    }else return false;
  }
  public static void main(String[] args) {
//    int b = 5, c = 8;
//    int a = ++b + c++;
//    System.out.println(a);
//    boolean d = true && false || true;
//    System.out.println(d);
//    for(int i = 1; i<=9; i++){
//      for(int j = i; j<=9; j++){
//        System.out.print(i+"*"+j+"="+i*j+"\t");
//      }
//      System.out.println();
//    }
//
//    int e=max(4,22,3);
//    int f = max (56,4,32,7);
//    boolean b1 = year(1900);
//    boolean b2 = year(2008);
//    boolean b3 = year(1987);
//    System.out.println(e+","+f+","+b1+","+b2+","+b3);

    for(int i = 1; i < 1000; i++){
      for(int j = i+1; j<1000; j++ ){
        if(num(i,j)) System.out.println(i+","+j+"\t");
      }
    }

    for( int a = 1; a<9; a++){
      int w = a+1;
      for(int m = 0 ; m<=9 ; m++){
        if( m !=a && m !=w ){
          a:
          for(int l = 0; l<=9 ; l++){
            if(l != a && l !=w && l !=m && m+l>9){
             int e = m +l -10;
             if(e == a || e == w || e == m || e == l ){
               e = e-1;
               if(e == a || e == w || e == m || e == l) break a;
             }else {

             }
            }
          }
        }
      }

    }

  }
}
