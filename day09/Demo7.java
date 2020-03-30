class Demo7 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}

/*
	类与类，类与接口，接口与接口之间的关系：
		类与类：
			继承关系，只能单向继承，可以多层继承
		类与接口
			实现关系，可以单向继承，也可以多层继承
			并且还可以在继承一个类的同时实现多个接口
		接口与接口
			继承关系，可以单继承，也可以多继承
*/
/*
	接口与抽象类的区别
		抽象类：
			成员变量：可以变量也可以是常量
			构造方法：有
			成员方法：可以抽象，也可以非抽象
		接口：
			成员变量：只能是常量
			构造方法：没有
			成员方法：可以抽象
*/
/*	
	设计理念区别：
		抽象类 被继承体现是："is a"的关系。抽象类定义的是该继承体系的共性功能
		接口 被实现体现是： "like a"的关系。接口中定义的是该继承体系的扩展
*/

interface InterA {
	public abstract void printA();
}

interface InterB {
	public abstract void printB();
}

interface InterC extends InterA, InterB {

}

class Demo extends Object implements InterA, InterB {
	public void printA() {
		System.out.println("继承接口A");
	}
	public void printB() {
		System.out.println("继承接口B");
	}
}

