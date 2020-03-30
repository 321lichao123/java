/**
	继承
		让类与类之间产生关系，子父类
	继承的好处
		提高代码的复用性
		提高代码的维护性
		让类与类之间产生关系，是多态的前提
	继承的弊端
		类的耦合性增强
	开发原则
		高内聚，低耦合
		内聚：就是自己完成某件事的能力
		耦合：类与类的关系
	继承特点：
		java只支持单继承，不支持多继承（一个儿子只能有一个爹）
		java支持多层继承
	继承的注意事项：
		子类只能继承父类所有非私有的成员
		子类不能继承父类的构造方法，但是可以通过super关键字去访问父类的构造方法
		不要为了部分功能而去继承
*/
class Demo2 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		Cat c = new Cat();
		c.color = "黄色";
		c.age = 4;
		c.eat();
		c.sleep();
	}
}

class Animal{
	String color;
	int age;

	public void eat() {
		System.out.println("吃饭");
	}
	public void sleep() {
		System.out.println("睡觉");
	}
}
class Cat extends Animal{
}
class Dog extends Animal{
}