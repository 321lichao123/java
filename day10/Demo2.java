/*
	�ڲ��������
		�����ڲ���������ڲ���
	�ڲ�������ض�
		�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա������˽��
		�ⲿ��Ҫ�����ڲ��ĳ�Ա�����봴������
		�ⲿ����.�ڲ����� ������ = �ⲿ�����.�ڲ������
*/
class Demo2 {
	public static void main(String[] args) {
		Outer.Inner i = new Outer().new Inner();
		i.method();
	}
}

class Outer {
	class Inner{
		public void method() {
			System.out.println("�ڲ�����");
		}
	}
}