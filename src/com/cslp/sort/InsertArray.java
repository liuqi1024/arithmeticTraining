package com.cslp.sort;

import java.util.Arrays;

public class InsertArray {

    //往一个有序数组里插入一个字母
    public static int[] insert(int[] array, int value) {
        if (array.length <= 0) {
            return new int[]{value};
        }

        int[] result = Arrays.copyOf(array, array.length + 1);
        int length = result.length;
        int i = length - 2;
        for (; i >= 0; i--) {
            if (result[i] > value) {
                result[i + 1] = result[i];
            } else {
                break;
            }
        }
        result[i + 1] = value;

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 9, 10, 12};
        int[] result = insert(array, 4);
        System.out.println(Arrays.toString(result));
    }
}
