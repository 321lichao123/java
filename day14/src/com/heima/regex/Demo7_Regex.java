package com.heima.regex;

public class Demo7_Regex {
	/*
	 * A:正则表达式的分组功能
		* 捕获组可以通过从左到右计算其开括号来编号。例如，在表达式 ((A)(B(C))) 中，存在四个这样的组： 
	* 
			1     ((A)(B(C))) 
			2     (A 
			3     (B(C)) 
			4     (C) 
		
			组零始终代表整个表达式。
	* B:案例演示
		a:切割
			需求：请按照叠词切割： "sdqqfgkkkhjppppkl";
		b:替换
			需求：我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程
			将字符串还原成:“我要学编程”。*/
	public static void main(String[] args) {
		// demo1();
		// demo2();
		// demo3();
		String str1 = "我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程";
		String str2 = str1.replaceAll("\\.", "");
		String str3 = str2.replaceAll("(.)\\1+", "$1");  // $1表示第一组中的内容
		System.out.println(str3);
	}

	private static void demo3() {
		String str = "sdqqfgkkkhjppppkl";
		String regex = "(.)\\1+";	// +表示前面出现一次或者多次
		String[] arr = str.split(regex);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void demo2() {
		String regex = "(..)\\1";
		System.out.println("快快乐乐".matches(regex));
		System.out.println("快乐快乐".matches(regex));
	}

	private static void demo1() {
		String regex = "(.)\\1(.)\\2";		// \\1表示第一组又出现一次 \\2表示第二组又出现一次
		System.out.println("快快乐乐".matches(regex));
		System.out.println("快乐快乐".matches(regex));
	}

}
