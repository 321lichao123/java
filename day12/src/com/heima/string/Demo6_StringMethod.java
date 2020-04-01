package com.heima.string;

import com.heima.bean.Person;

public class Demo6_StringMethod {

	/**
	 * String��ת�����ܣ�
	* static String valueOf(int i):��int���͵�����ת���ַ�����
		* ע�⣺String���valueOf�������԰��������͵�����ת���ַ���

	* String toLowerCase():���ַ���ת��Сд��(�˽�)
	* String toUpperCase():���ַ���ת�ɴ�д��
	* String concat(String str):���ַ���ƴ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
//      demo2();
//		demo3();
		String s1 = "heiMA";
		String s2 = "chengxuYUAN";
		String s3 = s1.toLowerCase();	// toLowerCase��toUpperCase���ص���һ���µ��ַ�����Ҫ�ñ�������
		String s4 = s2.toUpperCase();
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3 + s4);
		System.out.println(s3.concat(s4));
	}

	private static void demo3() {
		//static String valueOf(char[] chs):���ַ�����ת���ַ�����
		char[] arr = {'a', 'b', 'c'};
		String s = String.valueOf(arr);  // valueOf�ײ���String��Ĺ��췽�����
		System.out.println(s);
		
		String s2 = String.valueOf(100);
		System.out.println(s2);
		
		Person p1 = new Person("lisi", 18);
		String s3 = String.valueOf(p1); // �ײ�ʹ��toStringʵ�ֵ�
		System.out.println(s3);
					
	}

	private static void demo2() {
		//		char[] toCharArray():���ַ���ת��Ϊ�ַ����顣
				String s = "lichao";
				char[] arr = s.toCharArray();
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
	}

	private static void demo1() {
//		byte[] getBytes():���ַ���ת��Ϊ�ֽ����顣
		String s1 = "abc";
		byte[] arr = s1.getBytes();
		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
		}
		
		String s2 = "�";
		byte[] arr2 = s2.getBytes();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}

}
