package com.heima.regex;

public class Demo5_ReplaceAll {
	/*
	 * A:������ʽ���滻����
		* String��Ĺ��ܣ�public String replaceAll(String regex,String replacement)
	* B:������ʾ
		* ������ʽ���滻����
	 * */
	public static void main(String[] args) {
		String str = "woai3h4eima";
		String regex = "\\d";
		String str2 = str.replaceAll(regex, "");
		System.out.println(str2);
	}

}
