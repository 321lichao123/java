package com.heima.otherClass;

import java.math.BigInteger;

public class Demo4_BigInteger {
	/*
	 * * A:BigInteger的概述
	* 		可以让超过Integer范围内的数据进行运算
		* B:构造方法
			* public BigInteger(String val)
		* C:成员方法
			* public BigInteger add(BigInteger val)
			* public BigInteger subtract(BigInteger val)
			* public BigInteger multiply(BigInteger val)
			* public BigInteger divide(BigInteger val)
			* public BigInteger[] divideAndRemainder(BigInteger val)
	 * */
	public static void main(String[] args) {
		BigInteger b1 = new BigInteger("100");
		BigInteger b2 = new BigInteger("2");
		
		System.out.println(b1.add(b2));			// 加法
		System.out.println(b1.subtract(b2));	// 减法
		System.out.println(b1.multiply(b2));	// 乘法
		System.out.println(b1.divide(b2));		// 除法
		
		BigInteger[] arr = b1.divideAndRemainder(b2);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
