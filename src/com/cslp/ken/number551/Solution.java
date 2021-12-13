package com.cslp.ken.number551;

import java.lang.reflect.Array;

public class Solution {

    public boolean checkRecord(String s) {
        String a = "A";
        String l = "LLL";
        int count = 0;
        if (s.contains(l)) {
            return false;
        }
        String[] array = s.split("");
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("A")) {
                count++;
            }
        }
        if (count >= 2) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "PPALLL";
        Solution solution = new Solution();
        System.out.println(solution.checkRecord(s));;
    }
}
