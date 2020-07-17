package com.cslp.ken.number009;

//回文数
public class Solution {
  public boolean isPalindrome(int x) {
    int reverse = 0;
    if (x < 0 || (x % 10 == 0 && x != 0)) {
      return false;
    }
    while (x > reverse) {
      int m = x % 10;
      x = x / 10;
      reverse = reverse * 10 + m;
    }
    return x == reverse || x == reverse / 10;
  }

  public static void main(String[] args) {
    int x = 8;
    System.out.println(new Solution().isPalindrome(x));
  }
}
