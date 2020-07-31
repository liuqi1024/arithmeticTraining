package com.cslp.ken.sample.bst;

public class Solution {
  public int loopFirstEqualSqrt(int[] data, int value){
    int start = 0;
    int end = data.length - 1;
    int mid = -1;
    while (start <= end){
      mid = start + ((end - start)>>1);
      if (data[0] > data[mid]){
        if (data[mid] <= value && data[data.length - 1] >= value){
          start = mid;
          break;
        }
        end = mid -1;
      }else{
        if (data[0] <= value && data[mid] >= value){
          end = mid;
          break;
        }
        start = mid + 1;
      }
    }
    while (start <= end){
      mid = start + ((end - start)>>1);
      if (data[mid] < value)
        start = mid + 1;
      else if(data[mid] > value)
        end = mid - 1;
      else {
        if(mid==0||data[mid-1]!=value)return mid;
        end = mid -1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] a = new int[]{4, 5, 6, 7, 0, 1, 2};
    Solution solution = new Solution();
    System.out.println(solution.loopFirstEqualSqrt(a, 6));
  }
}
