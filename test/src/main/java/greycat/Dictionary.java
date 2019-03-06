/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package greycat;

import java.util.Arrays;

public class Dictionary {
  //主流程，返回最近一个大于自身的相同数字组成的整数。

  public static void main(String[] args) {

    int[] numbers = {1,2,3,4,5};

    for(int i=0; i<5;i++){
      numbers = findNearestNumber(numbers);
      outputNumbers(numbers);
    }

  }

  private static int[] findNearestNumber(int[] numbers){
//    copy
    int[] copyNum = Arrays.copyOf(numbers, numbers.length);
// 从后向前找到  arr[i] >arr[i-1]的位置，也就是逆序边界
    int index = findIndex(copyNum);
    if(index ==0){
      return numbers;
    }
//      head 与逆序空间中的一个数交换
    int[] exchangeNum = exchange(copyNum, index);
//      reverse
    int[] result = reverse(exchangeNum,index);

    return result;
  }

  private static int findIndex(int[] numbers){
    for(int i=numbers.length-1;i>0;i--){
      if(numbers[i] > numbers[i-1])
        return i;
    }
    return 0;
  }

  private static int[] exchange(int[] numbers,int index){
    int head = numbers[index-1];
    for(int i=numbers.length-1;i>0;i--){
      if(numbers[i] > head){
        numbers[index-1] = numbers[i];
        numbers[i]=head;
        break;
      }
    }
    return numbers;
  }

  private static int[] reverse(int[] numbers,int index){
    for(int i=numbers.length-1,j=index; i>j;i--,j++){
      int temp = numbers[i];
      numbers[i] = numbers[j];
      numbers[j] = temp;
    }
    return numbers;
  }
  //输出数组

  private static void outputNumbers(int[] numbers){

    for(int i : numbers){

      System.out.print(i);

    }

    System.out.println();

  }
}
