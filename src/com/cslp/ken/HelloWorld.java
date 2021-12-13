/**
 * 
 */
package com.cslp.ken;

import sun.net.util.IPAddressUtil;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author liuqi
 *
 */
public class HelloWorld {

	public static long ipToLong(String strIp) {
		String[]ip = strIp.split("\\.");
		return (Long.parseLong(ip[0]) << 24) + (Long.parseLong(ip[1]) << 16) + (Long.parseLong(ip[2]) << 8) + Long.parseLong(ip[3]);
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr1 = {1, 2, 3};
		List list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
		Arrays.stream(arr1).boxed().collect(Collectors.toList());


		Integer[] arr2 = {1, 2, 3};
		List list2 = Arrays.asList(arr2);

		List<String> list = Arrays.asList("java", "python", "C++","php","java");
		list.stream().collect(Collectors.toList());
		list.forEach(System.out::println);

		Optional.ofNullable(arr1).orElse(arr1);
	}

}






