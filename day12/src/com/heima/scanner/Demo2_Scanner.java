package com.heima.scanner;

import java.util.Scanner;


public class Demo2_Scanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个正整数:");
		int a = sc.nextInt();
		System.out.println("请输入第二个正整数:");
		int b = sc.nextInt();
		System.out.println("两个正整数和是：" + (a + b));
		System.out.println();*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入姓：");
		String str1 = sc.nextLine();
		System.out.println("请输入名：");
		String str2 = sc.nextLine();
		System.out.println("完整的名字是："+(str1+str2));
		
	}

}
