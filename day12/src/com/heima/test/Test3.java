package com.heima.test;

public class Test3 {

	/**
	 * ������ʾ
	* ����ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ���,�����ַ����ֵĴ�����
	* ABCDEabcd123456!@#$%^
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCDEabcd123456!@#$%^";
		int big = 0;
		int samll = 0;
		int num = 0;
		int other = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				big++;
			} else if (c >= 'a' && c <= 'z') {
				samll++;
			} else if (c >= '0' && c <= '9') {
				num++;
			} else {
				other++;
			}
		}
		System.out.println(big);
		System.out.println(samll);
		System.out.println(num);
		System.out.println(other);
	}

}
