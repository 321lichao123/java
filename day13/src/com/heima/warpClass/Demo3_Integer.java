package com.heima.warpClass;

public class Demo3_Integer {

	public static void main(String[] args) {
		/*
		 * int --> string
		 * 		1����""ƴ��
		 * 		2��ʹ��String��valueOf()����
		 * 		3��int  -->Integer --> String(Integer���toString����)
		 * 		4��public static String toString(int i)(Integer��ľ�̬����)
		 * 
		 * string --> int
		 * 		String -->Integer --> int
		 *		public static int parseInt(String s)
		 *�����������Ͱ�װ�࣬��������(����char�İ�װ��)����parseXXX�ķ������Ծ�������е��ַ���������ʽתΪ������������
		 *�ַ������ַ���ת��ͨ��toCharArray()�Ϳ��԰��ַ���תΪ�ַ�����
		 * */
		
//		demo1();
//		demo2();
		

	}

	private static void demo2() {
		String str = "200";
		Integer i = new Integer(str);
		int num1 = i.intValue();			// ��IntegerתΪint��
		
		int num2 = Integer.parseInt(str);	// ��StringתΪint���Ƽ�ʹ������
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
