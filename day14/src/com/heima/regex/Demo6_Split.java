package com.heima.regex;

public class Demo6_Split {
	/*
	 * A:������ʽ�ķָ��
		* String��Ĺ��ܣ�public String[] split(String regex) �����ַ����ָ�Ϊ������ regular expression��ƥ�䡣 
	* B:������ʾ
		* ������ʽ�ķָ��
	 * */
	public static void main(String[] args) {
		String s = "������.������.��dayone";
		String[] arr = s.split("\\.");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
