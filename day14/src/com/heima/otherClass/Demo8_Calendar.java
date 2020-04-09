package com.heima.otherClass;

import java.util.Calendar;

public class Demo8_Calendar {
	/*
	 * * A:Calendar��ĸ���
			* Calendar ����һ�������࣬��Ϊ�ض�˲����һ������ YEAR��MONTH��DAY_OF_MONTH��HOUR �������ֶ�֮���ת���ṩ��һЩ��������Ϊ���������ֶΣ������������ڵ����ڣ��ṩ��һЩ������
		* B:��Ա����
			* public static Calendar getInstance()
			* public int get(int field)
	 * */
	public static void main(String[] args) {
		// demo1();
		Calendar c = Calendar.getInstance();	// ��������ָ���������
		
//		c.add(Calendar.YEAR, 1);				// ��ָ�����ֶν�����ǰ������
//		c.add(Calendar.YEAR, -1);
//		c.set(Calendar.YEAR, 1991);				// ��ָ���ֶ��޸�
		c.set(1991, 2, 23);
		
		System.out.println(c.get(Calendar.YEAR) + "��" + getNum(c.get(Calendar.MONTH)) + "��" + getNum(c.get(Calendar.DAY_OF_MONTH)) + "��" + getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}

	private static void demo1() {
		Calendar c = Calendar.getInstance();	// ��������ָ���������
//		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));	// ��
		System.out.println(c.get(Calendar.MONTH));	// ��
		System.out.println(c.get(Calendar.DAY_OF_MONTH));	// ���еڼ���
		System.out.println(c.get(Calendar.DAY_OF_WEEK));	// �����ǵ�һ�죬���������һ��
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(getWeek(week));
		System.out.println(c.get(Calendar.YEAR) + "��" + getNum(c.get(Calendar.MONTH)) + "��" + getNum(c.get(Calendar.DAY_OF_MONTH)) + "��" + getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}
	
	public static String getWeek(int week) {
		String[] arr = {"", "������", "����һ", "���ڶ�", "������", "������", "������", "������"};
		return arr[week];
	}
	
	public static String getNum(int num) {
		return num > 9 ? "" + num : "0" + num;
	}

}
