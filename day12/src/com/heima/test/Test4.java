package com.heima.test;

public class Test4 {

	/**
	 * 案例演示
	* 需求：把一个字符串的首字母转成大写，其余为小写。(只考虑英文大小写字母字符)
	* 链式编程只要每次调用返回的的是对象就可以继续调用
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "dandanAIxiaolanzhu";
		String s2 = s1.substring(0, 1).toUpperCase().concat(s1.substring(1).toLowerCase());
		System.out.println(s2);
	}

}
