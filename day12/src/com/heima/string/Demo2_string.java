package com.heima.string;

public class Demo2_string {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ж϶���ΪString���͵�s1��s2�Ƿ����
		Demo1();
		Demo2();
		Demo3();
		Demo4();
		Demo5();
	}

	private static void Demo5() {
		// �ж϶���ΪString���͵�s1��s2�Ƿ����
		String s1 = "ab";	// ���ڳ�����"ab"
		String s2 = "abc";	// ���ڳ�����"abc"
		String s3 = s1 + "c";	// s1+"c"��ͨ��stringBuffer�ڶ��д���һ��"abc",Ȼ����ͨ��toString�ĳ�string�����ٰѶ��ڴ�ĵ�ַ��s3����s3 == s2Ϊfalse
		System.out.println(s3 == s2);
		System.out.println(s3.equals(s2));
	}

	private static void Demo4() {
		// �ж϶���ΪString���͵�s1��s2�Ƿ����
		String s1 = "a" + "b" + "c";	// java���ڳ����Ż����ƣ�"a" + "b" + "c"���൱��"abc"��Ҳ�ǿ����ڳ��������ҵ���
		String s2 = "abc";
		System.out.println(s1 == s2);		// true
		System.out.println(s1.equals(s2));	// true
	}

	private static void Demo3() {
		// �ж϶���ΪString���͵�s1��s2�Ƿ����
		String s1 = new String("abc");		// ����Ǽ�¼���ڴ�ĵ�ֵַ		
		String s2 = "abc";					// ����Ǽ�¼�����صĵ�ֵַ
		System.out.println(s1 == s2);		// false
		System.out.println(s1.equals(s2));	// true
	}

	private static void Demo2() {
		// ������仰���ڴ��д����˼�������?
		// �������������󣬷ֱ��ǳ����غͶ��ڴ��У����ж��ڴ��ǳ����صĸ���
		String s3 = new String("abc");
		System.out.println(s3);
	}

	private static void Demo1() {
		/*������������ڳ����ص�ԭ�򡣵�s1�ڳ�������û���ҵ�s1�ʹ���һ��"abc"���Ұѵ�ַ��ֵ����s1����s2���ֳ���������"abc"�Ͳ������ˣ�ֱ�ӽ���ַ��ֵ��s2����߲ŵ���==�����λtrue*/
		String s1 = "abc";
		String s2 = "abc"; 
		System.out.println(s1 == s2);		// true������ǶԵ�ֵַ���ж�
		System.out.println(s1.equals(s2));	// true������Ƕ�ֵ���ж�
	}

}
