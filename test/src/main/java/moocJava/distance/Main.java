/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package moocJava.distance;

public class Main {

  public static void main(String[] args) {
    java.util.HashMap<String, Integer> res = new java.util.HashMap<String, Integer>();
    java.util.ArrayList<String> city = new java.util.ArrayList<String>();
    java.util.ArrayList<String> cityPair = new java.util.ArrayList<String>();
    java.util.ArrayList<Integer> distance = new java.util.ArrayList<Integer>();
    java.util.Scanner in = new java.util.Scanner(System.in);

    while (in.hasNext()){
      String s = in.next();
      if(s.equals("###")){
        break;
      }
      city.add(s);
    }

    for(String a: city){
      for(String b: city){
        String ab = a+"-"+b;
        cityPair.add(ab);
      }
    }

    while (in.hasNextInt()){
      distance.add(in.nextInt());
    }

    for(int i=0; i<cityPair.size(); i++){
      res.put(cityPair.get(i),distance.get(i));
    }

    String ss = in.next()+"-"+in.next();

    if(res.containsKey(ss)){
      System.out.println(res.get(ss));
    }else {
      System.out.println("NOT FOUND");
    }

  }
}
