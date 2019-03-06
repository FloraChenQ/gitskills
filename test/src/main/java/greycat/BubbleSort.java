/*
 * Copyright (c) 2017. Huami Inc, All Rights Reserved
 */

package greycat;

public class BubbleSort {
  public static void main(String[] args) {
    int[] array = new int[]{2,5,4,1,9,3,6};
    for(int i = 0; i< array.length; i++){
      System.out.println(array[i]);
    }

    quickSort(array,0,6);
//    sort(array);
    for(int i = 0; i< array.length; i++){
      System.out.println(array[i]);
    }

  }

  private static void sort(int[] array ){
//    每次跟后一个元素对比，选出最大的到最后
    for(int i=0;i<array.length-1;i++){
//      对比并交换
      for(int j=0; j< array.length-1-i; j++ ){
        if(array[j] > array[j+1]){
           int tmp = array[j];
           array[j] = array[j+1];
           array[j+1] = tmp;
        }
      }
    }
  }

  //标记法，递归调用
  private static void quickSort(int[] array, int startIndex, int endIndex){
//递归的结束条件
    if(startIndex >=endIndex) return;
//    得到基准元素的位置
    int pivotIndex = partition(array,startIndex,endIndex);
    System.out.println(pivotIndex);
    quickSort(array,startIndex,pivotIndex-1);
    quickSort(array,pivotIndex+1,endIndex);

  }

  private static int partition(int[] array,int startIndex, int endIndex){
    int pivot = array[startIndex];
    int left = startIndex;
    int right = endIndex;
//    将数组小于mark的放到左侧，大于mark的放到右侧
    while (left != right){
      while(left<right && array[right] > pivot){
        right --;
      }
      while(left<right && array[left] <= pivot){
        left ++;
      }

      if(left<right){
        int p = array[left];
        array[left] = array[right];
        array[right] = p;
      }
    }

    int p = array[left];
    array[left] = pivot;
    array[startIndex] = p;

    return left;
  }

}
