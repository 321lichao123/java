package com.heima.string;

import com.heima.bean.Person;

public class Demo6_StringMethod {

	/**
	 * String的转换功能：
	* static String valueOf(int i):把int类型的数据转成字符串。
		* 注意：String类的valueOf方法可以把任意类型的数据转成字符串

	* String toLowerCase():把字符串转成小写。(了解)
	* String toUpperCase():把字符串转成大写。
	* String concat(String str):把字符串拼接
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
//      demo2();
//		demo3();
		String s1 = "heiMA";
		String s2 = "chengxuYUAN";
		String s3 = s1.toLowerCase();	// toLowerCase、toUpperCase返回的是一个新的字符串需要用变量接受
		String s4 = s2.toUpperCase();
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3 + s4);
		System.out.println(s3.concat(s4));
	}

	private static void demo3() {
		//static String valueOf(char[] chs):把字符数组转成字符串。
		char[] arr = {'a', 'b', 'c'};
		String s = String.valueOf(arr);  // valueOf底层有String类的构造方法完成
		System.out.println(s);
		
		String s2 = String.valueOf(100);
		System.out.println(s2);
		
		Person p1 = new Person("lisi", 18);
		String s3 = String.valueOf(p1); // 底层使用toString实现的
		System.out.println(s3);
					
	}

	private static void demo2() {
		//		char[] toCharArray():把字符串转换为字符数组。
				String s = "lichao";
				char[] arr = s.toCharArray();
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
	}

	private static void demo1() {
//		byte[] getBytes():把字符串转换为字节数组。
		String s1 = "abc";
		byte[] arr = s1.getBytes();
		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
		}
		
		String s2 = "李超";
		byte[] arr2 = s2.getBytes();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
