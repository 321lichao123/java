package com.heima.string;

public class Demo1_string {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* public String():�չ���
		* public String(byte[] bytes):���ֽ�����ת���ַ���
		* public String(byte[] bytes,int index,int length):���ֽ������һ����ת���ַ���
		* public String(char[] value):���ַ�����ת���ַ���
		* public String(char[] value,int index,int count):���ַ������һ����ת���ַ���
		* public String(String original):���ַ�������ֵת���ַ��� */
		
		String s1 = new String();
		System.out.println(s1);
		
		byte[] b1 = {96, 97, 98, 99, 100, 101, 102};
		String s2 = new String(b1);
		System.out.println(s2);
		
		String s3 = new String(b1, 1, 3);
		System.out.println(s3);
		
		char[] c1 = {'a', 'b', 'c', 'd', 'f'};
		String s4 = new String(c1);
		System.out.println(s4);
		
		String s5 = new String(c1, 1, 3);
		System.out.println(s5);
		
	}

}
