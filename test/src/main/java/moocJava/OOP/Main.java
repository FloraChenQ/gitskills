/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package moocJava.OOP;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    Fraction a = new Fraction(in.nextInt(), in.nextInt());

    Fraction b = new Fraction(in.nextInt(),in.nextInt());

    a.print();

    b.print();

    a.plus(b).print();

    a.multiply(b).plus(new Fraction(5,6)).print();

    a.print();

    b.print();

    in.close();

  }
}

class Fraction{
  String f;
  Fraction(int m, int n){
    int fun = fun(m, n);
    if(m == n) f = "1";
    else if(fun ==1){
      f =  m+"/"+n;
    }else{
      int a = m/fun;
      int b = n/fun;
      f = a+"/"+b;
    }
  }

  double toDouble(){
    String[] split = this.f.split("/");
    int a = Integer.valueOf(split[0]);
    int b = Integer.valueOf(split[1]);
    return 1.0* a/b;
  }

  void print(){
    System.out.println(f);
  }

  Fraction plus(Fraction r){
    String[] split = r.f.split("/");
    int a = Integer.valueOf(split[0]);
    int b = Integer.valueOf(split[1]);

    String[] split1 = this.f.split("/");
    int c = Integer.valueOf(split1[0]);
    int d = Integer.valueOf(split1[1]);

    if(fun(d,b) == 1)
      return new Fraction((a*d+b*c),(b*d));
    else{
      int bei = bei(d, b);
      return new Fraction((bei/b*a+bei/d*c),bei);
    }
  }

  Fraction multiply(Fraction r){
    String[] split = r.f.split("/");
    int a = Integer.valueOf(split[0]);
    int b = Integer.valueOf(split[1]);

    String[] split1 = this.f.split("/");
    int c = Integer.valueOf(split1[0]);
    int d = Integer.valueOf(split1[1]);

    return new Fraction((a*c),(b*d));
  }

  public static int fun(int a, int b){
    int i;
    if(a<b)i=a;
    else i=b;
    for(;;i--){
      if((a%i)==0&&(b%i)==0)
        return i;
    }
  }

  public static int bei(int a, int b){
    int fun = fun(a, b);
    return a*b/fun;
  }

}
