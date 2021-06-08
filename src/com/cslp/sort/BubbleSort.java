package com.cslp.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] array) {
        if (array.length <= 1) {
            return;
        }

        for (int i = 0; i < array.length; i++) {
            boolean flag = false; // 提前退出冒泡循环的标志位
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
            // 没有数据交换，提前退出
            if (flag == false) {
                break;
            }

        }
    }

    public static void main(String[] args) {
        int[] array = {3, 9, 12, 6, 1, 2, 10};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
