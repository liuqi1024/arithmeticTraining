package com.cslp.ken.number283;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 移动零
 */
public class Solution {

  /**
   * 1. 循环一遍，遇到0就删除，然后在最后增加0
   * @param nums
   * @return
   */
  public static int[] moveZeroes(int[] nums) {
    int size = nums.length;
    List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
    Iterator iterator = list.iterator();
    while(iterator.hasNext()) {
      if ((int)iterator.next() == 0) {
        iterator.remove();
      }
    }
    nums = list.stream().mapToInt(Integer::valueOf).toArray();
    int[] result = new int[size];
    System.arraycopy(nums, 0, result, 0, nums.length);
    for (int i = nums.length; i < size; i++) {
      result[i] = 0;
    }
    return result;
  }

  public static int[] moveZeroes_by_copy(int[] nums) {
    int j = 0;
    if (nums == null) return null;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
//        int temp = nums[j];
//        nums[j++] = nums[i];
//        nums[i] = temp;
//        int temp = nums[i];
//        nums[i] = nums[j];
//        nums[j++] = temp;
        if(i > j) {
          nums[j] = nums[i];
          nums[i] = 0;
        }
        j++;
      }
    }
    return nums;
  }

  public static void main(String[] args) {
    int[][] nums = new int[4][];
    nums[0] = new int[]{8, 0, 1, 0, 6, 0};
    nums[1] = new int[]{0, 0, 0, 6, 6, 8, 1};
    nums[2] = new int[]{0};
    nums[3] = new int[]{4, 2, 3, 1};
    for (int i = 0; i < nums.length; i++) {
      System.out.println(Arrays.toString(nums[i]));
      System.out.println(Arrays.toString(moveZeroes_by_copy(nums[i])));
    }

  }
}
