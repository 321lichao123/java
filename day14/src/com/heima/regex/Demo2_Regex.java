package com.heima.regex;

public class Demo2_Regex {
	/*
		* 字符类
		* [abc] a、b 或 c（简单类） 
		* [^abc] 任何字符，除了 a、b 或 c（否定） 
		* [a-zA-Z] a到 z 或 A到 Z，两头的字母包括在内（范围） 
		* [0-9] 0到9的字符都包括
	 * */
	public static void main(String[] args) {
		// demo1();
		// demo2();
		// demo3();
		// demo4();
		// demo5();
		// demo6();
		demo7();
	}

	private static void demo7() {
		String regex = "[a-z&&[^m-p]]";		// 减去表示a到z的范围但是去除m到p的范围
	}

	private static void demo6() {
		String regex = "[a-z&&[^bc]]";  // 减去，表示a到z的范围但是去除b和c
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
	}

	private static void demo5() {
		String regex = "[a-z&&[def]]";	// 表示并集a到z的范围中的d、e、f其实相当于找d、e、f
		System.out.println("a".matches(regex));
		System.out.println("d".matches(regex));
	}

	private static void demo4() {
		String regex = "[a-d[m-p]]";  //表示并集， a-d的集合和m-p的集合
		System.out.println("a".matches(regex));
		System.out.println("d".matches(regex));
		System.out.println("m".matches(regex));
		System.out.println("p".matches(regex));
		System.out.println("z".matches(regex));
	}

	private static void demo3() {
		String regex = "[a-zA-Z]";
		System.out.println("a".matches(regex));
		System.out.println("A".matches(regex));
		System.out.println("Z".matches(regex));
		System.out.println("z".matches(regex));
		System.out.println("!".matches(regex));
		System.out.println("1".matches(regex));
	}

	private static void demo2() {
		String regex = "[^abc]";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("f".matches(regex));
		System.out.println("v".matches(regex));
		System.out.println("10".matches(regex));  // false 是因为[]代表的是单个字符而"10"代表的是多个字符
	}

	private static void demo1() {
		String regex = "[abc]";					// []代表单个字符
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("x".matches(regex));
		System.out.println("%".matches(regex));
	}

}
