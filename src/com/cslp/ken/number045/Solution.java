package com.cslp.ken.number045;

public class Solution {
    public int jump(int[] nums) {
        //使用贪心算法实现
        int end = 0; //边界
        int maxPosition = 0; //跳的最远的点
        int steps = 0; //跳跃步数
        for(int i = 0; i < nums.length - 1; i++){
            maxPosition = Math.max(maxPosition, nums[i] + i);
            if( i == end){ //遇到边界，就更新边界，并且步数加一
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }
}
