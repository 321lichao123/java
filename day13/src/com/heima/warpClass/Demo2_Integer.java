package com.heima.warpClass;

public class Demo2_Integer {

	public static void main(String[] args) {
		/*
		 * Integer类概述
		 * 		通过JDK提供的API查看Integer类说明
		 * 		Integer类在对象中包装一个基本类型int值
		 * 		改类提供了多个方法，能在int类型和String类型之间相互转换
		 * 		还提供了处理int类型是非常有用的其他一些常量和方法
		 * 构造方法
		 * 		public Integer(int value)
		 * 		public Integer(String s)
		 * */
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		Integer num1 = new Integer(100);
		System.out.println(num1);
		
		Integer num2 = new Integer("100");
		System.out.println(num2);
		
		Integer num3 = new Integer("abc");	// java.lang.NumberFormatException数字格式异常
		System.out.println(num3);
	}

}
