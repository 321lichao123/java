package com.heima.test;

public class Test7 {

	/**
	 * ��ͼ��ʾ
	* ����ͳ�ƴ���С�����ֵĴ���
	* ����Ĵ󴮺�С�������Լ������������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String max = "woaiheima,heimabutongbaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma";
		String min = "heima";
		int count = 0;
		int index = 0;
		while((index = max.indexOf(min)) != -1) {
			count++;
			max = max.substring(index + min.length());
		}
		System.out.println(count);
	}

}
