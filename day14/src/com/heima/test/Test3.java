package com.heima.test;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {
	/*
	 * A:������ʾ
	 * ���󣺼���¼������һ����ݣ��жϸ��������껹��ƽ��
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int year = Integer.parseInt(str);
		
		boolean b = getYear(year);
		if (b) {
			System.out.println(year + "������");
		} else {
			System.out.println(year + "��ƽ��");
		}
	}

	private static boolean getYear(int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		return c.get(Calendar.DAY_OF_MONTH) == 29;
	}

}
