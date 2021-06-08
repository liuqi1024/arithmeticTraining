package com.cslp.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] array) {
        int length = array.length;
        if (length <= 1) {
            return;
        }

        for (int i = 0; i < length - 1; i++) {
            int min = array[i]; //第一个未排序的值设置为最小值
            int minIndex = i;   //记录最小值所在的索引，用于后续的交换
            int j = i + 1;
            for (; j < length; j++) {
                //从最小值后的数组开始进行比较，找出最小值，并且记录值和所在位置的索引
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

    }

    public static void main(String[] args) {
        int[] array = {3, 9, 12, 6, 1, 2, 10, 11, 4};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
