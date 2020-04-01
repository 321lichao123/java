package com.heima.string;

public class Demo2_string {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 判断定义为String类型的s1和s2是否相等
		Demo1();
		Demo2();
		Demo3();
		Demo4();
		Demo5();
	}

	private static void Demo5() {
		// 判断定义为String类型的s1和s2是否相等
		String s1 = "ab";	// 存在常亮池"ab"
		String s2 = "abc";	// 存在常量池"abc"
		String s3 = s1 + "c";	// s1+"c"是通过stringBuffer在堆中创建一个"abc",然后在通过toString改成string类型再把堆内存的地址给s3所以s3 == s2为false
		System.out.println(s3 == s2);
		System.out.println(s3.equals(s2));
	}

	private static void Demo4() {
		// 判断定义为String类型的s1和s2是否相等
		String s1 = "a" + "b" + "c";	// java存在常亮优化机制，"a" + "b" + "c"就相当于"abc"，也是可以在常量池中找到的
		String s2 = "abc";
		System.out.println(s1 == s2);		// true
		System.out.println(s1.equals(s2));	// true
	}

	private static void Demo3() {
		// 判断定义为String类型的s1和s2是否相等
		String s1 = new String("abc");		// 这个是记录堆内存的地址值		
		String s2 = "abc";					// 这个是记录常量池的地址值
		System.out.println(s1 == s2);		// false
		System.out.println(s1.equals(s2));	// true
	}

	private static void Demo2() {
		// 下面这句话在内存中创建了几个对象?
		// 创建了两个对象，分别是常量池和堆内存中，其中堆内存是常量池的副本
		String s3 = new String("abc");
		System.out.println(s3);
	}

	private static void Demo1() {
		/*这里相等是由于常量池的原因。当s1在常量池中没有找到s1就创建一个"abc"并且把地址赋值给了s1，当s2发现常量池中有"abc"就不创建了，直接将地址赋值给s2，这边才导致==情况下位true*/
		String s1 = "abc";
		String s2 = "abc"; 
		System.out.println(s1 == s2);		// true，这个是对地址值的判断
		System.out.println(s1.equals(s2));	// true，这个是对值得判断
	}

}
