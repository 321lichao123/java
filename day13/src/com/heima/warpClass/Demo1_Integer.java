package com.heima.warpClass;

public class Demo1_Integer {
	public static void main(String[] args) {
		/*
		 * 为什么会有基本类型包装类
		 * 		将基本类型封装成对象的好处在于可以在对象中定义更多的功能方法操作该数据
		 * 常用操作
		 * 		用于基本数据类型与字符串转换
		 * 基本类型和包装类的对应
		 * byte			Byte
		 * short		Short
		 * int			Integer
		 * long			Long
		 * float		Float
		 * double		Double
		 * char			Character	
		 * boolean		Boolean
		 * */
		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toHexString(60));
		System.out.println(Integer.toOctalString(60));
	}
}

