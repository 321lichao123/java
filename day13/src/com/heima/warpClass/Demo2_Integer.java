package com.heima.warpClass;

public class Demo2_Integer {

	public static void main(String[] args) {
		/*
		 * Integer�����
		 * 		ͨ��JDK�ṩ��API�鿴Integer��˵��
		 * 		Integer���ڶ����а�װһ����������intֵ
		 * 		�����ṩ�˶������������int���ͺ�String����֮���໥ת��
		 * 		���ṩ�˴���int�����Ƿǳ����õ�����һЩ�����ͷ���
		 * ���췽��
		 * 		public Integer(int value)
		 * 		public Integer(String s)
		 * */
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		Integer num1 = new Integer(100);
		System.out.println(num1);
		
		Integer num2 = new Integer("100");
		System.out.println(num2);
		
		Integer num3 = new Integer("abc");	// java.lang.NumberFormatException���ָ�ʽ�쳣
		System.out.println(num3);
	}

}
