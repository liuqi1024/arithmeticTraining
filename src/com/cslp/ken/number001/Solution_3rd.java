package com.cslp.ken.number001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution_3rd {

  public static int[] twoSum_violent(int[] nums, int target) {
    for (int i = 0; i < nums.length - 1 ; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[]{i, j};
        }
      }
    }
    return null;
  }

  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i]) && (map.get(target - nums[i]) != i)) {
        return new int[]{i, map.get(target - nums[i])};
      }
    }
    return null;
  }

  public static void main(String[] args) {
    int[] nums = {3, 2, 4};
    int target = 6;
    int[] result = new int[2];
    result = twoSum(nums, target);
    System.out.println(Arrays.toString(result));
  }
}
