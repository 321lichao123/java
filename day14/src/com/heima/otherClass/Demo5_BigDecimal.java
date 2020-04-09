package com.heima.otherClass;

import java.math.BigDecimal;

public class Demo5_BigDecimal {
	/*
	 * * A:BigDecimal的概述
			* 由于在运算的时候，float类型和double很容易丢失精度，演示案例。
			* 所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal
		
			* 不可变的、任意精度的有符号十进制数。
		* B:构造方法
			* public BigDecimal(String val)
		* C:成员方法
			* public BigDecimal add(BigDecimal augend)
			* public BigDecimal subtract(BigDecimal subtrahend)
			* public BigDecimal multiply(BigDecimal multiplicand)
			* public BigDecimal divide(BigDecimal divisor)
		* D:案例演示
			* BigDecimal类的构造方法和成员方法使用
	 * */
	public static void main(String[] args) {
		System.out.println(2.0 - 1.1);
		
		System.out.println("-------------------");
		
		BigDecimal bd1 = new BigDecimal(2.0);	// 这种方法在开发中不推荐因为不够精确
		BigDecimal bd2 = new BigDecimal(1.1);
		
		System.out.println(bd1.subtract(bd2));
		
		System.out.println("-------------------");
		
		BigDecimal bd3 = new BigDecimal("2.0");	// 推荐在构造函数中使用字符串
		BigDecimal bd4 = new BigDecimal("1.1");
		
		System.out.println(bd3.subtract(bd4));
		
		System.out.println("-------------------");
		
		BigDecimal bd5 = BigDecimal.valueOf(2.0);	// 推荐
		BigDecimal bd6 = BigDecimal.valueOf(1.1);
		
		System.out.println(bd5.subtract(bd6));
	}

}
