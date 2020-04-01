package com.heima.string;

public class Demo3_stringMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String类的判断功能
		 * */
		// demo1();
		// demo2();
		// demo3();
		demo4();
	}

	private static void demo4() {
		// boolean isEmpty():判断字符串是否为空。
		/*
		 * null和""的区别
		 * ""是空字符串常量，同时也是String对象，既然是String对象就可以调用String类的方法
		 * null是空常量，不能调用任何方法，否则会出现空指针异常，null常量可以任意引用类型赋值
		 * */
		String s1 = "abc";
		String s2 = "";
		String s3 = null;
		System.out.println(s1.isEmpty());	// false
		System.out.println(s2.isEmpty());	// true
		System.out.println(s3.isEmpty());	// java.lang.NullPointerException
	}

	private static void demo3() {
		// boolean startsWith(String str):判断字符串是否以某个指定的字符串开头
		// boolean endsWith(String str):判断字符串是否以某个指定的字符串结尾
		String s1 = "abcd";
		String s2 = "a";
		String s3 = "b";
		String s4 = "d";
		System.out.println(s1.startsWith(s2));		// true
		System.out.println(s1.startsWith(s3, 1));	// true  从索引是1开始判断
		System.out.println(s1.endsWith(s4));		// true
	}

	private static void demo2() {
		// boolean contains(String str):判断大字符串中是否包含小字符串
		String s1 = "小懒猪爱蛋蛋";
		String s2 = "蛋蛋";
		System.out.println(s1.contains(s2)); // true
	}

	private static void demo1() {
		// boolean equals(Object obj):比较字符串的内容是否相同,区分大小写
		// boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
		String s1 = "heima";
		String s2 = "heima";
		String s3 = "HeiMa";
		System.out.println(s1.equals(s2));	// true
		System.out.println(s1.equals(s3));	// false
		System.out.println(s1.equalsIgnoreCase(s3));	// true
	}

}
