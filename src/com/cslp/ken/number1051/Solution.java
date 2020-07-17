package com.cslp.ken.number1051;

import java.util.Arrays;

/**
 *
 */
public class Solution {

  public static int[] sort(int[] heights) {
    int sum = 0;
    int size = heights.length;
    for (int j = 0; j < size - 1; j++) {
      for (int i = 0; i < size - 1; i++) {
        int temp = 0;
        if (heights[i] == 0) {
          heights[i] = heights[i + 1];
          heights[i + 1] = 0;
        }
      }
    }
    return heights;
  }

  public static void main(String[] args) {
//    int[] heights = new int[]{3, 0, 5, 8, 0, 1};
    int[] heights = new int[]{3, 0, 5, 8, 0, 1, 7};
    System.out.println(Arrays.toString(heights));
    System.out.println(Arrays.toString(sort(heights)));
  }
}
