package com.cslp.ken.sample.recursion;

public class Factorial {
  public int f(int n) {
    int target = 0;
    if (n <= 1) return 1;
    target = f(n -1) * n;
    return target;
  }

  public static void main(String[] args) {

  }
}
