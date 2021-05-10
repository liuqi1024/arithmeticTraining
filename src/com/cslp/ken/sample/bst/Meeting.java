package com.cslp.ken.sample.bst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Meeting {
  public static void main(String[] args) {
    List<int[]> list = new ArrayList();
    list.add(new int[]{1, 3});
    list.add(new int[]{7, 8});

    add(list, new int[]{9, 11});
    add(list, new int[]{2, 4});
    add(list, new int[]{5, 6});
    list.stream().forEach((int[] a ) -> System.out.println(Arrays.toString(a)));
  }

  public static void add(List<int[]> list, int[] target) {
    for (int[] a : list) {
      int start = a[0];
      int end = a[1];
      if (end > target[0] && start > target[1]) {
        System.out.println("error.." + start + " " + end);
        return;
      }
    }
    list.add(target);
  }
}
