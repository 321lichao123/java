class Demo6 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		Person p1 = new Person();
		p1.name = "李四";
		p1.country = "中国";

		Person p2 = new Person();
		p2.name = "张三";
				
		p1.speak();
		p2.speak();
	}	
}
/*
	class Person会在内存的方法区创建一个 Person.class的区域，其中有静态区和非静态区，使用static关键字声明的都放在静态区
*/
class Person {
	String name;	 // 姓名  不是私有属性 不需要通过get和set方法获取设置属性值
	static String country;  // 国籍  静态属性相当于将属性房贷方法中公用了不需要重复创建

	public void speak() {
		System.out.println(name + "..." + country);
	}
}

/*
	static静态资源的特点：
		1、随着类加载而加载
		2、优先于对象存在
		3、被类的所有对象共享
			如果某一个成员变量是被所有对象共享，那么就应该被定义为静态
		4、可以通过类型调用
			可以通过对象调用
			推荐使用类型调用
*/