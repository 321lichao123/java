package com.heima.warpClass;

public class Demo4_JDK5 {

	public static void main(String[] args) {
		/*
		 * JDK5��������
		 * 		�Զ�װ�䣺�ѻ�������תΪ��װ����
		 * 		�Զ����䣺�Ѱ�װ����תΪ��������
		 * ע�����
		 * 		��ʹ��ʱInteger x = null ����ͻ����NullPointExceotion��ָ���쳣
		 * 		�������ж��Ƿ�ΪnullȻ����ʹ��
		 * */
		// JDK5֮ǰ��װ�������
		int x = 100;
		Integer i1 = new Integer(x);	// �������������Ͱ�װ�ɶ���װ��
		
		int y = i1.intValue();			// ������תΪ�����������ͣ�����
		
		Integer i2 = 100;				// �Զ�װ��
		int z = i2 + 200;				// �Զ�����
		System.out.println(z);
		
		Integer i3 = null;
		int a = i3 + 200;
		System.out.println(a);   		// java.lang.NullPointerException��Ϊ�ײ���õ���intValue,����i3��null��null���÷����ͻ���ֿ�ָ���쳣
	}

}
