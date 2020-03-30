class Demo5 {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
	}
}

/*
	抽象类特点：
		抽象类和抽象方法前面必须加abstract关键词修饰
			abstract class 类型 {}
			public abstract void 方法名 {}
		抽象类不一定有抽象方法，但是抽象方法一定有抽象类或者接口
		抽象类不能实例化，怎么实例化了？
			按照多态的方法实力化，有具体的子类实例化。其实也是多态的一种，抽象类多态
		抽象类子类
			要么是抽象类
			要么重写抽象类中的所有方法
*/
/*	抽象类的成员特点：
		成员变量：
			既可以是变量，也可以是常量。abstract是否可以修饰成员变量？不能修饰成员变量
		构造方法：有	
			用子类访问父类的初始化
		成员方法：
			既可以是抽象也可以是非抽象的
	抽象类的成员方法特性：
		抽象方法强制子类做的事
		非抽象方法子类继承的事情提高代码复用性
*/
/*
	一个抽象类如果没有抽象方法，可不可以定位抽象类？如果可以有什么意义
		可以。这样做的目的只有一个就是不让其他类创建本类对象，交于子类完成
	abstract关键字不能与那些关键字共存
		static和abstract不能共存
			abstract修饰方法没有方法体
			static可以通过类名.调用，但是类名.抽象方法是没有意义的
		final和abstract不能共存
			被abstract修饰方法强制子类重写
			被final修饰的不让子类重写
		private和abstract不能共存
			被abstract修饰的为了让子类看到并强制重写
			被private修饰不让子类重写的
*/
abstract class Anmial {
	public abstract void eat();
}

class Cat extends Anmial {
	public void eat() {
		System.out.println("AAAA");
	}
}