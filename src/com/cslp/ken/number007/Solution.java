package com.cslp.ken.number007;

public class Solution {

    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            if (result < Integer.MIN_VALUE / 10 || result > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int a = x%10;
            x = x/10;
            result = (result * 10 + a);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE / 10);
        System.out.println(s.reverse(2123456789));
        System.out.println(s.reverse(214748365));
    }
}
