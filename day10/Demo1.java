/*
	ΪʲôҪ�а�
		���ֽ���(.class)���з�����
		����ʵ�����ļ���
	���ĸ���
	
	������ĸ�ʽ
		package ����
		�༶����.�ֿ�����
	�������ע������
		package�������ǳ���ĵ�һ����ִ�еĴ���
		package�����һ��java�ļ���ֻ����һ��
		���û��package��Ĭ�ϱ�ʾ������
	��α������д�������
		����java��ָ��
			javac -d . Demo1.java
		ִ�����ļ�ָ��
			java com.heima.Demo1
	����ʹ��import���������ʵ�������а�����Ե����߿ɼ�������дȫ����
	������ʽ
		import ����
		ע�⣺
			���ַ��������ǵ��������
			��Ȼ�������д*,danshi bujianyi 
		package,import,class��û��˳���ϵ
			�С���ʾpackage --> import --> class
	����Ȩ�����η�
					����   ͬһ������(������޹���)  ��ͬ����(����)  ��ͬ����(�޹���)
		private		 Y
		Ĭ��		 Y			Y
		protected	 Y			Y							Y
		public		 Y			Y							Y				Y
	������󳣼����η�
		���η�
			Ȩ�����η���private Ĭ�� protected public
			״̬���η���static final
			�������η���abstract
		��
			Ȩ�����η���Ĭ�����η��� public
			״̬���η���final
			�������η���abstract

			�õ�������public

		��Ա������
			Ȩ�����η���private Ĭ�� protected public
			״̬���η���static final
			
			�õ�������public
		
		���췽����
			Ȩ�����η���private Ĭ�� protected public
			
			�õ�������public

		��Ա������
			Ȩ�����η���private Ĭ�� protected public
			״̬���η���static�� final
			�������η���abstract

			�õ������� public
		
		��Ϲ���
			��Ա������public static final
			��Ա����
				public static
				public abstract
				public final

*/
package com.heima;
import com.baidu.Person;
class Demo1 {
	public static void main(String[] args) {
		Person p = new Person("����", 18);
		System.out.println(p.getName() + "..." + p.getAge());
	}
}
