package com.heima.stringbuffer;

public class Demo4_StringBufferMethod {

	public static void main(String[] args) {
		/*
		 * public StringBuffer replace(int start, int end, String str): ��start��ʼ��end������str�滻
		 * public StringBuffer reverse():�ַ�����ת
		 * */
		StringBuffer sb = new StringBuffer("heima");
		sb.replace(0, 3, "bai");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
