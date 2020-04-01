package com.heima.scanner;

import java.util.Scanner;

public class Demo1_Scanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	//键盘录入
		if (sc.hasNextInt()) {			
			int i = sc.nextInt();
			System.out.println(i);
		} else {
			System.out.println("请输入正整数");
		}
	}

}
