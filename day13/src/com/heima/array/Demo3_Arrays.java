package com.heima.array;

import java.util.Arrays;

public class Demo3_Arrays {

	public static void main(String[] args) {
		/*
		 * public static String toString(int[] arr)
		 * public static void sort(int[] arr)  排序
		 * public static int binarySearch(int[] arr, int key) 二分法找元素
		 * */
		int[] arr = {33, 55, 66, 77, 99, 22, 44, 11, 88};
		String str = Arrays.toString(arr);
		System.out.println(str);
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr, 55));
		
	}

}
