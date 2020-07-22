package com.cslp.ken.sample.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Fibonacci {

  private HashMap<Integer, Integer> hashMap = new HashMap();

  public int f(int n) {
    int nums = 0;
    if (n <= 1) return 1;
    if (n == 2) return 1;
//    if (hashMap.containsKey(n)) {
//      return (int)hashMap.get(n);
//    }

    nums = f(n - 1) + f(n -2);
    hashMap.put(n, nums);
    return nums;
  }

  public static void main(String[] args) {
    List list = new ArrayList();
    list.subList(0,1);

    long t = System.currentTimeMillis();
    Fibonacci fibonacci = new Fibonacci();
    System.out.println(fibonacci.f(45));
    System.out.println(System.currentTimeMillis() - t);

  }
}
