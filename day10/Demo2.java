/*
	内部类概述：
		在类内部定义类叫内部类
	内部类访问特定
		内部类可以直接访问外部类的成员，包括私有
		外部类要访问内部的成员，必须创建对象
		外部类名.内部类名 对象名 = 外部类对象.内部类对象
*/
class Demo2 {
	public static void main(String[] args) {
		Outer.Inner i = new Outer().new Inner();
		i.method();
	}
}

class Outer {
	class Inner{
		public void method() {
			System.out.println("内部方法");
		}
	}
}
