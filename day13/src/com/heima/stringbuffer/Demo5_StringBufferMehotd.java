package com.heima.stringbuffer;

public class Demo5_StringBufferMehotd {

	public static void main(String[] args) {
		/*
		 * public String substring(int start): 从指定位置截取到末尾
		 * public String substring(int start, int end):截取从指定位置开始到结束位置，包括开始位置不包括结束位置
		 * */
		StringBuffer sb = new StringBuffer("woaiheima");
		String str = sb.substring(4);
		System.out.println(str);
		String str2 = sb.substring(4, 7);
		System.out.println(str2);
	}

}
