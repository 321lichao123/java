class Demo4 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");

		/*
			�ڿ�����һ�㲻ʹ�ø���Ӧ��������󣬶���ֱ��ͨ�����ഴ����������㣬����ʹ���������е����Ժ���Ϊ
			����Ϊ����ʹ�ö�̬�����Ϊ��չ��ǿ
		*/
		method(new Cat());
		method(new Dog());
	}

	public static void method(Animal a) {
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

	public static void catchMouth() {
		System.out.println("èץ����");
	}
}

class Dog extends Animal {
	public void eat(){
		System.out.println("���Թ�ͷ");
	}
}
