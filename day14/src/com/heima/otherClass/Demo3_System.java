package com.heima.otherClass;

public class Demo3_System {
	/**
	 * * A:System��ĸ���
		* System �����һЩ���õ����ֶκͷ����������ܱ�ʵ������ 
		* B:��Ա����
			* public static void gc()
			* public static void exit(int status)
			* public static long currentTimeMillis()
			* pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
		* C:������ʾ
			* System��ĳ�Ա����ʹ��
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
		System.arraycopy(src, 0, dest, 0, src.length); // �����鿽��
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
	}

	private static void demo3() {
		long start = System.currentTimeMillis();  // ��ȡ��ǰ�ĺ���ֵ
		for (int i = 0; i < 10000; i++) {
			System.out.println("*");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

	private static void demo2() {
		System.exit(0); 	// ��0״̬���쳣��ֹ���Ƴ�jvm
		System.out.println("1111");
	}

	private static void demo1() {
		for (int i = 0; i < 5; i++) {
			new Demo();
			System.gc();	// ǿ��ִ����������
		}
	}

}

class Demo {

	@Override
	public void finalize() {
		System.out.println("����������");
	}
	
}
