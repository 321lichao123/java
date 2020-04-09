package com.heima.regex;

public class Demo5_ReplaceAll {
	/*
	 * A:正则表达式的替换功能
		* String类的功能：public String replaceAll(String regex,String replacement)
	* B:案例演示
		* 正则表达式的替换功能
	 * */
	public static void main(String[] args) {
		String str = "woai3h4eima";
		String regex = "\\d";
		String str2 = str.replaceAll(regex, "");
		System.out.println(str2);
	}

}
