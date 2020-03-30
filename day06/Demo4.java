class Demo4 {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		/*
			面向对象创建步骤：
				Student s = new Student();
				1、Student.class加载进内存
				2、声明一个Student类型引用
				3、在堆内存创建对象
				4、给对象中属性默认初始值
				5、属性进行显示初始化
				6、构造方法进栈，对对象中属性赋值，构造方法弹栈
				7、将对象的地址值赋值给s
		*/
		Student s = new Student();
		s.show();
	}
}

class Student {
	private String name = "zhangsan";
	private int age = 23;

	public Student() {
		name = "李四";
		age = 24;
	}

	public void show() {
		System.out.println(name + "  "+ age);
	}

}
