package com.heima.otherClass;

import java.math.BigDecimal;

public class Demo5_BigDecimal {
	/*
	 * * A:BigDecimal�ĸ���
			* �����������ʱ��float���ͺ�double�����׶�ʧ���ȣ���ʾ������
			* ���ԣ�Ϊ���ܾ�ȷ�ı�ʾ�����㸡������Java�ṩ��BigDecimal
		
			* ���ɱ�ġ����⾫�ȵ��з���ʮ��������
		* B:���췽��
			* public BigDecimal(String val)
		* C:��Ա����
			* public BigDecimal add(BigDecimal augend)
			* public BigDecimal subtract(BigDecimal subtrahend)
			* public BigDecimal multiply(BigDecimal multiplicand)
			* public BigDecimal divide(BigDecimal divisor)
		* D:������ʾ
			* BigDecimal��Ĺ��췽���ͳ�Ա����ʹ��
	 * */
	public static void main(String[] args) {
		System.out.println(2.0 - 1.1);
		
		System.out.println("-------------------");
		
		BigDecimal bd1 = new BigDecimal(2.0);	// ���ַ����ڿ����в��Ƽ���Ϊ������ȷ
		BigDecimal bd2 = new BigDecimal(1.1);
		
		System.out.println(bd1.subtract(bd2));
		
		System.out.println("-------------------");
		
		BigDecimal bd3 = new BigDecimal("2.0");	// �Ƽ��ڹ��캯����ʹ���ַ���
		BigDecimal bd4 = new BigDecimal("1.1");
		
		System.out.println(bd3.subtract(bd4));
		
		System.out.println("-------------------");
		
		BigDecimal bd5 = BigDecimal.valueOf(2.0);	// �Ƽ�
		BigDecimal bd6 = BigDecimal.valueOf(1.1);
		
		System.out.println(bd5.subtract(bd6));
	}

}
