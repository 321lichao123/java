package com.heima.test;

public class Test5 {

	/**
	 * ������ʾ
	* ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
		* ������
			* int[] arr = {1,2,3};	
		* ��������
			* "[1, 2, 3]"
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3};
		String s = "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				s += arr[i] + "]";
			} else {
				s += arr[i] + ", ";
			}
		}
		System.out.println(s);
	}

}
