package com.cslp.ken.sample;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

  public static int[][] highFive(int[][] items) {
    HashMap<Integer, ArrayList> hashMap = new HashMap();
    ArrayList scores = new ArrayList();
    for (int i = 0; i < items.length; i++) {
      int key = items[i][0];
      if (hashMap.containsKey(key)) {
        scores = hashMap.get(key);
        scores.add(items[i][1]);
        hashMap.put(key, scores);
      } else {
        ArrayList first = new ArrayList();
        first.add(items[i][1]);
        hashMap.put(key, first);
      }

    }


//    ids = (Integer[])hashMap.keySet().toArray();
    for (Map.Entry entry : hashMap.entrySet()) {
      int i = (int) entry.getKey();
      ArrayList onescore = (ArrayList) entry.getValue();
//      System.out.println(Arrays.asList(onescore));
      onescore = (ArrayList) onescore.stream().sorted(Comparator.reverseOrder()).limit(5).collect(Collectors.toList());
      System.out.println(onescore);
      int sum = 0;
      for (int j = 0; j < onescore.size(); j++) {
        sum += (int) onescore.get(j);
      }
      System.out.println("id is: " + i);
      System.out.println("aveg is: " + sum / onescore.size());
    }

    return null;
  }

  public static void main(String[] args) {
    int[][] items = new int[][]{{1, 91}, {1, 92}, {2, 93}, {2, 97}, {1, 60}, {2, 77}, {1, 65}, {1, 87}, {1, 100}, {2, 100}, {2, 76}};
    highFive(items);
  }

}
