package com.cslp.ken.sample.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Fibonacci {

  private HashMap<Integer, Integer> hashMap = new HashMap();

  public int f(int n) {
    int nums = 0;
    if (n <= 0) return 0;
    if (n == 1) return 1;
    if (hashMap.containsKey(n)) {
      return (int)hashMap.get(n);
    }

    nums = f(n - 2) + f(n - 1);
    hashMap.put(n, nums);
    return nums;
  }

  public int fib(int n, int[] memo) {
    if (n <= 1) {
      return n;
    }
    if (memo[n] == 0) {
      memo[n] = fib(n - 1, memo) + fib(n - 2, memo);
    }
    return memo[n];
  }


  public int dp(int n) {
    int[] res = new int[n+1];
    res[0] = 0;
    res[1] = 1;
    for (int i = 2; i <= n; i++) {
      res[i] = res[i-2] + res[i-1];
    }
    return res[n];
  }

  public static void main(String[] args) {
    long t = System.currentTimeMillis();
    int n = 6;
    int[] memo = new int[n+1];
    Fibonacci fibonacci = new Fibonacci();
    System.out.println(fibonacci.f(n));
    System.out.println(fibonacci.fib(n, memo));
    System.out.println(fibonacci.dp(n));
    System.out.println(System.currentTimeMillis() - t);

  }
}
