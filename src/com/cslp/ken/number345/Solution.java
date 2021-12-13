package com.cslp.ken.number345;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String reverseVowels(String s) {
        String[] split = s.split("");
        String yuanyin = "";

        for (int i = 0; i < split.length; i++) {
            String s1 = split[i];
            if ("aeiouAEIOU".contains(s1)) {
                yuanyin = yuanyin + s1;
                split[i] = "$";
            }
        }

        String[] split1 = new StringBuffer(yuanyin).reverse().toString().split("");
        int len = 0;
        for (int i = 0; i < split.length; i++) {
            String s1 = split[i];
            if (s1.equals("$")) {
                split[i] = split1[len++];
            }
        }

        String result = "";
        for (int i = 0; i < split.length; i++) {
            result += split[i];
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "aA";
        Solution solution = new Solution();
        String result = solution.reverseVowels(s);
        System.out.println(result);
    }
}
