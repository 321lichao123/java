package com.heima.stringbuffer;

public class Demo5_StringBufferMehotd {

	public static void main(String[] args) {
		/*
		 * public String substring(int start): ��ָ��λ�ý�ȡ��ĩβ
		 * public String substring(int start, int end):��ȡ��ָ��λ�ÿ�ʼ������λ�ã�������ʼλ�ò���������λ��
		 * */
		StringBuffer sb = new StringBuffer("woaiheima");
		String str = sb.substring(4);
		System.out.println(str);
		String str2 = sb.substring(4, 7);
		System.out.println(str2);
	}

}
