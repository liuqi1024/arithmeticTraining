package com.cslp.ken.number394;

import java.util.Stack;

public class Solution_2nd {
  public static String decodeString(String s) {
    StringBuffer ans = new StringBuffer();
    Stack<Integer> multiStack = new Stack<>();
    Stack<StringBuffer> ansStack = new Stack<>();

    int multi = 0;
    for (char c : s.toCharArray()) {
      if (Character.isDigit(c)) {
        multi = multi * 10 + c - '0';
      } else if (c == '[') {
        ansStack.add(ans);
        multiStack.add(multi);
        ans = new StringBuffer();
        multi = 0;
      } else if (Character.isAlphabetic(c)) {
        ans.append(c);
      } else {
        StringBuffer ansTmp = ansStack.pop();
        int tmp = multiStack.pop();
        for (int i = 0; i < tmp; i++) ansTmp.append(ans);
        ans = ansTmp;
      }
    }
    return ans.toString();
  }

  public static void main(String[] args) {
//    String s = "ab2[ca]de";
    String s = "ab2[ca2[rt]]de";
    System.out.println(decodeString(s));
//    System.out.println(decodeString("ab2[ca2[rt]]de"));

  }
}
