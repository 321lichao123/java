/**
	�̳�
		��������֮�������ϵ���Ӹ���
	�̳еĺô�
		��ߴ���ĸ�����
		��ߴ����ά����
		��������֮�������ϵ���Ƕ�̬��ǰ��
	�̳еı׶�
		����������ǿ
	����ԭ��
		���ھۣ������
		�ھۣ������Լ����ĳ���µ�����
		��ϣ�������Ĺ�ϵ
	�̳��ص㣺
		javaֻ֧�ֵ��̳У���֧�ֶ�̳У�һ������ֻ����һ������
		java֧�ֶ��̳�
	�̳е�ע�����
		����ֻ�ܼ̳и������з�˽�еĳ�Ա
		���಻�ܼ̳и���Ĺ��췽�������ǿ���ͨ��super�ؼ���ȥ���ʸ���Ĺ��췽��
		��ҪΪ�˲��ֹ��ܶ�ȥ�̳�
*/
class Demo2 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		Cat c = new Cat();
		c.color = "��ɫ";
		c.age = 4;
		c.eat();
		c.sleep();
	}
}

class Animal{
	String color;
	int age;

	public void eat() {
		System.out.println("�Է�");
	}
	public void sleep() {
		System.out.println("˯��");
	}
}
class Cat extends Animal{
}
class Dog extends Animal{
}