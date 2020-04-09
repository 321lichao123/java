package com.heima.otherClass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo7_SimpleDateFormat {
	/*
	 * * A:DateFormat类的概述
			* DateFormat 是日期/时间格式化子类的抽象类，它以与语言无关的方式格式化并解析日期或时间。是抽象类，所以使用其子类SimpleDateFormat
		* B:SimpleDateFormat构造方法
			* public SimpleDateFormat()
			* public SimpleDateFormat(String pattern)
		* C:成员方法
			* public final String format(Date date)
			* public Date parse(String source)
	 * */
	public static void main(String[] args) throws ParseException {  // throws ParseException抛出异常 ctrl + t 
		// demo1();
		// demo2();
		// demo3();
		demo4();
	}

	private static void demo4() throws ParseException {
		// 将时间字符串装维时间对象		
		String str = "2020-04-08 16:23:17";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(str);
		System.out.println(d);
	}

	private static void demo3() {
		Date d = new Date();		// 获取时间对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 创建日期格式化类对象
		System.out.println(sdf.format(d));	// 将日期对象转为字符串
	}

	private static void demo2() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(d));
	}

	private static void demo1() {
		// DateFormat df = new DateFormat();  // 报错Cannot instantiate the type DateFormat 也就是DateFormat是抽象类不允许实例化
		// DateFormat df = new SimpleDateFormat
		DateFormat df = DateFormat.getDateInstance();	// 相当于父类引用指向子类对象，右边的方法返回一个子类
	}

}
