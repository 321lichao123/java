package com.heima.regex;

public class Demo1_Regex {
	/*
	 * 需求：校验qq号码.
		* 1:要求必须是5-15位数字
		* 2:0不能开头
		* 3:必须都是数字
		
		* a:非正则表达式实现
		* b:正则表达式实现
	 * */
	public static void main(String[] args) {
		System.out.println(checkQQ("123456"));
		System.out.println(checkQQ("1234a56"));
		System.out.println(checkQQ("0123456"));
		
		String regex = "[1-9]\\d{4,14}";
		System.out.println("123456777".matches(regex));
		System.out.println("1234a56".matches(regex));
	}
	// 校验QQ号码
	public static boolean checkQQ(String qq) {
		boolean flag = true;
		if (qq.length() >= 5 && qq.length() <= 15) {
			if (!qq.startsWith("0")) {
				char[] arr = qq.toCharArray();
				for (int i = 0; i < arr.length; i++) {
					char str = arr[i];
					if (!(str >= '0' && str <= '9')) {
						flag = false;
						break;
					}
				}
			} else {
				flag = false;
			}
		} else {
			flag = false;
		}
		return flag;
	}
}
