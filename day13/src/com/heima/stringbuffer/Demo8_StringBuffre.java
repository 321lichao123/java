package com.heima.stringbuffer;

public class Demo8_StringBuffre {

	public static void main(String[] args) {
		/*
		 * 形式参数问题
		 * 		string作为参数传递
		 * 		stringbuffer作为参数传递
		 * 案例演示
		 * 	String和StringBuffer分别作为参数传递问题
		 * String类型虽然是引用数据类型，但是他当做参数传递时和基本数据类型是一样的
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
