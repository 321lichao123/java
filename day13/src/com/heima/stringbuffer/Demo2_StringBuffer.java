package com.heima.stringbuffer;

public class Demo2_StringBuffer {

	public static void main(String[] args) {
//		demo1();
//		demo2();
		StringBuffer sb = new StringBuffer("1234");
		sb.insert(3, "heima");
		System.out.println(sb); 	// 123heima4 ���ڲ�����3����λ�ò���
	}

	private static void demo2() {
		StringBuffer sb = new StringBuffer();
		sb.insert(3, "heima");  // ��stringbuffer�ĳ��Ȳ�����ʱ��㱨�ַ���Խ���쳣StringIndexOutOfBoundsException
	}

	private static void demo1() {
		/*
		 * public stringbuffer append(String str): ���԰���������������ӵ��ַ������������棬�������ַ�������������
		 * public StringBuffer insert(int offset, String str):����ָ��λ�ð��������͵����ݲ��뵽�ַ������������棬�������ַ�������������
		 * StringBuffer���ַ�������������new��ʱ���ڶ��ڴ洴����һ�����󣬵ײ���һ������Ϊ16���ַ����鵱������ӵķ���ʱ�����������´��������ڲ�����ԭ����������ַ�
		 * */
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = sb.append(true);
		StringBuffer sb3 = sb.append("heima");
		StringBuffer sb4 = sb.append(100);
		
		System.out.println(sb.toString());
		System.out.println(sb2.toString());
		System.out.println(sb3.toString());
		System.out.println(sb4.toString());
	}

}
