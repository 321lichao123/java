class Demo6 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		Person p1 = new Person();
		p1.name = "����";
		p1.country = "�й�";

		Person p2 = new Person();
		p2.name = "����";
				
		p1.speak();
		p2.speak();
	}	
}
/*
	class Person�����ڴ�ķ���������һ�� Person.class�����������о�̬���ͷǾ�̬����ʹ��static�ؼ��������Ķ����ھ�̬��
*/
class Person {
	String name;	 // ����  ����˽������ ����Ҫͨ��get��set������ȡ��������ֵ
	static String country;  // ����  ��̬�����൱�ڽ����Է��������й����˲���Ҫ�ظ�����

	public void speak() {
		System.out.println(name + "..." + country);
	}
}

/*
	static��̬��Դ���ص㣺
		1����������ض�����
		2�������ڶ������
		3����������ж�����
			���ĳһ����Ա�����Ǳ����ж�������ô��Ӧ�ñ�����Ϊ��̬
		4������ͨ�����͵���
			����ͨ���������
			�Ƽ�ʹ�����͵���
*/