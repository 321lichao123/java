class Demo4 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");

		/*
			在开发中一般不使用父类应用子类对象，都是直接通过子类创建对象更方便，可以使用子类特有的属性和行为
			当作为参数使用多态最好因为扩展性强
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
		System.out.println("动物吃饭");
	}
}

class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}

	public static void catchMouth() {
		System.out.println("猫抓老鼠");
	}
}

class Dog extends Animal {
	public void eat(){
		System.out.println("狗吃骨头");
	}
}
