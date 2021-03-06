class Demo1 {
	/*
		面向对象（多态的概述及其代码体现）
			多态概述
				事物存在的多种形态
			多态提前
				要有继承关系
				要有方法重写
				要有父类引用子类对象
	*/
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		Animal a = new Cat();	// 父类引用指向子类对象
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
}