package com.heima.stringbuffer;

public class Demo4_StringBufferMethod {

	public static void main(String[] args) {
		/*
		 * public StringBuffer replace(int start, int end, String str): 从start开始到end结束用str替换
		 * public StringBuffer reverse():字符串反转
		 * */
		StringBuffer sb = new StringBuffer("heima");
		sb.replace(0, 3, "bai");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
