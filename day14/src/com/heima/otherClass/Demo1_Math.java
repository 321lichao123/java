package com.heima.otherClass;

public class Demo1_Math {

	/**
	 *  Math类概述
			* Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。 
		* B:成员方法
			* public static int abs(int a)
			* public static double ceil(double a)
			* public static double floor(double a)
			* public static int max(int a,int b) min自学
			* public static double pow(double a,double b)
			* public static double random()
			* public static int round(float a) 参数为double的自学
			* public static double sqrt(double a)
	 */
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.abs(-10));
		System.out.println(Math.ceil(10.22));		// Math.ceil向上取整，结果是一个double
		System.out.println(Math.ceil(10.999));
		System.out.println("------");
		System.out.println(Math.floor(10.22));		// Math.floor向下取整，结果是一个double
		System.out.println(Math.floor(10.999));
		
		System.out.println(Math.max(10, 20));	// 获取最大值
		
		System.out.println(Math.pow(2, 4));	   // 2的4次方
		
		System.out.println(Math.random()); 		// 随机数
		
		System.out.println(Math.round(13.5f));	// 四舍五入
		
		System.out.println(Math.sqrt(4));	  // 开根号
	}

}
