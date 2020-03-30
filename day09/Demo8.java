class Demo8 {
	public static void main(String[] args) {
		Cat c = new Cat("加菲猫", 8);
		c.eat();
		c.sleep();
		Jumping jm = new JumpCat("猫", 6);
		jm.jump();
	}
}

abstract class Animal {
	private String name;
	private int age;
	
	public Animal() {};

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public abstract void eat();

	public abstract void sleep();
}

interface Jumping {
	public abstract void jump();
}

class Cat extends Animal {
	public Cat() {};

	public Cat(String name, int age) {
		super(name, age);
	}
	
	public void eat() {
		System.out.println("猫吃鱼");
	}

	public void sleep() {
		System.out.println("猫侧着睡");
	}
}

class JumpCat extends Cat implements Jumping{
	public JumpCat() {};

	public JumpCat(String name, int age) {
		super(name, age);
	}
	public void jump() {
		System.out.println("这是一个跳高的毛");
	}
}
