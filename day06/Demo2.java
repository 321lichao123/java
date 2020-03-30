class Demo2 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		Person p1 = new Person();
		p1.show();
		System.out.println("=======================================");
		Person p2 = new Person("张三", 23);
		p2.show();
	}
}

/*
	重载：
		方法名相同，与返回值类型无关（构造方法没有返回值），只看参数列表
	构造方法注意事项：
		1、如果我们没有给出构造方法，系统将自动提供一个无参构造方法
		2、如果我们给出构造方法，系统将不在自动提供默认无参构造方法
		注意：最好还是自己给出无参构造方法
*/

class Person {
	private String name;
	private int age;

	public Person() {
		System.out.println("空参的构造");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("有参的构造");	
	}

	public void show() {
		System.out.println(name + "...." + age);
	}
}
