package com.cslp.ken.number729;

import java.util.TreeMap;

class Solution {
  TreeMap<Integer, Integer> calendar;

  Solution() {
    calendar = new TreeMap();
  }

  public boolean book(int start, int end) {
    Integer prev = calendar.floorKey(start),
      next = calendar.ceilingKey(start);
    if ((prev == null || calendar.get(prev) <= start) &&
      (next == null || end <= next)) {
      calendar.put(start, end);
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Solution myCalendar = new Solution();
    TreeMap<Integer, Integer> treeMap = myCalendar.calendar;
    treeMap.put(10,20);
    treeMap.put(30,50);
    treeMap.put(70,90);
    treeMap.put(60,65);

    System.out.println(treeMap.ceilingKey(5)); //10
    System.out.println(treeMap.ceilingKey(75)); //null
    System.out.println(treeMap.floorKey(5)); //null
    System.out.println(treeMap.floorKey(75)); //70
    System.out.println(treeMap.ceilingKey(35)); //60
    System.out.println(treeMap.floorKey(35)); //30

  }

}

