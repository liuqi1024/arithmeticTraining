package com.cslp.ken.sample.error;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListErrorSample {

  private static List<List<Integer>> data = new ArrayList<>();

  private static void oom() {
    for (int i = 0; i < 1000; i++) {
      List<Integer> rawList = IntStream.rangeClosed(1, 1000000).boxed().collect(Collectors.toList());
      data.add(rawList.subList(0, 1));
    }
  }

  public static void main(String[] args) {
    oom();
  }

}
