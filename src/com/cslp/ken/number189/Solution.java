package com.cslp.ken.number189;

public class Solution {
  public void rotate(int[] nums, int k) {
    int temp, previous;
    for (int i = 0; i < k; i++) {
      previous = nums[nums.length - 1];
      for (int j = 0; j < nums.length; j++) {
        temp = nums[j];
        nums[j] = previous;
        previous = temp;
      }
    }
  }

  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5};
    int k = 3;
    new Solution().rotate(nums, k);
  }
}
