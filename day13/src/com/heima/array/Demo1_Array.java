package com.heima.array;

public class Demo1_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50, 20, 30, 25, 34, 12};
		arraySort(arr);
//		selectSort(arr);
	}
	// ð������	
	public static void arraySort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {			// ��ѭ��ֻ��Ҫ�Ƚ�arr.length - 1�ξͿ�����
			for (int j = 0; j < arr.length - 1 - i; j++) {	// -1Ϊ�˷�ֹ����Խ�磬-iΪ�����Ч��
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
	// ѡ������
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
	// ��λ����
	// ���ĳ������ֻ��Ա���ʹ�ã�������������ʹ�þͿ��Զ����˽�е�
	private static void wasp(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
