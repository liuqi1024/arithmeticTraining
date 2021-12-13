package com.cslp.ken.number034;

import java.util.Arrays;

public class Solution {

    public int[] searchRange(int[] nums, int target) {
        int[] index = new int[2];
        index[0] = searchFirst(nums, target);
        System.out.println(index[0]);
        index[1] = searchLast(nums, target);
        System.out.println(index[1]);
        return index;
    }

    //查找第一个等于给定值的数值，并返回索引
    private int searchFirst(int[] a, int target) {
        int length = a.length;
        int low = 0;
        int high = length - 1;

        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > target) {
                high = mid - 1;
            } else if(a[mid] < target) {
                low = mid + 1;
            } else {
                if (mid == 0 || a[mid-1] != target) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    //查找最后一个等于给定值的数值，并返回索引
    private int searchLast(int[] a, int target) {
        int length = a.length;
        int low = 0;
        int high = length - 1;

        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] > target) {
                high = mid - 1;
            } else if(a[mid] < target) {
                low = mid + 1;
            } else {
                if (mid == high || a[mid+1] != target) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] a = new int[]{6, 7, 12, 15, 15, 15, 15, 18, 20, 34, 66};
//        int[] a = new int[]{6, 7, 12, 15, 15, 15, 15, 18, 20, 34, 66};
        int[] a = new int[]{};
        int[] index =  new Solution().searchRange(a,15);
        System.out.println(Arrays.toString(index));
    }
}
