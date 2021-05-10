package com.cslp.ken.sample.recursion;

import java.util.HashMap;
import java.util.Map;

public class Sample {
  Map nValues = new HashMap();

  public static void main(String[] args) {
    Sample sample = new Sample();
    long result = sample.fibonacci(45);
    System.out.println(result);
  }

  long fibonacci(int n) {
    long result = 0;
    if (n <= 1) {
      return n;
    }
    if (nValues.containsKey(n)) {
      return (long)nValues.get(n);
    }

    result = fibonacci(n - 2 ) + fibonacci(n - 1);
    nValues.put(n, result);
    return result;

//    return fibonacci(n - 2 ) + fibonacci(n - 1);

  }

}
