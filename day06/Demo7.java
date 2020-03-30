/*
	static的注意事项：
		1、在静态方法中是没有this关键字的
			静态是随着类的加载而加载的，而this是随着对象的创建而存在
			静态比对象先存在
		2、静态方法只能访问静态成员变量和静态的成员方法
			静态方法：
				成员变量：只能访问静态变量
				成员方法：只能访问静态成员方法
			非静态方法：
				成员变量：可以是静态变量也可以是非静态的
				成员方法：可以是静态的成员方法，也可以是非静态的成员方法
			简单记：
				静态只能访问静态
*/
/*
	静态变量和成员变量的区别：
		静态变量也叫类变量，成员变量也叫对象变量
		1、所属不同
			静态变量属于类，所以称为类变量
			成员变量属于对象，所以称为实例变量(对象变量)
		2、内存位置不同
			静态变量存储于方法区的静态区
			成员变量存储于堆内存区
		3、内存出现时间不同
			静态类随着类的加载而加载，随着类的消失而消失
			成员变量随着对象的创建而存在，随着对象的消失而消失
		4、调用不同
			静态变量既可以通过类型调用也可以通过对象调用
			成员变量只能通过对象名调用
*/


class Demo7 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		// StaticDemo d = new StaticDemo();
		// d.print1();
		StaticDemo.print2();
	}
}

class StaticDemo{
	int num1 = 10;
	static int num2 = 20;

	/* public void print1(){			// 非静态方法
		System.out.println(num1);
		System.out.println(num2);
	} */

	public static void print2() {       // 静态方法
		// System.out.println(num1);
		System.out.println(num2);
	}
}
