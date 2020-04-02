package com.heima.stringbuffer;

public class Demo2_StringBuffer {

	public static void main(String[] args) {
//		demo1();
//		demo2();
		StringBuffer sb = new StringBuffer("1234");
		sb.insert(3, "heima");
		System.out.println(sb); 	// 123heima4 会在插入后的3索引位置插入
	}

	private static void demo2() {
		StringBuffer sb = new StringBuffer();
		sb.insert(3, "heima");  // 当stringbuffer的长度不够的时候汇报字符串越界异常StringIndexOutOfBoundsException
	}

	private static void demo1() {
		/*
		 * public stringbuffer append(String str): 可以把任意类型数据添加到字符串缓存区里面，并返回字符串缓冲区本身
		 * public StringBuffer insert(int offset, String str):在这指定位置把任意类型的数据插入到字符串缓冲区里面，并返回字符串缓冲区本身
		 * StringBuffer是字符串缓冲区，当new的时候在对内存创建了一个对象，底层是一个长度为16的字符数组当调用添加的方法时，不会再重新创建对象，在不断向原缓冲区添加字符
		 * */
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = sb.append(true);
		StringBuffer sb3 = sb.append("heima");
		StringBuffer sb4 = sb.append(100);
		
		System.out.println(sb.toString());
		System.out.println(sb2.toString());
		System.out.println(sb3.toString());
		System.out.println(sb4.toString());
	}

}
