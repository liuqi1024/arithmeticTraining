package com.cslp.ken.offer085;

import javax.lang.model.element.VariableElement;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        int level;
        // terminal

        // process

        //drill down
        generate(n, n, "", result);


        //reverse status

        return result;
    }

    private void generate( int left, int right, String sb, List<String> result) {
        if(left>right) {
            return;
        }

        if(left ==0 && right == 0) {
            result.add(sb);
        }

        if (left > 0) {
            generate(left -1, right, sb + "(",  result);
        }

        if (right > 0) {
            generate(left, right - 1, sb + ")",  result);
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> list = solution.generateParenthesis(3);
        System.out.println(list.toString());
    }
}
