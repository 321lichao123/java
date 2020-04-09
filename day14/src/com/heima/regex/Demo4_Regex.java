package com.heima.regex;

public class Demo4_Regex {
	/*
	 * Greedy ������ 
		* X? X��һ�λ�һ��Ҳû��
		* X* X����λ��ΰ���һ��
		* X+ X��һ�λ���
		* X{n} X��ǡ�� n �� 
		* X{n,} X������ n �� 
		* X{n,m} X������ n �Σ����ǲ����� m �� 
	 * */
	public static void main(String[] args) {
		// demo1();
		// demo2();
		// demo3();
		// demo4();
		// demo5();
		demo6();
	}

	private static void demo6() {
		String regex = "[abc]{5,8}";
		System.out.println("abcac".matches(regex));
		System.out.println("abca".matches(regex));
		System.out.println("abcacabc".matches(regex));
	}

	private static void demo5() {
		String regex = "[abc]{5,}";
		System.out.println("abcac".matches(regex));
		System.out.println("abca".matches(regex));
		System.out.println("abcacabc".matches(regex));
	}

	private static void demo4() {
		String regex = "[abc]{5}";
		System.out.println("abcac".matches(regex));
		System.out.println("abca".matches(regex));
		System.out.println("abcacabc".matches(regex));
	}

	private static void demo3() {
		String regex = "[abc]+";
		System.out.println("".matches(regex));
		System.out.println("abc".matches(regex));
		System.out.println("a".matches(regex));
	}

	private static void demo2() {
		String regex = "[abc]*";
		System.out.println("".matches(regex));
		System.out.println("abc".matches(regex));
		System.out.println("a".matches(regex));
	}

	private static void demo1() {
		String regex = "[abc]?";
		System.out.println("a".matches(regex));
		System.out.println("b".matches(regex));
		System.out.println("c".matches(regex));
		System.out.println("d".matches(regex));
		System.out.println("".matches(regex));  //һ��Ҳû�е��Ǳ�ʾa��b��cһ��Ҳû�г���
	}

}
