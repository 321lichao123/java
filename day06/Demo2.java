class Demo2 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		Person p1 = new Person();
		p1.show();
		System.out.println("=======================================");
		Person p2 = new Person("����", 23);
		p2.show();
	}
}

/*
	���أ�
		��������ͬ���뷵��ֵ�����޹أ����췽��û�з���ֵ����ֻ�������б�
	���췽��ע�����
		1���������û�и������췽����ϵͳ���Զ��ṩһ���޲ι��췽��
		2��������Ǹ������췽����ϵͳ�������Զ��ṩĬ���޲ι��췽��
		ע�⣺��û����Լ������޲ι��췽��
*/

class Person {
	private String name;
	private int age;

	public Person() {
		System.out.println("�ղεĹ���");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("�вεĹ���");	
	}

	public void show() {
		System.out.println(name + "...." + age);
	}
}
