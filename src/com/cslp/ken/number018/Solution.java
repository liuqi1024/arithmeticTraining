package com.cslp.ken.number018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        //当数组为null或元素小于4个时，直接返回
        if (nums == null || nums.length < 4) return result;

        //对数组进行从小到大排序/
        Arrays.sort(nums);

        //定义4个指针k，i，j，h  k从0开始遍历，i从k+1开始遍历，留下j和h，j指向i+1，h指向数组最大值
        for (int k = 0; k < length - 3; k++) {
            //获取当前最小值，如果最小值比目标值大，直接返回
            int min1 = nums[k] + nums[k + 1] + nums[k + 2] + nums[k + 3];
            if (min1 > target) break;

            //获取当前最大值，如果最大值比目标值小，忽略
            int max1 = nums[k] + nums[length - 1] + nums[length - 2] + nums[length - 3];
            if (max1 < target) continue;

            //第二层循环i，初始值指向k+1
            for (int i = k + 1; i < length - 2; i++) {

                //定义指针j指向i+1, 指针h指向数组末尾
                int j = i + 1;
                int h = length - 1;

                //获取当前最小值，如果最小值比目标值大，说明后面越来越大的值根本没戏
                int min = nums[k] + nums[i] + nums[j] + nums[j + 1];
                if (min > target) break;

                //获取当前最大值，如果最大值比目标值小，说明后面越来越小的值根本没戏
                int max = nums[k] + nums[i] + nums[h] + nums[h - 1];
                if (max < target) continue;

                //开始j和h的双指针，如果等于目标值，j++并去重，h--并去重，当当前和大于目标值时h--，当当前和小于目标值时j++
                while (j < h) {
                    int curr = nums[k] + nums[i] + nums[j] + nums[h];
                    if (curr == target) {
                        result.add(Arrays.asList(nums[k], nums[i], nums[j], nums[h]));
                        j++;
                        h--;
                    } else if (curr > target) {
                        h--;
                    } else {
                        j++;
                    }
                }
            }
        }
        result = result.stream().distinct().collect(Collectors.toList());
        return result;
    }

}
