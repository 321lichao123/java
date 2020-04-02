package com.heima.stringbuffer;

public class Demo6_StringBufferMehotd {

	public static void main(String[] args) {
		/*
		 * string --> StringBuffer
		 * 		a、通过构造方法
		 * 		b、通过append()方法
		 * StringBuffer --> String
		 * 		a、通过构造方法
		 * 		b、通过toString()方法
		 * 		c、通过substring(0, length)
		 * */
		// demo1();
		demo2();
	}

	private static void demo2() {
		// StringBuffer --> String
		StringBuffer sb = new StringBuffer("heima");
		String s1 = new String(sb); 	// 通过构造方法
		System.out.println(s1);
		String s2 = sb.toString();		// 通过toString()方法
		System.out.println(s2);
		String s3 = sb.substring(0, sb.length()); // 通过substring(0, length)
		System.out.println(s3);
	}

	private static void demo1() {
		// String --> StringBuffer
		StringBuffer sb1 = new StringBuffer("heima1");
		System.out.println(sb1);
		StringBuffer sb2 = new StringBuffer();
		sb2.append("heima2");
		System.out.println(sb2);
	}

}
