class Demo3 {
	public static void main(String[] args) {
		Person p = new SuperMan();				// ��������ָ����������������ת��
		System.out.println(p.name);
		p.take();

		SuperMan sm = (SuperMan)p;				// ����ת�ͣ� ����Ҫ��������ת�Ͳ�������ת��
		sm.fly();

		/*
			���������Զ�������ǿ������ת��
			int a = 10;
			byte b = 20;
			i = b;			// �Զ���������
			b = (byte)i;	// ǿ������ת��
		*/

		/*
			��̬�ĺô���׶ˣ�
				�ô���
					����˴����ά���ԣ��̳��Ա�֤��
					��ߴ������չ�ԣ��ɶ�̬��֤��
				�׶ˣ�
					����ʹ����������е����Ժ���Ϊ����������ת�Ͳſ��ԣ�
		*/
	}
}

class Person{
	String name = "John";
	public void take() {
		System.out.println("̸����");
	}
}

class SuperMan extends Person{
	String name = "superMan";
	public void take() {
		System.out.println("̸������");
	}
	public void fly() {
		System.out.println("����������");
	}
}
