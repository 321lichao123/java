package com.heima.string;

public class Demo7_StringMethod {

	/**
	 * A:String���滻���ܼ�������ʾ
	* 
	* B:
	* C:String�İ��ֵ�˳��Ƚ������ַ�����������ʾ
	* int compareTo(String str)(��ʱ��������)
	* int compareToIgnoreCase(String str)(�˽�)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
//		demo2();
		String s1 = "a";
		String s2 = "aaaa";
		String s3 = "abc";
		String s4 = "bcd";
		int num = s1.compareTo(s2);  // ������ĸ��ͬ��ʱ��Ƚϵ��ǳ���
		int num1 = s3.compareTo(s4); // �Ƚϵ�������ĸ�����ֵ�������ͬ�ͱȽϵڶ�����������
		System.out.println(num);  
		System.out.println(num1);  
	}

	private static void demo2() {
		// String��ȥ���ַ������ո񼰰�����ʾ
//		String trim()
		String s = " hei ma ";
		String s2 = s.trim();
		System.out.println(s2);
	}

	private static void demo1() {
//		String replace(char old,char new)
//		String replace(String old,String new)
		String s = "heima";
		String s2 = s.replace('i', 'o');
		System.out.println(s2);
		String s3 = s.replace('z', 'o');  // �����ڲ��޸�
		System.out.println(s3);
		String s4 = s.replace("ei", "ao");
		System.out.println(s4);
	}

}
