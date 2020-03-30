/*
	this与super的区别：
		1、this代表当前对象的引用，super代表当前父类的引用
		2、调用成员变量
			this.成员变量 调用本类的成员变量，也可以调用分类的成员变量
			super.成员变量 调用父类的成员变量
		3、调用构造方法
			this(...)	调用本类的构造方法
			super(...)	调用父类的构造方法
		4、调用成员方法
			this.成员方法 调用本类的方法，也可以调用父类的方法
			super.成员方法	调用父类的方法

	子类中所有的构造方法默认都会访问父类中空参的构造方法。
		因为子类会继承父类的数据，可能还会使用父类的数据。所以子类初始化之前一定会先完成父类数据的初始化
	其实每一个构造方法的第一条语句默认都是：super() Object类最顶层的父类
*/

class Demo3 {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
