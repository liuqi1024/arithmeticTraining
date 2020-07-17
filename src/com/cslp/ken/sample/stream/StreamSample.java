package com.cslp.ken.sample.stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSample {
  public static void main(String[] args) {
    String[] words = new String[]{"Hello","World"};
    Arrays.stream(words).map(word -> word.split(""))
      .forEach(strings -> System.out.println(Arrays.toString(strings)));

    Arrays.stream(words).filter(s -> s != null).map(word -> word.split(""))
      .flatMap(Arrays::stream)
      .sorted(Comparator.comparing(String::toString).reversed())
      .forEach(s -> System.out.print(s));
  }

  private static void demo2() {
    //使用一个容器装载100个数字，通过Stream并行处理的方式将容器中为单数的数字转移到容器parallelList
    List<Integer> integerList= new ArrayList<Integer>();

    for (int i = 0; i <20; i++) {
      integerList.add(i);
    }

    List<Integer> parallelList = new ArrayList<Integer>() ;

//    integerList.stream().filter(i -> i % 2 == 1).forEach(i -> parallelList.add(i));
    parallelList = integerList.stream().filter(i -> i % 2 == 1).collect(Collectors.toList());

    System.out.println(parallelList.toString());
    System.out.println(integerList.toString());

//    integerList.stream()
//      .parallel()
//      .filter(i->i%2==1)
//      .forEach(i->parallelList.add(i));
  }

  private static void demo() {
    ArrayList<String> list = new ArrayList();
    list.add("hello");
    list.add("world");
    list.add("ken");
    list.add("liu");
    list.add("cslp");


    list.stream().filter(s -> s.length() > 3).collect(Collectors.toList());
    ArrayList temp  = (ArrayList)list.stream().map(s -> s.toUpperCase() + "d")
      .map(String::toUpperCase)
      .collect(Collectors.toList());
    System.out.println(temp);
  }
}


//  Map<String, List<Student>> stuMap = stuList.stream()
//    .filter((Student s) -> s.getHeight() > 160)
//    .collect(Collectors.groupingBy(Student ::getSex));