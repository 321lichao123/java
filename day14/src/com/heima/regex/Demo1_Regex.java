package com.heima.regex;

public class Demo1_Regex {
	/*
	 * ����У��qq����.
		* 1:Ҫ�������5-15λ����
		* 2:0���ܿ�ͷ
		* 3:���붼������
		
		* a:��������ʽʵ��
		* b:������ʽʵ��
	 * */
	public static void main(String[] args) {
		System.out.println(checkQQ("123456"));
		System.out.println(checkQQ("1234a56"));
		System.out.println(checkQQ("0123456"));
		
		String regex = "[1-9]\\d{4,14}";
		System.out.println("123456777".matches(regex));
		System.out.println("1234a56".matches(regex));
	}
	// У��QQ����
	public static boolean checkQQ(String qq) {
		boolean flag = true;
		if (qq.length() >= 5 && qq.length() <= 15) {
			if (!qq.startsWith("0")) {
				char[] arr = qq.toCharArray();
				for (int i = 0; i < arr.length; i++) {
					char str = arr[i];
					if (!(str >= '0' && str <= '9')) {
						flag = false;
						break;
					}
				}
			} else {
				flag = false;
			}
		} else {
			flag = false;
		}
		return flag;
	}
}
