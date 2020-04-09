package com.heima.regex;

public class Demo2_Regex {
	/*
		* �ַ���
		* [abc] a��b �� c�����ࣩ 
		* [^abc] �κ��ַ������� a��b �� c���񶨣� 
		* [a-zA-Z] a�� z �� A�� Z����ͷ����ĸ�������ڣ���Χ�� 
		* [0-9] 0��9���ַ�������
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
		String regex = "[a-z&&[^m-p]]";		// ��ȥ��ʾa��z�ķ�Χ����ȥ��m��p�ķ�Χ
	}

	private static void demo6() {
		String regex = "[a-z&&[^bc]]";  // ��ȥ����ʾa��z�ķ�Χ����ȥ��b��c
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
	}

	private static void demo5() {
		String regex = "[a-z&&[def]]";	// ��ʾ����a��z�ķ�Χ�е�d��e��f��ʵ�൱����d��e��f
		System.out.println("a".matches(regex));
		System.out.println("d".matches(regex));
	}

	private static void demo4() {
		String regex = "[a-d[m-p]]";  //��ʾ������ a-d�ļ��Ϻ�m-p�ļ���
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
		System.out.println("10".matches(regex));  // false ����Ϊ[]������ǵ����ַ���"10"������Ƕ���ַ�
	}

	private static void demo1() {
		String regex = "[abc]";					// []�������ַ�
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("x".matches(regex));
		System.out.println("%".matches(regex));
	}

}
