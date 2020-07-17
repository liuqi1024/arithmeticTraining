package com.cslp.ken.number026;

import java.util.Arrays;

//删除排序数组的重复项
public class Solution_2nd {
  public static int removeDuplicates(int[] nums) {
    int p = 0;
    if (nums == null || nums.length == 0) {
      return 0;
    }

    for (int q = 1; q < nums.length; q++) {
      if (nums[p] != nums[q]) {
        p++;
        nums[p] = nums[q];
      }
    }

    return p + 1;
  }

  public static void main(String[] args) {
    int[][] nums = new int[5][];
    nums[0] = new int[]{1, 2, 2, 2, 4, 5};
    nums[1] = new int[]{0, 0, 0, 6, 6, 8, 8};
    nums[2] = new int[]{0};
    nums[3] = new int[]{1, 2, 3, 4};
    nums[4] = new int[]{};
    for (int i = 0; i < nums.length; i++) {
      System.out.println(Arrays.toString(nums[i]));
//      System.out.println(Arrays.toString(moveZeroes(nums[i])));
      System.out.println("length = " + removeDuplicates(nums[i]));
    }

  }

}
