package com.heima.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo8_Psttern {
	/*
	 * * ���͵ĵ���˳���� 
		* Pattern p = Pattern.compile("a*b");
		* Matcher m = p.matcher("aaaaab");
		* boolean b = m.matches();
	 * */
	public static void main(String[] args) {
		// demo1();
		// ���󣺰�һ���ַ����е��ֻ������ȡ����
		String str = "�ҵ��ֻ�������15755135890,֮ǰʹ�õ���18255668290�������ù�185888888888";
		String reg = "1[3578]\\d{9}";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(str);  // ��ʹ��find֮ǰҪ����matcher����
		while(m.find())
			System.out.println(m.group());
	}

	private static void demo1() {
		Pattern p = Pattern.compile("a*b");		// ��ȡ��������ʽ
		Matcher m = p.matcher("aaaaab");		// ��ȡƥ����
		boolean b = m.matches();				// ���Ƿ���ƥ�䵽��ƥ�䵽�ͷ���true
		
		System.out.println(b);
		
//		����Ĳ����൱������
		System.out.println("aaaab".matches("a*b"));
	}

}
