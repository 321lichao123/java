class Demo1 {
	public static void main(String[] args) {
// 		System.out.println("Hello World!");
		Person p = new Person();
		// p.Person()     构造方法不能使用对象调用
	}
}
/*
			构造方法概述和作用
				给对象的数据（属性）进行初始化
			构造方法格式特点
				方法名与类名相同
				没有返回值类型连void都没有
				没有具体的返回值return
		*/
class  Person {
	private String name;
	private int age;
	// 构造方法
	public Person() {
		System.out.println("Hello World!");
	}
}