package com.heima.stringbuffer;

public class Demo6_StringBufferMehotd {

	public static void main(String[] args) {
		/*
		 * string --> StringBuffer
		 * 		a��ͨ�����췽��
		 * 		b��ͨ��append()����
		 * StringBuffer --> String
		 * 		a��ͨ�����췽��
		 * 		b��ͨ��toString()����
		 * 		c��ͨ��substring(0, length)
		 * */
		// demo1();
		demo2();
	}

	private static void demo2() {
		// StringBuffer --> String
		StringBuffer sb = new StringBuffer("heima");
		String s1 = new String(sb); 	// ͨ�����췽��
		System.out.println(s1);
		String s2 = sb.toString();		// ͨ��toString()����
		System.out.println(s2);
		String s3 = sb.substring(0, sb.length()); // ͨ��substring(0, length)
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
