package com.heima.stringbuffer;

public class Demo3_StringBuffer {

	public static void main(String[] args) {
		/*
		 * public StringBuffer deleteCharAt(int index) ɾ�� char����������е�ָ��λ��,�����ر���
		 * public StringBuffer delete(int start, int end) ɾ����ָ��λ�ÿ�ʼ��ָ��λ�ý��������ݣ������ر���
		 * */
		StringBuffer sb = new StringBuffer();
		sb.append("heima");
//		sb.deleteCharAt(5);		// ����������û�����������StringIndexOutOfBoundsException
		sb.deleteCharAt(4);
		System.out.println(sb);
		sb.delete(0, 2);	// ɾ����ʱ�����ͷ������β
		System.out.println(sb);
//		��ջ�����
		// ��һ�ַ�ʽ �Ƽ�
		sb.delete(0, sb.length());
		// �ڶ��ַ�ʽ  ���Ƽ� ԭ���Ļ����������˷��ڴ�
//		sb = new StringBuffer();
		System.out.println(sb);
		
	}

}
