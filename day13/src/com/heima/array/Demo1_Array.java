package com.heima.array;

public class Demo1_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50, 20, 30, 25, 34, 12};
		arraySort(arr);
//		selectSort(arr);
	}
	// 冒泡排序	
	public static void arraySort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {			// 外循环只需要比较arr.length - 1次就可以了
			for (int j = 0; j < arr.length - 1 - i; j++) {	// -1为了防止索引越界，-i为了提高效率
				if (arr[j] > arr[j + 1]) {
					wasp(arr, i, j + 1);
				}
			}
		}
		printArray(arr);
	}
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	// 选择排序
	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					wasp(arr, i, j);
				}
			}
		}
		printArray(arr);
	}
	// 换位操作
	// 如果某个方法只针对本类使用，不想让其他类使用就可以定义成私有的
	private static void wasp(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
