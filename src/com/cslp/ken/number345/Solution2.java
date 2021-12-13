package com.cslp.ken.number345;

public class Solution2 {
    public String reverseVowels(String s) {
        int length = s.length();
        char[] arr = s.toCharArray();
        int i = 0, j = length -1;
        while (i < j) {
            while (i < length && !isVowel(arr[i])) {
                i++;
            }
            while (j > 0 && !isVowel(arr[j])) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
                i++;
                j--;
            }

        }
        return new String(arr);
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) >= 0;
    }


    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



    public static void main(String[] args) {
        String s = "hello";
        Solution2 solution = new Solution2();
        String result = solution.reverseVowels(s);
        System.out.println(result);
    }
}
