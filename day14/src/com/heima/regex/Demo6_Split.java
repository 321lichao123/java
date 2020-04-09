package com.heima.regex;

public class Demo6_Split {
	/*
	 * A:正则表达式的分割功能
		* String类的功能：public String[] split(String regex) 将此字符串分割为给定的 regular expression的匹配。 
	* B:案例演示
		* 正则表达式的分割功能
	 * */
	public static void main(String[] args) {
		String s = "金三胖.郭美美.李dayone";
		String[] arr = s.split("\\.");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
