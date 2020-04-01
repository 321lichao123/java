package com.heima.test;

import java.util.Scanner;

public class Test6 {

	/**
	 * 案例演示
	* 需求：把字符串反转
		* 举例：键盘录入"abc"		
		* 输出结果："cba"
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符");
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		String s1 = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			s1 += arr[i];
		}
		System.out.println(s1);
	}

}
