package com.heima.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
	/*
	 * A:案例演示
	 * 需求：算一下你来到这个世界多少天?
	 * */
	public static void main(String[] args) throws ParseException {
		String birthday = "1991-03-23";
		String day = "2020-04-08";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(birthday);
		Date d2 = sdf.parse(day);
		long time = d2.getTime() - d1.getTime();
		System.out.println(time / 1000 / 60 /60 / 24 / 365);
	}

}
