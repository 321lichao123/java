package com.heima.otherClass;

public class Demo3_System {
	/**
	 * * A:System类的概述
		* System 类包含一些有用的类字段和方法。它不能被实例化。 
		* B:成员方法
			* public static void gc()
			* public static void exit(int status)
			* public static long currentTimeMillis()
			* pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
		* C:案例演示
			* System类的成员方法使用
	 *
	 */
	public static void main(String[] args) {
		// demo1();
		// demo2();
		// demo3();
		demo4();
	}

	private static void demo4() {
		int[] src = {11, 22, 33, 44, 55, 66, 77};
		int[] dest = new int[9];
		for (int i = 0; i < src.length; i++) {
			System.out.println(src[i]);
		}
		System.out.println("-------------------");
		System.arraycopy(src, 0, dest, 0, src.length); // 将数组拷贝
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
	}

	private static void demo3() {
		long start = System.currentTimeMillis();  // 获取当前的毫秒值
		for (int i = 0; i < 10000; i++) {
			System.out.println("*");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	private static void demo2() {
		System.exit(0); 	// 非0状态是异常终止，推出jvm
		System.out.println("1111");
	}

	private static void demo1() {
		for (int i = 0; i < 5; i++) {
			new Demo();
			System.gc();	// 强制执行垃圾清理
		}
	}

}

class Demo {

	@Override
	public void finalize() {
		System.out.println("垃圾被清理");
	}
	
}
