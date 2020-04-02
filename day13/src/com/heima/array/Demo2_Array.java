package com.heima.array;

public class Demo2_Array {
	
	/*
	 * 数组高级二分查找代码
	 * 二分法查找元素前提是数组按照顺序 
	 * */
	public static void main(String[] args) {
		int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
		int index = getIndex(arr, 66);
		System.out.println(index);
	}
	
	public static int getIndex(int[] arr, int value) {
		int min = 0;
		int max = arr.length - 1;
		int mid = (min + max) / 2;
		while(arr[mid] != value) {
			if (arr[mid] > value) {
				max = mid - 1;
			} else if (arr[mid] < value) {
				min = mid + 1;
			}
			mid = (max + min) / 2;
			
			if (min > max) {
				return -1;
			}
		}
		return mid;
	}

}
