package com.heima.warpClass;

public class Demo4_JDK5 {

	public static void main(String[] args) {
		/*
		 * JDK5的新特性
		 * 		自动装箱：把基本类型转为包装类型
		 * 		自动拆箱：把包装类型转为基本类型
		 * 注意事项：
		 * 		在使用时Integer x = null 代码就会出现NullPointExceotion空指针异常
		 * 		建议先判断是否为null然后在使用
		 * */
		// JDK5之前的装箱与拆箱
		int x = 100;
		Integer i1 = new Integer(x);	// 将基本数据类型包装成对象，装箱
		
		int y = i1.intValue();			// 将对象转为基本数据类型，拆箱
		
		Integer i2 = 100;				// 自动装箱
		int z = i2 + 200;				// 自动拆箱
		System.out.println(z);
		
		Integer i3 = null;
		int a = i3 + 200;
		System.out.println(a);   		// java.lang.NullPointerException因为底层调用的是intValue,但是i3是null，null调用方法就会出现空指针异常
	}

}
