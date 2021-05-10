package com.cslp.ken.number146;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  HashMap<Integer, Integer> map = new HashMap();

  public Solution(int capacity) {

  }

  public int get(int key) {

    return map.get(key);
  }

  public void put(int key, int value) {
    map.put(key, value);

  }


}
