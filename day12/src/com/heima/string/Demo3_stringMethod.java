package com.heima.string;

public class Demo3_stringMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String����жϹ���
		 * */
		// demo1();
		// demo2();
		// demo3();
		demo4();
	}

	private static void demo4() {
		// boolean isEmpty():�ж��ַ����Ƿ�Ϊ�ա�
		/*
		 * null��""������
		 * ""�ǿ��ַ���������ͬʱҲ��String���󣬼�Ȼ��String����Ϳ��Ե���String��ķ���
		 * null�ǿճ��������ܵ����κη������������ֿ�ָ���쳣��null�������������������͸�ֵ
		 * */
		String s1 = "abc";
		String s2 = "";
		String s3 = null;
		System.out.println(s1.isEmpty());	// false
		System.out.println(s2.isEmpty());	// true
		System.out.println(s3.isEmpty());	// java.lang.NullPointerException
	}

	private static void demo3() {
		// boolean startsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����ͷ
		// boolean endsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����β
		String s1 = "abcd";
		String s2 = "a";
		String s3 = "b";
		String s4 = "d";
		System.out.println(s1.startsWith(s2));		// true
		System.out.println(s1.startsWith(s3, 1));	// true  ��������1��ʼ�ж�
		System.out.println(s1.endsWith(s4));		// true
	}

	private static void demo2() {
		// boolean contains(String str):�жϴ��ַ������Ƿ����С�ַ���
		String s1 = "С��������";
		String s2 = "����";
		System.out.println(s1.contains(s2)); // true
	}

	private static void demo1() {
		// boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ,���ִ�Сд
		// boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
		String s1 = "heima";
		String s2 = "heima";
		String s3 = "HeiMa";
		System.out.println(s1.equals(s2));	// true
		System.out.println(s1.equals(s3));	// false
		System.out.println(s1.equalsIgnoreCase(s3));	// true
	}

}
