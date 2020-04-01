package com.heima.string;

public class Demo7_StringMethod {

	/**
	 * A:String的替换功能及案例演示
	* 
	* B:
	* C:String的按字典顺序比较两个字符串及案例演示
	* int compareTo(String str)(暂时不用掌握)
	* int compareToIgnoreCase(String str)(了解)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
//		demo2();
		String s1 = "a";
		String s2 = "aaaa";
		String s3 = "abc";
		String s4 = "bcd";
		int num = s1.compareTo(s2);  // 当首字母相同的时候比较的是长度
		int num1 = s3.compareTo(s4); // 比较的是首字母的码表值，如果相同就比较第二个依次向下
		System.out.println(num);  
		System.out.println(num1);  
	}

	private static void demo2() {
		// String的去除字符串两空格及案例演示
//		String trim()
		String s = " hei ma ";
		String s2 = s.trim();
		System.out.println(s2);
	}

	private static void demo1() {
//		String replace(char old,char new)
//		String replace(String old,String new)
		String s = "heima";
		String s2 = s.replace('i', 'o');
		System.out.println(s2);
		String s3 = s.replace('z', 'o');  // 不存在不修改
		System.out.println(s3);
		String s4 = s.replace("ei", "ao");
		System.out.println(s4);
	}

}
