package com.heima.otherClass;

import java.util.Date;

public class Demo6_Date {
	/*
	 * * A:Date��ĸ���
			* �� Date ��ʾ�ض���˲�䣬��ȷ�����롣 
			* ��util����İ������ܵ���sql����
		* B:���췽��
			* public Date()
			* public Date(long date)
		* C:��Ա����
			* public long getTime()
			* public void setTime(long time)
	 * */
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		
		Date d2 = new Date(0);
		System.out.println(d2);
	}

}
