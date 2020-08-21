package com.cslp.ken.sample;

import java.util.*;
import java.util.stream.Collectors;

public class Sample {
  public static void main(String[] args) {
//    linkedHashMapDemo();
    linkedListDemo();
    hashMapDemo();
//    HashMap<Integer, ArrayList> hashMap = new HashMap();
//    ArrayList arrayList = new ArrayList();
//    hashMap.put(1, new ArrayList());
//    arrayList.add(10);
//    hashMap.put(1, arrayList);

//    LinkedHashMap<String, Integer> hashMap = new LinkedHashMap();
//    hashMap.put("c", 1);
//    hashMap.put("a", 2);
//    hashMap.put("y", 3);
//    hashMap.put("d", 4);
//    hashMap.forEach((k, v) -> {
//      System.out.println(k + " : " + v);
//    });

  }

  private static void linkedListDemo() {
    LinkedList linkedList = new LinkedList();
    linkedList.push("a");
    linkedList.push("b");
    linkedList.push("c");
    linkedList.push("d");
    linkedList.push("e");

    System.out.println(linkedList.peek());
    System.out.println(linkedList.getFirst());
    System.out.println(linkedList.peekLast());


    for (Object i :linkedList ) {
      System.out.print (i + " ");
    }
    System.out.println();
    linkedList.forEach(k -> System.out.print(k + " "));
    System.out.println();
  }

  private static void hashMapDemo() {
    HashMap<String, String> hashMap = new LinkedHashMap(16, 0.75F, true){
      @Override
      protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > 4;
      }
    };
    hashMap.put("a", "A");
    hashMap.put("d", "D");
    hashMap.put("b", "B");
    hashMap.put("c", "C");
    hashMap.put("e", "E");
    System.out.println("hashmap:");
    hashMap.forEach((k, v) -> System.out.println(k + ":" + v));

    hashMap.get("c");
    System.out.println("change order:");
    hashMap.forEach((k, v) -> System.out.println(k + ":" + v));
    System.out.println("keys:");
    hashMap.keySet().forEach(k -> System.out.print(k + " "));
  }

  private static void linkedHashMapDemo() {
    LinkedHashMap<String, String> accessOrderedMap = new LinkedHashMap<String, String>(16, 0.75F, true) {
      @Override
      protected boolean removeEldestEntry(Map.Entry<String, String> eldest) { // 实现自定义删除策略，否则行为就和普遍Map没有区别
        return size() > 3;
      }
    };
    accessOrderedMap.put("Project1", "Valhalla");
    accessOrderedMap.put("Project2", "Panama");
    accessOrderedMap.put("Project3", "Loom");

    accessOrderedMap.forEach((k, v) -> {
      System.out.println(k + ":" + v);
    });
    // 模拟访问
    accessOrderedMap.get("Project1");
    accessOrderedMap.get("Project1");
    accessOrderedMap.get("Project3");
    System.out.println("Iterate over should be not affected:");
    accessOrderedMap.forEach((k, v) -> {
      System.out.println(k + ":" + v);
    });
    // 触发删除
    accessOrderedMap.put("Project4", "Mission Control");
    System.out.println("Oldest entry should be removed:");
    accessOrderedMap.forEach((k, v) -> {// 遍历顺序不变
      System.out.println(k + ":" + v);
    });
  }
}
