package com.heima.regex;

public class Demo7_Regex {
	/*
	 * A:������ʽ�ķ��鹦��
		* ���������ͨ�������Ҽ����俪��������š����磬�ڱ��ʽ ((A)(B(C))) �У������ĸ��������飺 
	* 
			1     ((A)(B(C))) 
			2     (A 
			3     (B(C)) 
			4     (C) 
		
			����ʼ�մ����������ʽ��
	* B:������ʾ
		a:�и�
			�����밴�յ����и "sdqqfgkkkhjppppkl";
		b:�滻
			��������....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��
			���ַ�����ԭ��:����Ҫѧ��̡���*/
	public static void main(String[] args) {
		// demo1();
		// demo2();
		// demo3();
		String str1 = "����....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��";
		String str2 = str1.replaceAll("\\.", "");
		String str3 = str2.replaceAll("(.)\\1+", "$1");  // $1��ʾ��һ���е�����
		System.out.println(str3);
	}

	private static void demo3() {
		String str = "sdqqfgkkkhjppppkl";
		String regex = "(.)\\1+";	// +��ʾǰ�����һ�λ��߶��
		String[] arr = str.split(regex);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void demo2() {
		String regex = "(..)\\1";
		System.out.println("�������".matches(regex));
		System.out.println("���ֿ���".matches(regex));
	}

	private static void demo1() {
		String regex = "(.)\\1(.)\\2";		// \\1��ʾ��һ���ֳ���һ�� \\2��ʾ�ڶ����ֳ���һ��
		System.out.println("�������".matches(regex));
		System.out.println("���ֿ���".matches(regex));
	}

}
