package com.heima.test;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {
	/*
	 * A:案例演示
	 * 需求：键盘录入任意一个年份，判断该年是闰年还是平年
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int year = Integer.parseInt(str);
		
		boolean b = getYear(year);
		if (b) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "是平年");
		}
	}

	private static boolean getYear(int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		return c.get(Calendar.DAY_OF_MONTH) == 29;
	}

}
