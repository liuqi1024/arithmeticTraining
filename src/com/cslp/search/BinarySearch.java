package com.cslp.search;

import java.util.Arrays;
import java.util.TreeMap;

public class BinarySearch {

    //最简单的二分查找法
    public static int search(int[] a, int value){
        int length = a.length;

        int low = 0;
        int high = length - 1;

        while (low <= high) {
            int mid = low + (high - low)/2;
            if(value == a[mid]) {
                return mid;
            } else if(value < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    //查找第一个出现的给定值
    public static int bsearch1(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (a[mid] >= value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (low < n && a[low]==value) {
            return low;
        } else {
            return -1;
        }
    }

    //查找第一个出现的给定的值
    public static int bsearch2(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid =  low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if ((mid == 0) || (a[mid - 1] != value)) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    //查找最后一个出现的给定的值
    public static int bsearch3(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid =  low + ((high - low) >> 1);
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                if ((mid == high) || (a[mid + 1] != value)) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    //查找第一个大于等于给定值的值
    public static int bsearch4(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid =  low + ((high - low) >> 1);
            if (a[mid] >= value) {
                if (mid == 0 || a[mid-1] < value) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    //查找最后个小于等于给定值的值
    public static int bsearch5(int[] a, int n, int value) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid =  low + ((high - low) >> 1);
            if (a[mid] <= value) {
                if (mid == high || a[mid+1] > value) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[]{6, 7, 12, 15, 15, 15, 15, 18, 20, 34, 66};
//        int index =  search(a, 20);
        int index =  bsearch5(a, a.length, 14);
        System.out.println(index);

        new TreeMap<>().lowerKey(a);
        new TreeMap<>().ceilingKey(a);
    }

}
