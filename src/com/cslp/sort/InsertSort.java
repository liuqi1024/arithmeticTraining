package com.cslp.sort;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import java.util.Arrays;

public class InsertSort {

    public static void sort(int[] array) {
        int length = array.length;
        if (length <= 1) {
            return;
        }

        for (int i = 1; i < array.length; i++) {
            int next = array[i];
            int j = i - 1;
            for (; j >= 0 ; j--) {
                if (array[j] > next) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j + 1] = next;
        }

    }

    public static void main(String[] args) {
        int[] array = {3, 9, 12, 6, 1, 2, 10, 11, 4};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
