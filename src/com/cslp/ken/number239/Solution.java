package com.cslp.ken.number239;

import java.util.LinkedList;

public class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        /**
         * 1. 定义窗口个数，左右下标值，结果集数组，还有queue（注意存的是数组的下标）
         * 2. 入queue的时机：当queue不等于空并且下一个待插入的值小于queue的最后一个
         * 3. 删除queue的时机：当下一个待插入的值大于queue最后一个的时候，删除掉最后一个，并且再插入
         * 4. 插入result的时机：当queue的(left = right - k + 1) > queue.first的时候，把queue的left出queue并且放入到result里
         * 5. 定义
         */

        return null;
    }

















    public int[] maxSlidingWindow2(int[] nums, int k) {
        // 窗口个数
        int[] res = new int[nums.length - k + 1];
        LinkedList<Integer> queue = new LinkedList<>();

        // 遍历数组中元素，right表示滑动窗口右边界
        for(int right = 0; right < nums.length; right++) {
            // 如果队列不为空且当前考察元素大于等于队尾元素，则将队尾元素移除。
            // 直到，队列为空或当前考察元素小于新的队尾元素
            while (!queue.isEmpty() && nums[right] >= nums[queue.peekLast()]) {
                queue.removeLast();
            }

            // 存储元素下标
            queue.addLast(right);

            // 计算窗口左侧边界
            int left = right - k +1;
            // 当队首元素的下标小于滑动窗口左侧边界left时
            // 表示队首元素已经不再滑动窗口内，因此将其从队首移除
            if (queue.peekFirst() < left) {
                queue.removeFirst();
            }

            // 由于数组下标从0开始，因此当窗口右边界right+1大于等于窗口大小k时
            // 意味着窗口形成。此时，队首元素就是该窗口内的最大值
            if (right +1 >= k) {
                res[left] = nums[queue.peekFirst()];
            }
        }
        return res;
    }



    public static void main(String[] args) {

    }
}
