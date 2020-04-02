package com.heima.stringbuffer;

public class Demo1_StringBuffer {

	public static void main(String[] args) {
		/*
		 * 1、stringbuffer与string的区别：
		 * 		String是一个不可变的字符序列
		 * 		StringBuffer是一个可变的字符序列
		 * 2、StringBuffer的构造方法
		 * 		public StringBuffer():无参构造方法 初始容量16个字符
		 * 		public StringBuffer(int capacity):指定容量的字符串缓冲区独享
		 * 		public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
		 * 3、StringBuffer的方法
		 * 		public int capacity(): 返回当前容量  理论值
		 * 		public int length(): 返回长度   实际值
		 * */
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());		// 实际值
		System.out.println(sb.capacity());
		
		StringBuffer sb2 = new StringBuffer(10);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		StringBuffer sb3 = new StringBuffer("heima");
		System.out.println(sb3.length());		
		System.out.println(sb3.capacity());		// 实际值加上初始值
	}

}
