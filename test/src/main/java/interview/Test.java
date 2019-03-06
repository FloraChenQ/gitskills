/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package interview;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {
  private List<String> dims = null;
  Test(String dims){
    this.dims = Arrays.asList(dims.split(","));
  }

  public static void main(String[] args){
    String[] array=new String[]{ "1","2","3"};
    listAll(Arrays.asList(array),"");
  }

  public static void listAll(List cadidate, String prefix){
    System.out.println(prefix);
    for(int i = 0; i<cadidate.size(); i++){
      List temp=new LinkedList(cadidate);
      listAll(temp,prefix+temp.remove(i)); //temp是删后的列表， remove 是LinkedList所拥有的方法。
    }
  }
}
