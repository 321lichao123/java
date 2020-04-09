package com.heima.otherClass;

import java.util.Date;

public class Demo6_Date {
	/*
	 * * A:Date类的概述
			* 类 Date 表示特定的瞬间，精确到毫秒。 
			* 是util下面的包，不能导入sql包的
		* B:构造方法
			* public Date()
			* public Date(long date)
		* C:成员方法
			* public long getTime()
			* public void setTime(long time)
	 * */
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		
		Date d2 = new Date(0);
		System.out.println(d2);
	}

}
