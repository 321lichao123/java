class Demo3 {
	public static void main(String[] args) {
		Person p = new SuperMan();				// 父类引用指向子类对象就是向上转型
		System.out.println(p.name);
		p.take();

		SuperMan sm = (SuperMan)p;				// 向下转型， 必须要先有向上转型才有向下转型
		sm.fly();

		/*
			基本类型自动提升和强制类型转换
			int a = 10;
			byte b = 20;
			i = b;			// 自动类型提升
			b = (byte)i;	// 强制类型转换
		*/

		/*
			多态的好处与弊端：
				好处：
					提高了代码的维护性（继承性保证）
					提高代码的扩展性（由多态保证）
				弊端：
					不能使用子类的特有的属性和行为（必须向下转型才可以）
		*/
	}
}

class Person{
	String name = "John";
	public void take() {
		System.out.println("谈生意");
	}
}

class SuperMan extends Person{
	String name = "superMan";
	public void take() {
		System.out.println("谈大生意");
	}
	public void fly() {
		System.out.println("飞起来救人");
	}
}
