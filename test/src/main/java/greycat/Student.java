/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package greycat;

public class Student {
  String name;
  int score;
  int age;
  String hobby;

  public Student(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Student setName(String name) {
    this.name = name;
    return this;
  }

  public int getScore() {
    return score;
  }

  public Student setScore(int score) {
    this.score = score;
    return this;
  }

  public int getAge() {
    return age;
  }

  public Student setAge(int age) {
    this.age = age;
    return this;
  }

  public String getHobby() {
    return hobby;
  }

  public Student setHobby(String hobby) {
    this.hobby = hobby;
    return this;
  }

  public static void main(String[] args) {
    int i = parseInt("A");
    System.out.println(i);
  }

  private static int parseInt(String number) {
    char[] b = number.toCharArray();
    int i = 0;
    boolean n = false;
    if (b[i] == '-') {
      n = true;
      i++;
    }
    int result = 0;
    for (; i < b.length; i++) {
      result = result << 6;
      System.out.println("i="+i+","+result);
      if (b[i] >= '0' && b[i] <= '9') {
        result += b[i] - '0';
      } else if (b[i] >= 'a' && b[i] <= 'z') {
        result += b[i] - 'a' + 10;
      } else if (b[i] >= 'A' && b[i] <= 'Z') {
        result += b[i] - 'A' + 36;
      } else if (b[i] == '@') {
        result += 62;
      } else if (b[i] == '_') {
        result += 63;
      } else {
        result = result >> 6;
      }
    }
    return n ? -result : result;
  }

}
