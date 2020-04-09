package com.heima.otherClass;

import java.util.Calendar;

public class Demo8_Calendar {
	/*
	 * * A:Calendar类的概述
			* Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。
		* B:成员方法
			* public static Calendar getInstance()
			* public int get(int field)
	 * */
	public static void main(String[] args) {
		// demo1();
		Calendar c = Calendar.getInstance();	// 父类引用指向子类对象
		
//		c.add(Calendar.YEAR, 1);				// 对指定的字段进行向前减向后加
//		c.add(Calendar.YEAR, -1);
//		c.set(Calendar.YEAR, 1991);				// 对指定字段修改
		c.set(1991, 2, 23);
		
		System.out.println(c.get(Calendar.YEAR) + "年" + getNum(c.get(Calendar.MONTH)) + "月" + getNum(c.get(Calendar.DAY_OF_MONTH)) + "天" + getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}

	private static void demo1() {
		Calendar c = Calendar.getInstance();	// 父类引用指向子类对象
//		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));	// 年
		System.out.println(c.get(Calendar.MONTH));	// 月
		System.out.println(c.get(Calendar.DAY_OF_MONTH));	// 月中第几天
		System.out.println(c.get(Calendar.DAY_OF_WEEK));	// 周日是第一天，周六是最后一天
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(getWeek(week));
		System.out.println(c.get(Calendar.YEAR) + "年" + getNum(c.get(Calendar.MONTH)) + "月" + getNum(c.get(Calendar.DAY_OF_MONTH)) + "天" + getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}
	
	public static String getWeek(int week) {
		String[] arr = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
		return arr[week];
	}
	
	public static String getNum(int num) {
		return num > 9 ? "" + num : "0" + num;
	}

}
