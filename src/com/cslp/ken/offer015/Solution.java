package com.cslp.ken.offer015;

public class Solution {
    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0) {
            result += n & 1;
            n >>>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().hammingWeight(00000000000000000000000000001011));
    }
}
