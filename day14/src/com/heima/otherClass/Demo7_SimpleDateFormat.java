package com.heima.otherClass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo7_SimpleDateFormat {
	/*
	 * * A:DateFormat��ĸ���
			* DateFormat ������/ʱ���ʽ������ĳ����࣬�����������޹صķ�ʽ��ʽ�����������ڻ�ʱ�䡣�ǳ����࣬����ʹ��������SimpleDateFormat
		* B:SimpleDateFormat���췽��
			* public SimpleDateFormat()
			* public SimpleDateFormat(String pattern)
		* C:��Ա����
			* public final String format(Date date)
			* public Date parse(String source)
	 * */
	public static void main(String[] args) throws ParseException {  // throws ParseException�׳��쳣 ctrl + t 
		// demo1();
		// demo2();
		// demo3();
		demo4();
	}

	private static void demo4() throws ParseException {
		// ��ʱ���ַ���װάʱ�����		
		String str = "2020-04-08 16:23:17";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d = sdf.parse(str);
		System.out.println(d);
	}

	private static void demo3() {
		Date d = new Date();		// ��ȡʱ�����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// �������ڸ�ʽ�������
		System.out.println(sdf.format(d));	// �����ڶ���תΪ�ַ���
	}

	private static void demo2() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(d));
	}

	private static void demo1() {
		// DateFormat df = new DateFormat();  // ����Cannot instantiate the type DateFormat Ҳ����DateFormat�ǳ����಻����ʵ����
		// DateFormat df = new SimpleDateFormat
		DateFormat df = DateFormat.getDateInstance();	// �൱�ڸ�������ָ����������ұߵķ�������һ������
	}

}
