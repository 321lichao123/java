package com.heima.test;

import java.util.Scanner;

public class Test6 {

	/**
	 * ������ʾ
	* ���󣺰��ַ�����ת
		* ����������¼��"abc"		
		* ��������"cba"
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�");
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		String s1 = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			s1 += arr[i];
		}
		System.out.println(s1);
	}

}
