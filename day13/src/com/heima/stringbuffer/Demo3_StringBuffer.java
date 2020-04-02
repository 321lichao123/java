package com.heima.stringbuffer;

public class Demo3_StringBuffer {

	public static void main(String[] args) {
		/*
		 * public StringBuffer deleteCharAt(int index) 删除 char在这个序列中的指定位置,并返回本身
		 * public StringBuffer delete(int start, int end) 删除从指定位置开始到指定位置结束的内容，并返回本身
		 * */
		StringBuffer sb = new StringBuffer();
		sb.append("heima");
//		sb.deleteCharAt(5);		// 当缓存区中没有这个索引报StringIndexOutOfBoundsException
		sb.deleteCharAt(4);
		System.out.println(sb);
		sb.delete(0, 2);	// 删除的时候包含头不包含尾
		System.out.println(sb);
//		清空缓冲区
		// 第一种方式 推荐
		sb.delete(0, sb.length());
		// 第二种方式  不推荐 原来的会变成垃圾，浪费内存
//		sb = new StringBuffer();
		System.out.println(sb);
		
	}

}
