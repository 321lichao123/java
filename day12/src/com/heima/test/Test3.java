package com.heima.test;

public class Test3 {

	/**
	 * 案例演示
	* 需求：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数,其他字符出现的次数。
	* ABCDEabcd123456!@#$%^
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCDEabcd123456!@#$%^";
		int big = 0;
		int samll = 0;
		int num = 0;
		int other = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				big++;
			} else if (c >= 'a' && c <= 'z') {
				samll++;
			} else if (c >= '0' && c <= '9') {
				num++;
			} else {
				other++;
			}
		}
		System.out.println(big);
		System.out.println(samll);
		System.out.println(num);
		System.out.println(other);
	}

}
