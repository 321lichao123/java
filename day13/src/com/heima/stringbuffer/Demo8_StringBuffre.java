package com.heima.stringbuffer;

public class Demo8_StringBuffre {

	public static void main(String[] args) {
		/*
		 * ��ʽ��������
		 * 		string��Ϊ��������
		 * 		stringbuffer��Ϊ��������
		 * ������ʾ
		 * 	String��StringBuffer�ֱ���Ϊ������������
		 * String������Ȼ�������������ͣ�������������������ʱ�ͻ�������������һ����
		 * */
		String s = "heima";
		System.out.println(s);
		change(s);
		System.out.println(s);
		
		System.out.println("------------");
		
		StringBuffer sb = new StringBuffer();
		sb.append("heima");
		System.out.println(sb);
		change(sb);
		System.out.println(sb);
		
	}

	private static void change(StringBuffer sb) {
		sb.append("itcase");
	}

	public static void change(String s) {
		 s += "itcase";
	}

}
