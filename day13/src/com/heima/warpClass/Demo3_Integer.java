package com.heima.warpClass;

public class Demo3_Integer {

	public static void main(String[] args) {
		/*
		 * int --> string
		 * 		1、和""拼接
		 * 		2、使用String中valueOf()方法
		 * 		3、int  -->Integer --> String(Integer类的toString方法)
		 * 		4、public static String toString(int i)(Integer类的静态方法)
		 * 
		 * string --> int
		 * 		String -->Integer --> int
		 *		public static int parseInt(String s)
		 *基本数据类型包装类，其中七种(除了char的包装类)都有parseXXX的方法可以经这个其中的字符串表现形式转为基本数据类型
		 *字符串到字符的转化通过toCharArray()就可以把字符串转为字符数组
		 * */
		
//		demo1();
//		demo2();
		

	}

	private static void demo2() {
		String str = "200";
		Integer i = new Integer(str);
		int num1 = i.intValue();			// 将Integer转为int数
		
		int num2 = Integer.parseInt(str);	// 将String转为int，推荐使用这种
		System.out.println(num1);
		System.out.println(num2);
	}

	private static void demo1() {
		int i = 100;
		String s1 = i + "";
		
		String s2 = String.valueOf(i);
		
		Integer i2 = new Integer(i);
		String s3 = i2.toString();
		
		String s4 = Integer.toString(i);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
