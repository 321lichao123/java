package com.heima.stringbuffer;

public class Demo1_StringBuffer {

	public static void main(String[] args) {
		/*
		 * 1��stringbuffer��string������
		 * 		String��һ�����ɱ���ַ�����
		 * 		StringBuffer��һ���ɱ���ַ�����
		 * 2��StringBuffer�Ĺ��췽��
		 * 		public StringBuffer():�޲ι��췽�� ��ʼ����16���ַ�
		 * 		public StringBuffer(int capacity):ָ���������ַ�������������
		 * 		public StringBuffer(String str):ָ���ַ������ݵ��ַ�������������
		 * 3��StringBuffer�ķ���
		 * 		public int capacity(): ���ص�ǰ����  ����ֵ
		 * 		public int length(): ���س���   ʵ��ֵ
		 * */
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());		// ʵ��ֵ
		System.out.println(sb.capacity());
		
		StringBuffer sb2 = new StringBuffer(10);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		StringBuffer sb3 = new StringBuffer("heima");
		System.out.println(sb3.length());		
		System.out.println(sb3.capacity());		// ʵ��ֵ���ϳ�ʼֵ
	}

}
