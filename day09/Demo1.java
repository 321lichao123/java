class Demo1 {
	/*
		������󣨶�̬�ĸ�������������֣�
			��̬����
				������ڵĶ�����̬
			��̬��ǰ
				Ҫ�м̳й�ϵ
				Ҫ�з�����д
				Ҫ�и��������������
	*/
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		Animal a = new Cat();	// ��������ָ���������
		a.eat();
	}
}

class Animal {
	public void eat() {
		System.out.println("����Է�");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("è����");
	}
}