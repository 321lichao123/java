package com.heima.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo8_Psttern {
	/*
	 * * 典型的调用顺序是 
		* Pattern p = Pattern.compile("a*b");
		* Matcher m = p.matcher("aaaaab");
		* boolean b = m.matches();
	 * */
	public static void main(String[] args) {
		// demo1();
		// 需求：把一个字符串中的手机号码获取出来
		String str = "我的手机号码是15755135890,之前使用的是18255668290，还是用过185888888888";
		String reg = "1[3578]\\d{9}";
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(str);  // 再使用find之前要是用matcher方法
		while(m.find())
			System.out.println(m.group());
	}

	private static void demo1() {
		Pattern p = Pattern.compile("a*b");		// 获取到正则表达式
		Matcher m = p.matcher("aaaaab");		// 获取匹配器
		boolean b = m.matches();				// 看是否能匹配到，匹配到就返回true
		
		System.out.println(b);
		
//		上面的操作相当于下面
		System.out.println("aaaab".matches("a*b"));
	}

}
