package com.heima.otherClass;

public class Demo1_Math {

	/**
	 *  Math�����
			* Math ���������ִ�л�����ѧ����ķ����������ָ����������ƽ���������Ǻ����� 
		* B:��Ա����
			* public static int abs(int a)
			* public static double ceil(double a)
			* public static double floor(double a)
			* public static int max(int a,int b) min��ѧ
			* public static double pow(double a,double b)
			* public static double random()
			* public static int round(float a) ����Ϊdouble����ѧ
			* public static double sqrt(double a)
	 */
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.abs(-10));
		System.out.println(Math.ceil(10.22));		// Math.ceil����ȡ���������һ��double
		System.out.println(Math.ceil(10.999));
		System.out.println("------");
		System.out.println(Math.floor(10.22));		// Math.floor����ȡ���������һ��double
		System.out.println(Math.floor(10.999));
		
		System.out.println(Math.max(10, 20));	// ��ȡ���ֵ
		
		System.out.println(Math.pow(2, 4));	   // 2��4�η�
		
		System.out.println(Math.random()); 		// �����
		
		System.out.println(Math.round(13.5f));	// ��������
		
		System.out.println(Math.sqrt(4));	  // ������
	}

}
